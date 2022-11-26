package com.ssamsara98.microservices_demo.twitter_to_kafka_service.runner;

import twitter4j.TwitterException;

public interface StreamRunner {
	void start() throws TwitterException;
}

