package com.ajaz.productservice3.security;

import com.google.gson.JsonObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class TokenValidator {

    // calls userservice to validate the token, if token is not valid, returns null
    // else return the details

    private RestTemplateBuilder restTemplateBuilder;
    public TokenValidator(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public Optional<JwtObject> validateToken(String token){
        RestTemplate restTemplate = restTemplateBuilder.build();

        return Optional.empty();
    }



}
