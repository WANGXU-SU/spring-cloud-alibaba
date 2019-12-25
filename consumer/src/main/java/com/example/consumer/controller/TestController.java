package com.example.consumer.controller;

import com.example.consumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangXu
 * @create 2019/12/25 9:29
 */
@RestController
public class TestController {


    @Autowired
    private ProviderService providerService;

    @GetMapping("/demo/{str}")
    public String demo(@PathVariable("str")String str) {
        return providerService.demo(str);
    }

}
