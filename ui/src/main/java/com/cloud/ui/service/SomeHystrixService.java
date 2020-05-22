package com.cloud.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SomeHystrixService {

    //在springboot下使用Ribbon，我们只需要注入一个RestTemplate即可
    @Autowired
    private SomeService someService;

    @HystrixCommand(fallbackMethod = "fallbackSome")
    public String getSome(){
        String some = someService.getSome();
        return some;
    }

    public String fallbackSome(){
        return "some service 模块故障";
    }
}
