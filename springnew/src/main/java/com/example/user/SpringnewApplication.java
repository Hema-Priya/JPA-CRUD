package com.example.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@Configuration
@EnableJpaRepositories(basePackages="com.example.user")

@SpringBootApplication
public class SpringnewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringnewApplication.class, args);
	}

}
