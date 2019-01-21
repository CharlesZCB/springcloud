package com.cn.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumecontroller {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getproduct")
    public String function(){
        String movie = restTemplate.getForObject("http://UNKNOWN/movie",String.class);
        return "购买了.."+movie;
    }
}
