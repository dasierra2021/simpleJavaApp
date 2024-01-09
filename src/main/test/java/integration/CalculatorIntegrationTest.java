import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CalculatorIntegrationTest {

    @Test
    public void testCalculatorWithThemeLoading() {
        CalculatorUI calculator = new CalculatorUI();
        // Perform actions on the calculator that involve theme loading
        assertTrue(calculator.getThemesMap().size() > 0);
    }
}
