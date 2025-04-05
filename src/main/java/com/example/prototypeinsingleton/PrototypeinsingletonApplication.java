package com.example.prototypeinsingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeinsingletonApplication implements CommandLineRunner {

	@Autowired
	private A1 a1;

	@Autowired
	private A2 a2;

	@Autowired
	private A3 a3;

	public static void main(String[] args) {

		SpringApplication.run(PrototypeinsingletonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--- Calling A1 twice ---");
		a1.run();
		a1.run();

		System.out.println("\n--- Calling A2 twice ---");
		a2.run();
		a2.run();

		System.out.println("\n--- Calling A3 twice ---");
		a3.run();
		a3.run();
	}
}
