package com.ssamsara98.microservices_demo.kafka_admin.exception;

/**
 * Exception class for Kafka client error situations.
 */
public class KafkaClientException extends RuntimeException {

	public KafkaClientException() {
	}

	public KafkaClientException(String message) {
		super(message);
	}

	public KafkaClientException(String message, Throwable cause) {
		super(message, cause);
	}
}
