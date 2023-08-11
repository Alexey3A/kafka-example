package com.example.kafkaexample.controller;

import com.example.kafkaexample.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test {

    private final Producer producer;

    @Autowired
    public Test(Producer producer) {
        this.producer = producer;
    }
    @PostMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message){

        this.producer.sendMessage(message);

    }
}
