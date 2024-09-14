package com.ajaz.productservice3.exceptions;

import com.ajaz.productservice3.models.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvices {

    @ExceptionHandler(NotFoundException.class)
    private ResponseEntity<ExceptionDto> handleNotFoundException(NotFoundException notFoundException){
        return new ResponseEntity<>(
          new ExceptionDto(notFoundException.getMessage(), HttpStatus.NOT_FOUND),
          HttpStatus.NOT_FOUND
        );
    }



}
