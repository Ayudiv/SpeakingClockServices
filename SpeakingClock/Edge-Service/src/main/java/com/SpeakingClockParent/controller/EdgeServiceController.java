package com.SpeakingClockParent.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class EdgeServiceController {
    private final RestTemplate restTemplate;

    @Autowired
    public EdgeServiceController(@LoadBalanced RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/time/{input}")
    public ResponseEntity<String> convertTimeToWords(@PathVariable String input) {
        String url = "http://speaking-clock-service/api/time/" + input;
        return restTemplate.getForEntity(url, String.class);
    }
}
