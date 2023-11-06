package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    @Test
    @DisplayName("Control Sum")
    void TestSum() {
        float result = Calculator.add(2, 2);
        assertEquals(4, result);
        assertNotEquals(5, result);
    }

    @Test
    @DisplayName("Control Subtract")
    void TestSubtract() {
        float result = Calculator.subtract(2, 2);
        assertEquals(0, result);
        assertNotEquals(4, result);
    }

    @Test
    @DisplayName("Control Multiply")
    void TestMultiply() {
        float result = Calculator.multiply(2, 2);
        assertEquals(4, result);
        assertNotEquals(5, result);
    }

    @Test
    @DisplayName("Control Divide")
    void TestDivide() {
        float result = Calculator.divide(2, 2);
        assertEquals(1, result);
        assertNotEquals(4, result);
    }
}

