package com.example.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@SpringBootApplication
public class SpringbootprojectApplication {

    static final int a = 300000;
    static final int b = 1000;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootprojectApplication.class, args);


    }
    @Bean
    public RestTemplate restTemplate (RestTemplateBuilder builder){
        RestTemplate restTemplate = builder
                .setConnectTimeout(Duration.ofMillis(a))
                .setReadTimeout(Duration.ofMillis(b)).build();

        return restTemplate;
    }


}
