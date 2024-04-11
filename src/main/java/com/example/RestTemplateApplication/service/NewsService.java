package com.example.RestTemplateApplication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.support.RestTemplateAdapter;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;

    String baseUrl="https://newsapi.org/v2/top-headlines?country=";

    public Object getNews(String countryCode , String apiKey){

        String url= preparedUrl(countryCode, apiKey);
         return restTemplate.getForObject(url, Object.class);
    }

    private String preparedUrl(String countryCode, String apiKey) {
    return baseUrl+countryCode+'&'+"apiKey="+apiKey;

    }
}

