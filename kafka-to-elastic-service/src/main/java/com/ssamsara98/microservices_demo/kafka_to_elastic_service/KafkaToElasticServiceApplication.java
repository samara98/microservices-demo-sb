package com.ssamsara98.microservices_demo.kafka_to_elastic_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ssamsara98.microservices_demo")
public class KafkaToElasticServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaToElasticServiceApplication.class, args);
	}
}
