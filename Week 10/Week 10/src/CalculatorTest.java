// CalculatorTest.java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "Penjumlahan 2 + 3 harus menghasilkan 5");
    }

    @Test
    public void testAddWithNegativeNumbers() {
        int result = calculator.add(-2, -3);
        assertEquals(-5, result, "Penjumlahan -2 + -3 harus menghasilkan -5");
    }

    @Test
    public void testAddWithZero() {
        int result = calculator.add(0, 0);
        assertEquals(0, result, "Penjumlahan 0 + 0 harus menghasilkan 0");
    }
}
