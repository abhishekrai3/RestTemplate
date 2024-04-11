package com.example.RestTemplateApplication.controller;


import com.example.RestTemplateApplication.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping
    public Object getNews(@RequestParam("country-code") String countryCode , @RequestParam("api-key") String apiKey){
        return  newsService.getNews(countryCode, apiKey);
    }
}
