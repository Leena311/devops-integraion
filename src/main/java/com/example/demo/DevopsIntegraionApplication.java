package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DevopsIntegraionApplication {
	
	@GetMapping
	public String message() {
		return "welcome to jenkins pipeline";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegraionApplication.class, args);
	}

}
