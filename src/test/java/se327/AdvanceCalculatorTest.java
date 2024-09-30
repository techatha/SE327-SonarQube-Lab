package se327;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class AdvanceCalculatorTest {
    @Test
    void testPower(){
        AdvanceCalculator calculator = new AdvanceCalculator();
        assertEquals(8.0, calculator.power(2, 3), .01);
    }
    @Test
    void testSqrt(){
        AdvanceCalculator calculator = new AdvanceCalculator();
        assertEquals(2.0, calculator.sqrt(4), .01);
    }
}
