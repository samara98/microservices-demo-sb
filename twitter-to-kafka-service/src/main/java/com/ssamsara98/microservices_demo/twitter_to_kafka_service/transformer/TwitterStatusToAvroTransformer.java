package com.ssamsara98.microservices_demo.twitter_to_kafka_service.transformer;

import com.ssamsara98.microservices_demo.kafka_avro_model.TwitterAvroModel;
import org.springframework.stereotype.Component;
import twitter4j.Status;

@Component
public class TwitterStatusToAvroTransformer {

	public TwitterAvroModel getTwitterAvroModelFromStatus(Status status) {
		return TwitterAvroModel
			.newBuilder()
			.setId(status.getId())
			.setUserId(status.getUser().getId())
			.setText(status.getText())
			.setCreatedAt(status.getCreatedAt().getTime())
			.build();
	}
}
