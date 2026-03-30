package com.Aryan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This is the "Engine" that starts the Spring Boot server on Port 8080.
public class SpringBootRestApplication {

	public static void main(String[] args) {
		// This line starts the entire project and scans for all your @RestController URLs!
		SpringApplication.run(SpringBootRestApplication.class, args);
	}

}
