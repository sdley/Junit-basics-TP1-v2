package sn.sdley;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test addition")
    public void testAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Test soustraction")
    public void testSubstract(){
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    @DisplayName("Test multiplication")
    public void testMultiply(){
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    @DisplayName("Test division")
    public void testDivide(){
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    @DisplayName("Division par zero")
    public void testDivideByZero(){
        try {
            calculator.divide(10, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Division par zero non permise", e.getMessage());
        }
    }

    @Test
    @DisplayName("Test division par zero via assertThrows")
    public void testDivideByZeroViaAssertThrows(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0),
                "La division par zero devrait etre levee avec l'exception IllegalArgumentException");
    }

    @Test
    @DisplayName("Test modulo")
    public void testModulo() {
        assertEquals(1, calculator.modulo(5, 2),
                "Le reste de la division de 5 par 2 devrait etre 1");
    }

    @Test
    @DisplayName("Test modulo par zero")
    public void testModuloByZero() {
        try {
            calculator.modulo(10, 0);
        } catch (IllegalArgumentException e){
            assertEquals("Division par zero non permise", e.getMessage());
        }
    }

    @Test
    @DisplayName("Test modulo assertThrows")
    public void testModuloAssertThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculator.modulo(10, 0),
                "La division par zero devrait etre levee avec l'exception IllegalArgumentException");
    }

    @Test
    @DisplayName("Plusieurs Tests")
    public void testMultipleStatements() {
        assertEquals(3, calculator.add(1, 2));
        assertEquals(1, calculator.add(-1, 2));
        assertEquals(10, calculator.add(calculator.add(2, 3),
                calculator.add(3, 2)));
    }

}
