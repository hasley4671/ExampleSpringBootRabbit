package com.example.springboot.rabbit.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitDemoApplication implements CommandLineRunner {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRabbitDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleMessage message = new SimpleMessage();
		message.setName("RabbitDemo");
		message.setDescription("A simple message");
		rabbitTemplate.convertAndSend("TestExchange", "testRouting", message);
		
		 message = new SimpleMessage();
		message.setName("MytopicMessage");
		message.setDescription("A topic message");
		rabbitTemplate.convertAndSend("MyTopicExchange", "topic", message);
		
	}
}
