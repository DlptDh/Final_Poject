import org.junit.jupiter.api.Test;
import util.Util;

import static org.junit.jupiter.api.Assertions.*;

public class UtilTest {
    @Test
    public void testToTitleCase() {
        assertEquals("Lionel Messi", Util.toTitleCase("lionel messi"));
        assertEquals("Computer Science", Util.toTitleCase("COMPUTER SCIENCE"));
        assertEquals("Programming 101", Util.toTitleCase("programming 101"));
        assertEquals("John Doe", Util.toTitleCase("JOHN DOE"));
    }
}