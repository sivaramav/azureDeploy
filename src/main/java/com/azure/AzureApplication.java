package com.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}
	
	@GetMapping("/azure")
	public String  deploy() {
		
		return "deployed end point in azure";
	}

}
