package com.SpeakingClockParent.SpeakingClock.service.controller;

import com.SpeakingClockParent.SpeakingClock.service.SpeakingClockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpeakingClockController {


    private final SpeakingClockService speakingClockService;

    public SpeakingClockController(SpeakingClockService speakingClockService) {
        this.speakingClockService = speakingClockService;
    }



    @GetMapping("/time/{input}")
    public ResponseEntity<String> convertTimeToWords(@PathVariable String input) {
        // Validate input format (e.g., "11:25")

        String convertedTime = speakingClockService.convertTimeToWords(input);
        return ResponseEntity.ok(convertedTime);
    }
}
