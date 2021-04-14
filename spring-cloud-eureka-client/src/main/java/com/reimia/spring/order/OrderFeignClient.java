package com.reimia.spring.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Reimia
 */
@FeignClient(value = "service-hi",fallback = OrderFallbackService.class)
public interface OrderFeignClient {

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable(value = "name") String name);
}
