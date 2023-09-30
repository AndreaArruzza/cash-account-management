package com.cashaccountmanagement.config;

import com.cashaccountmanagement.exception.GenericError;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shared.library.service.LoggingService;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

public class FabrickClientErrorDecoder implements ErrorDecoder {

    @Autowired
    private LoggingService loggingService;

    @Override
    public Exception decode(String s, Response response) {
        String errorMessage = "";

        try{
            String externalErrorResponse = loggingService.logErrorResponse(response);

            if(response.status() == 401){
                return new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Not Authorized");
            }
            else if(response.status() == 405){
                return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Input");
            }
            else{
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                GenericError genericError = objectMapper.readValue(externalErrorResponse, GenericError.class);
                return new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, genericError.getErrors().toString());
            }
        } catch (IOException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "I/O Excpetion");
        }
    }
}
