package com.ecommerce.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@ComponentScan(basePackages = {"com.ecommerce"})
@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class ApplicationStarter extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStarter.class, args);
	}
}
