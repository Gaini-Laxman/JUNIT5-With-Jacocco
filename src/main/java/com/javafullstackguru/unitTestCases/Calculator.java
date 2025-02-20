package com.javafullstackguru.unitTestCases;

 //Open cmd in project location and give command : [ mvn test jacoco:report ] add jacocco plugin
 // mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=password

public class Calculator {
	
	public int add (int i, int j) {
		return i + j;
	}
	
	public int multiply(int i, int j) {
		return i*j;
	}
	

}
