package com.optimissa.totrade.forextracking.integration.estrategias.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.optimissa.totrade.forextracking.integration.estrategias")
@SpringBootApplication
public class SpringBootSoapWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWebServicesApplication.class, args);
	}
}
