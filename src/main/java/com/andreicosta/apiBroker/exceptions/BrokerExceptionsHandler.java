package com.andreicosta.apiBroker.exceptions;

import com.andreicosta.apiBroker.domain.ErrorMenssage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class BrokerExceptionsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler( value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception e, WebRequest request){
        String errorDescription = "Corretor não localizado ou não está ativo";
        if(errorDescription == null) errorDescription = e.toString();
        ErrorMenssage errorMessage = new ErrorMenssage(new Date(), errorDescription);
        return new ResponseEntity<>(errorMessage,new HttpHeaders(), HttpStatus.BAD_REQUEST);

    }
}
