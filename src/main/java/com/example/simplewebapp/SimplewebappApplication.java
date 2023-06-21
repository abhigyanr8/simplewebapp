package com.example.simplewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimplewebappApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SimplewebappApplication.class, args);
	}
	@GetMapping("/")
	String getHelloworld()
	{
		return "Hello World";
	}

}
