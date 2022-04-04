package com.example.section22;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class Section22Application {

	private static Logger logger = LoggerFactory.getLogger(Section22Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Section22Application.class, args);

		logger.info("Application is running");
		logger.info("Application debugging is started");
		logger.trace("A trace Message");
		logger.debug("A Debug Message");
		logger.warn("A WARN Message");
		logger.error("An Error Message");

	}

}
