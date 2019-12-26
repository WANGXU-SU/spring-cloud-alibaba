package com.example.rocketconsumer.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @author WangXu
 * @create 2019/12/26 16:33
 */
@Service
public class RocketService {

    @StreamListener("input")
    public void receive(String msg) {
        System.out.println("receive : ----"+msg);
    }

}
