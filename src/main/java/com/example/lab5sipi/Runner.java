package com.example.lab5sipi;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;

    public Runner(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            System.out.println("Sending message...");
            rabbitTemplate.convertAndSend(RabitDemoApplication.exchangeName, "", "￣へ￣");
            rabbitTemplate.convertAndSend("Zhideleva_Sofia-BIVT-20-4_direxch",
                    "Zhideleva_Sofia-BIVT-20-4_routing_key", "мдаааааааааа");
            Thread.sleep(2000);
        }
    }

}