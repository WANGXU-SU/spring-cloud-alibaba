package com.example.consumer.controller.service;

import com.example.consumer.controller.service.fallback.ProviderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author WangXu
 * @create 2019/12/25 9:29
 */
@FeignClient(value = "nacos-provider", fallback = ProviderFallback.class)
public interface ProviderService {

    @GetMapping("demo/{str}")
    String demo(@PathVariable("str") String str);
}
