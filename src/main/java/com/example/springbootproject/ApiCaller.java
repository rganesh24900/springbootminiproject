package com.example.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class ApiCaller {
    @Autowired
    RestTemplate restTemplate;
    HttpHeaders httpHeaders = new HttpHeaders();

    public String postApiCaller(Entities a) {
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Entities> httpEntity = new HttpEntity<>(a, httpHeaders);


        return restTemplate.exchange("http://localhost:8080/bloodgroups", HttpMethod.POST, httpEntity, String.class).getBody();
    }

    public String getApiCaller(Entities b) {
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Entities> httpEntity = new HttpEntity<>(b, httpHeaders);

        return restTemplate.exchange("http://localhost:8080/bloodgroups", HttpMethod.GET, httpEntity, String.class).getBody();
    }
}
