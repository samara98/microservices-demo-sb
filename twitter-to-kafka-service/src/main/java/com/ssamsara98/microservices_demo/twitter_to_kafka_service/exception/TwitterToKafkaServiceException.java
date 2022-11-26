package com.ssamsara98.microservices_demo.twitter_to_kafka_service.exception;

public class TwitterToKafkaServiceException extends RuntimeException {

	public TwitterToKafkaServiceException() {
		super();
	}

	public TwitterToKafkaServiceException(String message) {
		super(message);
	}

	public TwitterToKafkaServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}
