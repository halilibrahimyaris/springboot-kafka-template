package com.springbootkafkatemplate.kafkatemplate.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Message implements Serializable {
    int id ;
    String messageHeader;
    String messageBody;
    String sender;
    String receiver;
}
