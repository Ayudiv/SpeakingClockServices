package com.SpeakingClockParent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceFinder {
    public static void main(String[] args) {
        SpringApplication.run(ServiceFinder.class,args);
    }
}
