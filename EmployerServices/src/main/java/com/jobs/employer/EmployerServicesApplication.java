package com.jobs.employer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jobs.employer.controllers")
public class EmployerServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployerServicesApplication.class, args);
	}

}
