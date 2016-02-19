package cse360assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);				//Ensures object is actually created
	}

	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal()); //Ensures it's grabbing total
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(15);
		assertEquals(15, calc.getTotal()); //Ensures it's adding correctly
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.add(15);
		calc.subtract(10);
		assertEquals(5, calc.getTotal()); //Ensures it subtracts correctly
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(15);
		calc.multiply(10);
		assertEquals(150, calc.getTotal()); //Ensures it multiplies correctly
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(27);
		calc.divide(5);
		assertEquals(5, calc.getTotal()); //Ensures it does integer division
	}
	
	@Test
	public void testDivideByZero() {
		Calculator calc = new Calculator();
		calc.add(27);
		calc.divide(0);
		assertEquals(0, calc.getTotal()); //Allows for divide by zero
	}

	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();			
		assertEquals("0", calc.getHistory()); //Ensures History works for no actions		
	}
	
	@Test
	public void testGetHistoryTwo() {
		Calculator calc = new Calculator();	
		calc.add(5);
		calc.subtract(2);
		calc.multiply(3);
		calc.divide(0);
		assertEquals("0 + 5 - 2 * 3 / 0", calc.getHistory()); //Ensures formatting is good for every action		
	}

}
