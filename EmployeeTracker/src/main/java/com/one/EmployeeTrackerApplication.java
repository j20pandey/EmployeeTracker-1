package com.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTrackerApplication.class, args);
		
		System.out.println("Employee Tracker Spring Boot Project Started");
	}

}
