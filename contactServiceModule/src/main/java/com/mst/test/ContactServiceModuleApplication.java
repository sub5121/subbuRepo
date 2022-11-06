package com.mst.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.mst.*")
@Configuration
@SpringBootApplication
public class ContactServiceModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactServiceModuleApplication.class, args);
	}

}
