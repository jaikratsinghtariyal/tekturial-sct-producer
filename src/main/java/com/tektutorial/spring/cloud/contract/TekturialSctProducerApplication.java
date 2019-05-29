package com.tektutorial.spring.cloud.contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.tektutorial.spring.cloud.contract")
@SpringBootApplication
public class TekturialSctProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TekturialSctProducerApplication.class, args);
	}

}
