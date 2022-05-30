package com.mykafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "myTopic", groupId = "group_id")
    void listener(String data) {
        System.out.println("Listener receives: " + data);
    }

    @KafkaListener(topics = "myTopic", groupId = "group_id2")
    void listener2(String data) {
        System.out.println("Listener2 receives: " + data);
    }
}
