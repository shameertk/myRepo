package com.shatk.rez.availability;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shatk.rez.availability.endpoints.AvailabilityEndPoint;

/**
 * 
 * @author shatk
 * @date   july 2016
 *
 */

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootJerseyApp {

	private static final Logger logger = LoggerFactory.getLogger(AvailabilityEndPoint.class);
	
	public static void main(String[] args) {		
		SpringApplication.run(SpringBootJerseyApp.class, args);
		logger.info("----- SpringBootJerseyApp: booted ----- " );
	}
}
