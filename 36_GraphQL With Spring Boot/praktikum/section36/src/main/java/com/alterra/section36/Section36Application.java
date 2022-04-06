package com.alterra.section36;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class Section36Application {

	private static Logger logger = LoggerFactory.getLogger(Section36Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Section36Application.class, args);


	logger.info("Application is running");
}

}
