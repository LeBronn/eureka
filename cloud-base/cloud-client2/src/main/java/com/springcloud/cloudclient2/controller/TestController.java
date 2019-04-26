package com.springcloud.cloudclient2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private  ClientServiceInterface clientServiceInterface;

    @RequestMapping("/call")
    public String call() {
        String result = clientServiceInterface.hello();
        return "b to a 访问结果 ----- " + result;
    }
}
