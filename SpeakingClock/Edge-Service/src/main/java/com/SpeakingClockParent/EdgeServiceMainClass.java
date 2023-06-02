package com.SpeakingClockParent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EdgeServiceMainClass {
    public static void main(String[] args) {
        SpringApplication.run(EdgeServiceMainClass.class,args);
    }
}
