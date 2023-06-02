package com.SpringClockParent;

import com.SpeakingClockParent.service.SpeakingClockService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SpringClockParentMainClassTest {
    private SpeakingClockService speakingClockService;

    @BeforeEach
    public void setup() {
        speakingClockService = new SpeakingClockService();
    }

    @Test
    public void testConvertTimeToWords() {
        String time1 = "08:34";
        String expected1 = "It's eight thirty-four";
        Assertions.assertEquals(expected1, speakingClockService.convertTimeToWords(time1));

        String time2 = "12:00";
        String expected2 = "It's Midday";
        Assertions.assertEquals(expected2, speakingClockService.convertTimeToWords(time2));

        String time3 = "00:00";
        String expected3 = "It's Midnight";
        Assertions.assertEquals(expected3, speakingClockService.convertTimeToWords(time3));
    }
}

