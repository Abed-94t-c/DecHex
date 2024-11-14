import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Before
    public void setUp() {
        // Any setup can be done here if needed
    }

    @Test
    public void testConvertToHex() {
        assertEquals("Hexadecimal of 255 should be FF", "FF", Dec2Hex.convertToHex(255));
        assertEquals("Hexadecimal of 16 should be 10", "10", Dec2Hex.convertToHex(16));
        assertEquals("Hexadecimal of 1 should be 1", "1", Dec2Hex.convertToHex(1));
    }

    @Test
    public void testConvertZero() {
        assertEquals("Hexadecimal of 0 should be empty", "", Dec2Hex.convertToHex(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Hexadecimal of a negative number should be empty", "", Dec2Hex.convertToHex(-10));
    }
}
