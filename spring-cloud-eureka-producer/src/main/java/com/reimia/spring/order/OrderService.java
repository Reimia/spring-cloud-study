package com.reimia.spring.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Reimia
 */
public interface OrderService {

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable(value = "name") String name);
}
