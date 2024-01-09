import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorUITest {

    @Test
    public void testAddition() {
        CalculatorUI calculator = new CalculatorUI();
        double result = calculator.calculate(3, 4, '+');
        assertEquals(7, result, 0.001); // Assuming a delta for double comparison
    }
}
