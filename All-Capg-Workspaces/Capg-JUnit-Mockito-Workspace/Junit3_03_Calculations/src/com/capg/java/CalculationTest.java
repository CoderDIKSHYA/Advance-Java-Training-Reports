package com.capg.java;

import junit.framework.TestCase;

public class CalculationTest extends TestCase {

    Calculation calculator;

    // Runs before test
    protected void setUp() {
        calculator = new Calculation();
    }

    // THIS IS THE SINGLE TEST METHOD
    public void testAllOperations() {

        // Test Addition
        assertEquals(5, calculator.addition(2, 3));

        // Test Subtraction
        assertEquals(5, calculator.subtraction(10, 5));

        // Test Multiplication
        assertEquals(12, calculator.multiplication(4, 3));

        // Test Division
        assertEquals(5, calculator.division(10, 2));
    }

    // Runs after test
    protected void tearDown() {
        calculator = null;
    }
}
