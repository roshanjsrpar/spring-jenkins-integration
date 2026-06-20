package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsIntegrationApplication {
	
	@GetMapping("/wishmessage")
	public String wishMessage() {
		return "Welcome to first web page";
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to web page";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
