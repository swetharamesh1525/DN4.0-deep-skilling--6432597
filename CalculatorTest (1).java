import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAdd() {
        int a = 10;
        int b = 5;


        int result = calculator.add(a, b);

        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int a = 10;
        int b = 5;
        int result = calculator.subtract(a, b);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int a = 10;
        int b = 5;

        int result = calculator.multiply(a, b);

        assertEquals(50, result);
    }

    @Test
    public void testDivide() {
        int a = 10;
        int b = 5;

        int result = calculator.divide(a, b);
        assertEquals(2, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 10;
        int b = 0;
        calculator.divide(a, b);
    }
}
