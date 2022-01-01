package com.thaisoftplus.simple.kafka;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.thaisoftplus.simple.kafka.message.MessageProducer;

@SpringBootApplication
public class KafkaApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KafkaApplication.class, args);

		MessageProducer producer = context.getBean(MessageProducer.class);
		producer.sendMessage("Hello, World! " + new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()));

//		context.close();
	}

	
}
