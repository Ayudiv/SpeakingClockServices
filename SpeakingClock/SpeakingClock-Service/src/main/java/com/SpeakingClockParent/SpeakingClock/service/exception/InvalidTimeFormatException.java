package com.SpeakingClockParent.SpeakingClock.service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serial;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvalidTimeFormatException extends RuntimeException {
    @Serial
    private static final long serialVersionUID=1L;
    private String errorCode;
    private String errorName;
}
