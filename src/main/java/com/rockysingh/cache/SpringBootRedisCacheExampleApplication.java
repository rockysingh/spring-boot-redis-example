package com.rockysingh.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootRedisCacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisCacheExampleApplication.class, args);
	}
}
