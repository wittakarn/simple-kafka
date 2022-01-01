package com.thaisoftplus.simple.kafka.message;

import java.util.concurrent.CountDownLatch;

import org.springframework.kafka.annotation.KafkaListener;

public class MessageListener {
	private CountDownLatch latch = new CountDownLatch(3);

	@KafkaListener(topics = "${message.topic.name}", groupId = "simple", containerFactory = "simpleKafkaListenerContainerFactory")
	public void listenGroupFoo(String message) {
		System.out.println("Received Message in group 'simple': " + message);
		latch.countDown();
	}

}
