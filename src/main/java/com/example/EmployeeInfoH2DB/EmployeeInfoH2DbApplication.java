package com.example.EmployeeInfoH2DB;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeeInfoH2DbApplication {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeInfoH2DbApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(EmployeeInfoH2DbApplication.class, args);
		logger.info("Info");
		logger.warn("Warn");
		logger.debug("Debug");
	}

}
