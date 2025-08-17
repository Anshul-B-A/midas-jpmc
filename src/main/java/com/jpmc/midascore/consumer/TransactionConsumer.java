package com.jpmc.midascore.consumer;

import com.jpmc.midascore.foundation.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionConsumer {

    private static final Logger logger = LoggerFactory.getLogger(TransactionConsumer.class);

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-core-group")
    public void consume(Transaction transaction) {
        logger.info("Received transaction: {}", transaction);
    }
}