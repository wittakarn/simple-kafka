package com.thaisoftplus.simple.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thaisoftplus.simple.kafka.message.MessageListener;
import com.thaisoftplus.simple.kafka.message.MessageProducer;

@Configuration
public class ApplicationConfig {
	@Bean
	public MessageProducer messageProducer() {
		return new MessageProducer();
	}

	@Bean
	public MessageListener messageListener() {
		return new MessageListener();
	}
}
