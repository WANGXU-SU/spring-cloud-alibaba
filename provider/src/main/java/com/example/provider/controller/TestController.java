package com.example.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangXu
 * @create 2019/12/25 9:20
 */
@RestController
public class TestController {


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("demo/{str}")
    public String demo(@PathVariable("str") String str) {
        return serverPort + "----" + str;
    }
}
