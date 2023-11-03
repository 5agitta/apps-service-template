package com.sagitta.servicetemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceTemplateApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceTemplateApplication.class, args);
	}
	
}
