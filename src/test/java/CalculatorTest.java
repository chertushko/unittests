import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalculatorTest {
    private static Calculator suite = new Calculator();

    @BeforeAll
    public static void startTests() {
        System.out.println("Starting testing " + LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");
    }

    @AfterEach
    public void finishTest() {
        System.out.println("Test complete");
    }

    @Test
    public void testPow() {
        final int x = 3;
        final int exected = 9;
        int result = suite.pow.apply(x);
        assertEquals(exected, result);
    }

    @Test
    public void testIsPositive() {
        final int x = 3;
        assertFalse(suite.isPositive.test(x *( -1)));
        assertTrue(suite.isPositive.test(x));

    }
    @Test
    public void testMinus() {
        final int x = 3;
        final int y = 1;
        int exected = 2;
        int result = suite.minus.apply(x, y);
        assertEquals(result, exected);
        assertTrue(exected == result);

    }

    @AfterAll
    public static void completeTests() {
        System.out.println("Testing completed " + LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
    }
}
