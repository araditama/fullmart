package com.filkom.aae.fullmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"Controller"})
public class FullmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullmartApplication.class, args);
	}
}
