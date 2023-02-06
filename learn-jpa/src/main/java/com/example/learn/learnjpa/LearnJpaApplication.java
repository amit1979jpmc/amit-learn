package com.example.learn.learnjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages ="com.example.learn.*")
@Configuration
public class LearnJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaApplication.class, args);
	}

}
