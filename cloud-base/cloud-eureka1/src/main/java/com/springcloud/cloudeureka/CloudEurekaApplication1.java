package com.springcloud.cloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication1.class, args);
    }

}
