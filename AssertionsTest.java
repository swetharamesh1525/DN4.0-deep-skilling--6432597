import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        assertEquals("Addition result should be 5", 5, 2 + 3);

        assertTrue("5 should be greater than 3", 5 > 3);

        assertFalse("5 should not be less than 3", 5 < 3);

        assertNull("The value should be null", null);

        assertNotNull("The value should not be null", new Object());
    }

    @Test
    public void testArrayAssertions() {

        int[] expectedArray = {1, 2, 3};
        int[] actualArray = {1, 2, 3};
        assertArrayEquals("Arrays should be equal", expectedArray, actualArray);
    }

    @Test
    public void testSameAndNotSame() {
        String str = "JUnit";
        assertSame("Both references should point to the same object", str, str);


        assertNotSame("References should not point to the same object", new String("JUnit"), new String("JUnit"));
    }
}
