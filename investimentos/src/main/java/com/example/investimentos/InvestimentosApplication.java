package com.example.investimentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class InvestimentosApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("SERVER_PORT", dotenv.get("SERVER_PORT", "8080"));
		SpringApplication.run(InvestimentosApplication.class, args);
	}

}
