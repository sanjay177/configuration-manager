package com.basic.boot.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ConfigMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigMainApplication.class, args);
	}

}