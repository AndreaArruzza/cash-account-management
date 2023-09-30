package com.cashaccountmanagement.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FabrickClientConfig {

    public FabrickClientConfig(){

    }

    @Bean
    public ErrorDecoder fabrickClientErrorDecoder(){
        return new FabrickClientErrorDecoder();
    }
}
