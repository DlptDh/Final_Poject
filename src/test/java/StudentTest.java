import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void testStudentConstructor() {
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "A1B2C3", "Canada");
        Department department = new Department("Computer Science");
        Student student = new Student("Lionel Messi", Gender.MALE, address, department);
        assertNotNull(student);
        assertEquals("S00001", student.getStudentId());
        assertEquals("Lionel Messi", student.getStudentName());
        assertEquals(Gender.MALE, student.getGender());
        assertEquals(address, student.getAddress());
        assertEquals(department, student.getDepartment());
    }

    @Test
    public void testRegisterCourse() {
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "A1B2C3", "Canada");
        Department department = new Department("Computer Science");
        Student student = new Student("Lionel Messi", Gender.MALE, address, department);
        Course course = new Course("Programming 1", 3.0, department);
        assertTrue(student.registerCourse(course));
        assertEquals(1, student.getRegisteredCourses().size());
        assertEquals(student, course.getRegisteredStudents().get(0));
    }

    @Test
    public void testDropCourse() {
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "A1B2C3", "Canada");
        Department department = new Department("Computer Science");
        Student student = new Student("Lionel Messi", Gender.MALE, address, department);
        Course course = new Course("Programming 1", 3.0, department);
        student.registerCourse(course);
        assertTrue(student.dropCourse(course));
        assertEquals(0, student.getRegisteredCourses().size());
        assertEquals(0, course.getRegisteredStudents().size());
    }

    @Test
    public void testToString() {
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "A1B2C3", "Canada");
        Department department = new Department("Computer Science");
        Student student = new Student("Lionel Messi", Gender.MALE, address, department);
        assertEquals("Student{studentId='S00001', studentName='Lionel Messi', gender=MALE, address=123 Main Street, Vancouver, BC, A1B2C3, Canada, department=Department{departmentId='D01', departmentName='Computer Science'}, registeredCourses=[]}", student.toString());
    }
}
