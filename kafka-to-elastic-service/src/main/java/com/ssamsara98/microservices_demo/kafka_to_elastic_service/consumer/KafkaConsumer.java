package com.ssamsara98.microservices_demo.kafka_to_elastic_service.consumer;

import com.ssamsara98.microservices_demo.kafka_avro_model.TwitterAvroModel;
import org.apache.avro.specific.SpecificRecordBase;

import java.io.Serializable;
import java.util.List;

public interface KafkaConsumer<K extends Serializable, V extends SpecificRecordBase> {
    void receive(List<V> messages, List<Integer> keys, List<Integer> partitions, List<Long> offsets);
}
