package com.springbootkafkatemplate.kafkatemplate.service;

import com.springbootkafkatemplate.kafkatemplate.model.Message;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService  {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public Message getMessageById(){
        return new Message();
    }
    public Message updateMessageById(){
        return new Message();
    }

    public String saveMessage(String message){

        kafkaTemplate.send("message-notification", message);
        return message;
    }
}
