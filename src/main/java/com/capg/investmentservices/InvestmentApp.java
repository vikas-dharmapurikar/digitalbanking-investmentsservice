package com.capg.investmentservices;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class InvestmentApp {

	private static Logger log = Logger.getLogger(InvestmentApp.class);
	public static void main(String[] args) throws Exception {
		 SpringApplication.run(InvestmentApp.class, args);
	}
}