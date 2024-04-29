package com.springbootkafkatemplate.kafkatemplate.service;

import com.springbootkafkatemplate.kafkatemplate.model.Message;

public interface IMessageService {
    String  saveMessage(Message message);
}
