package com.chandimal.springsecurityexample;

import com.chandimal.springsecurityexample.controller.AuthController;
import com.chandimal.springsecurityexample.service.CustomUserDetailsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = CustomUserDetailsService.class)
public class SpringsecurityexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityexampleApplication.class, args);
	}

}
