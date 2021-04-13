package com.reimia.spring.order;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements OrderService{

    @Override
    public String hi(String name) {
        return "hi "+name;
    }
}
