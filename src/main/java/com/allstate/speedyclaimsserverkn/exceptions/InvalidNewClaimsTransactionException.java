package com.allstate.speedyclaimsserverkn.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST )
public class InvalidNewClaimsTransactionException extends RuntimeException {

    public InvalidNewClaimsTransactionException(String message) {
        super(message);
    }
}
