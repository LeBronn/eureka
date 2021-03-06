package com.springcloud.cloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication2.class, args);
    }

}
