package com.xbank.accountapi.handler;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.xbank.accountapi.exceptions.NoAccountExistForCustomerIdException;

@ControllerAdvice
class ErrorHandlingControllerAdvice {

    @ExceptionHandler(AccountNotFoundException.class)
    public final ResponseEntity<String> handleOverlappingOrderException(AccountNotFoundException ex,
        WebRequest request) {
        return new ResponseEntity<>("", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoAccountExistForCustomerIdException.class)
    public final ResponseEntity<String> handleNoAccountExistForCustomerIdException(
        NoAccountExistForCustomerIdException ex,
        WebRequest request) {
        return new ResponseEntity<>("", HttpStatus.NOT_FOUND);
    }
}
