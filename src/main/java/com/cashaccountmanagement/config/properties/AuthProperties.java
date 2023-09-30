package com.cashaccountmanagement.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "auth")
public class AuthProperties {
    private String authSchema;
    private String apiKey;
}
