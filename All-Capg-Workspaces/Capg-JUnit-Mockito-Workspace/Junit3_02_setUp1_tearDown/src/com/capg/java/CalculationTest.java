package com.capg.java;

import junit.framework.TestCase;

public class CalculationTest extends TestCase{

	Calculation calculator;
	
	//Runs before each test method(the setup method)
	protected void setUp() {
		calculator = new Calculation();
	}
	
	//Test method (name must start with 'test')->(the business logic)
	public void testAdd() {
		int result = calculator.addition(2, 3);
		assertEquals(5, result);
	}
	// Runs after each test method ->(destroy method)
	protected void tearDown() {
		calculator = null;
	}
}
