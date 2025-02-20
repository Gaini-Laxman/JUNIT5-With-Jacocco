package com.javafullstackguru.testclass;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.javafullstackguru.unitTestCases.PalidromeCheck;

//Open cmd in project location and give command : [ mvn test jacoco:report ] add jacocco plugin
// mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=password


public class PalidromeTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"madam","liril"})
	public void testIsPalidrome(String s) {
	    PalidromeCheck pc = new PalidromeCheck();
		boolean actualResult = pc.isPalidrome(s);
		assertTrue(actualResult);
	}

}
