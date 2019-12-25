package com.example.consumer.controller.service.fallback;

import com.example.consumer.controller.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @author WangXu
 * @create 2019/12/25 9:36
 */
@Component
public class ProviderFallback implements ProviderService {
    @Override
    public String demo(String str) {
        return "参数：" + str + "---服务熔断";
    }
}
