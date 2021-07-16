package com.digitalinnovation.PersonAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PersonAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonAPIApplication.class, args);
	}

}
