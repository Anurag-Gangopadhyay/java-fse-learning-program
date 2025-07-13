import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyCalculatorTest {

    private MyCalculator calculator;

    // Arrange - Setup method
    @Before
    public void setUp() {
        calculator = new MyCalculator();
        System.out.println("🔷 Setup: Calculator instance created");
    }

    // Act + Assert - Test method
    @Test
    public void testAdd() {
        // Arrange is done in setUp

        // Act
        int result = calculator.add(10, 20);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testSubtract() {
        // Arrange is done in setUp

        // Act
        int result = calculator.subtract(50, 20);

        // Assert
        assertEquals(30, result);
    }

    // Teardown method
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("🔷 Teardown: Calculator instance destroyed");
    }
}
