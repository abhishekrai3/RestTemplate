package com.example.RestTemplateApplication.service;


import com.example.RestTemplateApplication.dto.NewsResponse;
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

        String url= prepareUrl(countryCode, apiKey);
         NewsResponse response= restTemplate.getForObject(url, NewsResponse.class);
         return  response;
    }

    private String prepareUrl(String countryCode, String apiKey) {
    return baseUrl+countryCode+'&'+"apiKey="+apiKey;

    }
}

