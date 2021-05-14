package com.innervation.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= { "com.innervation.order.config", "com.innervation.order.service" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
