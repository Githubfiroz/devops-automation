package com.lwc.devopsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping
	public String message() {return "Dear Guest, <br>&nbsp;&nbsp;&nbsp;&nbsp; Welcome to learn with code !!" ; }
	
	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}

