package com.smartcode.audit_trail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class AuditTrailApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditTrailApplication.class, args);
	}

}
