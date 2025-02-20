Junit5 : TestClass
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
====================================================================================================
public class PalidromeTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"madam","liril"})
	public void testIsPalidrome(String s) {
	    PalidromeCheck pc = new PalidromeCheck();
		boolean actualResult = pc.isPalidrome(s);
		assertTrue(actualResult);
	}

}
========================================================================================================
![image](https://github.com/user-attachments/assets/1938214e-a77b-4837-967f-82c485468b4a)

========================================================================================================
![image](https://github.com/user-attachments/assets/ba079c05-a695-486e-993a-dccb1677e64f)

=======================================================================================================
![image](https://github.com/user-attachments/assets/1b2feefd-0f29-4ee1-885c-7f91c68cdd11)

Sonar Qube  :  mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=password

![image](https://github.com/user-attachments/assets/27702628-6a6d-472f-ad42-435ebce8830e)
==========================================================================================

![image](https://github.com/user-attachments/assets/47bf6399-a54a-4e46-a580-2a3ac3fdc981)









