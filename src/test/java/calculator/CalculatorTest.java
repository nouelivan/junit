package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void Add() {
		
		Calculator test = new Calculator();
		
		double result = test.Add(3, 4);
		double result2 = test.Add(3.4, 3.1);
		double result3 = test.Add(-4, 1.0);
		
		assertEquals(7, result);
		assertEquals(6.5, result2);
		assertEquals(-3, result3);
	}

	@Test
	void Subtract() {
		
		Calculator test = new Calculator();
		
		double result = test.Subtract(150, 4);
		double result2 = test.Subtract(157.32, 3.1);
		double result3 = test.Subtract(-4.7, -1.5);
		
		
		assertEquals(146, result);
		assertEquals(154.22, result2);
		assertEquals(-3.2, result3);
	}

	@Test
	void Multiply() {
	
		Calculator test = new Calculator();
		
		
		double result = test.Multiply(12, 12);
		double result2 = test.Multiply(11.345, 12);
		double result3 = test.Multiply(-12.5, -1.0);
		
		
		assertEquals(144, result);
		assertEquals(136.14, result2);
		assertEquals(12.5, result3);
	}

	@Test
	void Divide() {
		
		Calculator test = new Calculator();
		
		double result = test.Divide(12, 1);
		double result2 = test.Divide(36.0, 6);
		double result3 = test.Divide(-12.5, -4.0);
		
		
		assertEquals(12, result);
		assertEquals(6, result2);
		assertEquals(3.12, result3);
	}


}
