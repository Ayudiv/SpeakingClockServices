package com.SpeakingClockParent.advice;

import com.SpeakingClockParent.exception.InvalidTimeFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(InvalidTimeFormatException.class)
    public ResponseEntity<String> handleInappropriateException(InvalidTimeFormatException invalidTimeFormatException){
        return new ResponseEntity<>("Input Field is either empty or inappropriate entry or not a proper time format , that is HH:MM, please have a look into it", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleNumberInputException(NumberFormatException numberFormatException){
        return new ResponseEntity<>("Input Field is not a integer or not proper time format, please have a look into it , that is HH:MM", HttpStatus.BAD_REQUEST);
    }
}
