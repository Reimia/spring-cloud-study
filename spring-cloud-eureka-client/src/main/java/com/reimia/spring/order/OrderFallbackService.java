package com.reimia.spring.order;

import org.springframework.stereotype.Component;

@Component
public class OrderFallbackService implements OrderFeignClient{
    @Override
    public String hi(String name) {
        return "熔断测试";
    }
}
