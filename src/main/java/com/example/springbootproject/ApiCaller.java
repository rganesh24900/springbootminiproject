package com.example.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${apicaller.api.url}")
    public String url;

    public String postApiCaller(Entities a) {
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Entities> httpEntity = new HttpEntity<>(a, httpHeaders);


        return restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class).getBody();
    }

    public String getApiCaller(Entities b) {
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Entities> httpEntity = new HttpEntity<>(b, httpHeaders);

        return restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class).getBody();
    }
}
