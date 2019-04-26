package com.springcloud.cloudclient2.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("CLOUD-CLIENT1")
public interface ClientServiceInterface {
    @RequestMapping("/hello")
    String hello();
}
