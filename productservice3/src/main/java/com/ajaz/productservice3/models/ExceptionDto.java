package com.ajaz.productservice3.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ExceptionDto {
    private String message;
    private HttpStatus httpStatus;

    public ExceptionDto(String message, HttpStatus httpStatus){
        this.message = message;
        this.httpStatus = httpStatus;
    }

}
