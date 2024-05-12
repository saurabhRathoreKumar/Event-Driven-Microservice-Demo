package com.microservices.demo.twitter.to.kafka.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "my-custom-keywords")
public class MyCustomConfigData {
    private List<String> fruitsDetails;

    private List<String> cityDetails;

}
