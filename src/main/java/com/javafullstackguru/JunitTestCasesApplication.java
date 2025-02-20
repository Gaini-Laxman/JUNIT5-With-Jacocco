package com.javafullstackguru;

//Open cmd in project location and give command : [ mvn test jacoco:report ] add jacocco plugin


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitTestCasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitTestCasesApplication.class, args);
	}

}
