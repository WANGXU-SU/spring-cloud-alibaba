package com.example.rocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author WangXu
 * @create 2019/12/26 16:11
 */
@Service
public class RocketService {

    @Autowired
    private MessageChannel output;


    public void send(String msg) {
        output.send(MessageBuilder.withPayload(msg).build());
    }

}
