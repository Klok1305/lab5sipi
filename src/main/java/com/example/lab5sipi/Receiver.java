package com.example.lab5sipi;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    public void receiveMessage(String message) {
        System.out.println("Получено сообщение: " + message);
    }

}
