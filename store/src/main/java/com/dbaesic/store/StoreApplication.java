package com.dbaesic.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Main class for starting the DBaesic Store Application.
 *
 * @author Amiel De Los Reyes
 */
@SpringBootApplication
@EntityScan(basePackages = "com.dbaesic.store.entity")
public class StoreApplication {

	/**
	 * Main method to run the Spring Boot application.
	 *
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

}
