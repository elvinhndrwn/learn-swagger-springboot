package com.infosys.learnswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
public class LearnSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSwaggerApplication.class, args);
	}

}
