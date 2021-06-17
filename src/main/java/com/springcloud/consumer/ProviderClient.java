package com.springcloud.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-provider" )
public interface ProviderClient {

    @GetMapping("/hello")
    String hi();
}


