package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class HelloWorld {

	@GetMapping("/")
		public String helloworld
	{
		return "Hello World";
	}
}
