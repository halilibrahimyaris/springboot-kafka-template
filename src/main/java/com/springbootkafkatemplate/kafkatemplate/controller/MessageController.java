package com.springbootkafkatemplate.kafkatemplate.controller;

import com.springbootkafkatemplate.kafkatemplate.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springbootkafkatemplate.kafkatemplate.service.MessageService;

@RestController
@RequestMapping("/message") // "/" önemli
public class MessageController {

    private final MessageService messageService;
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/saveMessage")
    public ResponseEntity<String> save(/*@RequestBody Message message*/){

        return ResponseEntity.ok(messageService.saveMessage("First Message's body"));
    }
}
