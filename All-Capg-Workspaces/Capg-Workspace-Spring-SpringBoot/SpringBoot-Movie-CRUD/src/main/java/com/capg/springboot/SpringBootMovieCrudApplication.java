package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
STEP 1:
@SpringBootApplication is the main annotation of Spring Boot.
It combines:
1. @Configuration
2. @EnableAutoConfiguration
3. @ComponentScan
*/

@SpringBootApplication
public class SpringBootMovieCrudApplication {

	/*
	STEP 2:
	Main method is the entry point of the Spring Boot application.
	It starts the embedded server (Tomcat).
	*/
	public static void main(String[] args) {

		SpringApplication.run(SpringBootMovieCrudApplication.class, args);
		System.out.println("Server Started ");

		/*
		STEP 3:
		SpringApplication.run() bootstraps the application
		and launches the Spring Boot context.
		*/
	}
}