package com.example.Login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication {
	//TODO passwords hash them validate them
	//TODO Users validate they exist when login
	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}
