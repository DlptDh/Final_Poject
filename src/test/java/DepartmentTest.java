import org.example.Department;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {
    @Test
    public void testValidDepartmentName() {
        assertTrue(Department.validateDepartmentName("Computer Science"));
    }

    @Test
    public void testInvalidDepartmentName() {
        assertFalse(Department.validateDepartmentName("Computer Science 101"));
    }

    @Test
    public void testDepartmentConstructorValidName() {
        Department department = new Department("Computer Science");
        assertNotNull(department);
        assertEquals("D01", department.getDepartmentId());
        assertEquals("Computer Science", department.getDepartmentName());
    }

    @Test
    public void testDepartmentConstructorInvalidName() {
        Department department = new Department("Computer Science 101");
        assertNull(department.getDepartmentId());
        assertNull(department.getDepartmentName());
    }

    @Test
    public void testToString() {
        Department department = new Department("Computer Science");
        assertEquals("Department{departmentId='D01', departmentName='Computer Science'}", department.toString());
    }
}
