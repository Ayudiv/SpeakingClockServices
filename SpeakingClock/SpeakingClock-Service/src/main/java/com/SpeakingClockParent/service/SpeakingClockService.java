package com.SpeakingClockParent.service;

import com.SpeakingClockParent.exception.InvalidTimeFormatException;
import org.springframework.stereotype.Service;

@Service
public class SpeakingClockService {
    public String convertTimeToWords(String time){
        try {
            if (!time.matches("^\\d{2}:\\d{2}$")) {
                throw new InvalidTimeFormatException("Invalid time format. Expected format: HH:MM", "Invalid time format. Expected format: HH:MM");
            }
        }
        catch(InvalidTimeFormatException i){
            i.getErrorCode();
            }
        catch (NumberFormatException j){
            j.getMessage();
        }

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour == 0 && minute == 0) {
            return "It's Midnight";
        } else if (hour == 12 && minute == 0) {
            return "It's Midday";
        } else {
            String hourInWords = getHourInWords(hour);
            String minuteInWords = getMinuteInWords(minute);
            return "It's " + hourInWords + " " + minuteInWords;
        }
    }

    private String getHourInWords(int hour) {
        // Convert hour to words (implement your logic here)
        // Example: 1 -> "one", 2 -> "two", ..., 12 -> "twelve"
        // You can use a map or switch statements to handle the conversion.
        // For simplicity, we'll use a simple array.
        String[] hours = {
                "twelve", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven"
        };

        return hours[hour % 12];
    }

    private String getMinuteInWords(int minute) {
        // Convert minute to words (implement your logic here)
        // Example: 0 -> "o'clock", 1 -> "one", ..., 59 -> "fifty-nine"
        // You can use a map or switch statements to handle the conversion.
        // For simplicity, we'll use a simple array.
        String[] minutes = {
                "o'clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three",
                "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight",
                "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three", "thirty-four",
                "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
                "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six",
                "forty-seven", "forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two",
                "fifty-three", "fifty-four", "fifty-five", "fifty-six", "fifty-seven", "fifty-eight",
                "fifty-nine"
        };

        return minutes[minute % 60];
    }
}

