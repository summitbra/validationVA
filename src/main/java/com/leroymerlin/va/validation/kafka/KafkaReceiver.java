package com.leroymerlin.va.validation.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leroymerlin.va.validation.controller.AuditLogController;
import com.leroymerlin.va.validation.jms.JmsResponse;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

@Component
public class KafkaReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReceiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    private AuditLogController auditController;

    @Autowired
    public KafkaReceiver(AuditLogController auditController) {
        this.auditController = auditController;
    }

    @KafkaListener(topics = "${topic.boot}")
    public void receive(ConsumerRecord<?, String> consumerRecord) {
        LOGGER.info("received data='{}'", consumerRecord.toString());

        try {
            JmsResponse message = new ObjectMapper().readValue(consumerRecord.value(), JmsResponse.class);

            auditController.processValidation(message.getId(), message.getAction(), message.getValue(), 0);

        } catch (IOException e) {
            e.printStackTrace();
        }

        latch.countDown();
    }
}
