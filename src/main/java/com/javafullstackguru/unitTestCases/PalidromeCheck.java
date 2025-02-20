package com.javafullstackguru.unitTestCases;

//Open cmd in project location and give command : [ mvn test jacoco:report ] add jacocco plugin
// mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=password

public class PalidromeCheck {
	public boolean isPalidrome(String s) {
		String reverse = "";
		int length = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (s.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
}
