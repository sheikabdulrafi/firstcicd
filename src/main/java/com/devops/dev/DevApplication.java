package com.devops.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to my world";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevApplication.class, args);
	}

}
