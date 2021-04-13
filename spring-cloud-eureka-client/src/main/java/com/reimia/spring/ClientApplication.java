package com.reimia.spring;

import com.reimia.spring.order.OrderFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Reimia
 */
@SpringBootApplication
@EnableFeignClients
@RestController
public class ClientApplication {

    @Resource
    OrderFeignClient orderFeignClient;

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello" + orderFeignClient.hi("from hello");
    }

}
