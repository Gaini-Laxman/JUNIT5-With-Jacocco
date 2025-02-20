package com.javafullstackguru.testclass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.javafullstackguru.unitTestCases.Calculator;

//Open cmd in project location and give command : [ mvn test jacoco:report ] add jacocco plugin

public class CalculatorTest {
	
	private Calculator c = new Calculator();
	
	@Test
	public void testAdd() {
		int actualResult = c.add(5, 5);
		int expectedResult =  10;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void multiply() {
		int actualResult = c.multiply(5, 5);
		int expectedResult = 25;
		assertEquals(expectedResult, actualResult);
	}

}
