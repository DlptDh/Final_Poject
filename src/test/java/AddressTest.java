import org.example.Address;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {
    @Test
    public void testValidPostalCode6Chars() {
        assertTrue(Address.isPostalCodeValid("A1B2C3"));
    }

    @Test
    public void testValidPostalCode7Chars() {
        assertTrue(Address.isPostalCodeValid("A1B 2C3"));
    }

    @Test
    public void testInvalidPostalCode() {
        assertFalse(Address.isPostalCodeValid("123456"));
    }

    @Test
    public void testAddressConstructorValidPostalCode() {
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "A1B2C3", "Canada");
        assertNotNull(address);
        assertEquals("A1B2C3", address.getPostalCode());
    }

    @Test
    public void testAddressConstructorInvalidPostalCode() {
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "123456", "Canada");
        assertNull(address.getPostalCode());
    }

    @Test
    public void testToString() {
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "A1B2C3", "Canada");
        assertEquals("123 Main Street, Vancouver, BC, A1B2C3, Canada", address.toString());
    }
}
