package com.mst.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@ComponentScan(basePackages = "com.mst.*")
@Configuration
@SpringBootApplication
public class MicroServicesTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesTestApplication.class, args);
	}
   
	@Bean
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	}
}
