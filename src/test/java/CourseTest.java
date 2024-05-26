import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {
    @Test
    public void testCourseConstructor() {
        Department department = new Department("Computer Science");
        Course course = new Course("Programming 1", 3.0, department);
        assertNotNull(course);
        assertEquals("C-D01-01", course.getCourseId());
        assertEquals("Programming 1", course.getCourseName());
        assertEquals(3.0, course.getCredits(), 0.01);
        assertEquals(department, course.getDepartment());
    }

    @Test
    public void testAddAssignment() {
        Department department = new Department("Computer Science");
        Course course = new Course("Programming 1", 3.0, department);
        assertTrue(course.addAssignment("Assignment 1", 0.2, 100));
        assertEquals(1, course.getAssignments().size());
        assertEquals("Assignment 1", course.getAssignments().get(0).getAssignmentName());
    }

    @Test
    public void testRegisterStudent() {
        Department department = new Department("Computer Science");
        Course course = new Course("Programming 1", 3.0, department);
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "A1B2C3", "Canada");
        Student student = new Student("Lionel Messi", Gender.MALE, address, department);
        assertTrue(course.registerStudent(student));
        assertEquals(1, course.getRegisteredStudents().size());
        assertEquals(student, course.getRegisteredStudents().get(0));
    }

    @Test
    public void testGenerateScores() {
        Department department = new Department("Computer Science");
        Course course = new Course("Programming 1", 3.0, department);
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "A1B2C3", "Canada");
        Student student = new Student("Lionel Messi", Gender.MALE, address, department);
        course.addAssignment("Assignment 1", 0.2, 100);
        course.addAssignment("Assignment 2", 0.3, 100);
        course.addAssignment("Final Exam", 0.5, 100);
        course.registerStudent(student);
        course.generateScores();
        assertNotNull(course.getAssignments().get(0).getScores().get(0));
    }

    @Test
    public void testToString() {
        Department department = new Department("Computer Science");
        Course course = new Course("Programming 1", 3.0, department);
        assertEquals("Course{courseId='C-D01-01', courseName='Programming 1', credits=3.0, department=Department{departmentId='D01', departmentName='Computer Science'}, assignments=[], registeredStudents=[]}", course.toString());
    }
}
