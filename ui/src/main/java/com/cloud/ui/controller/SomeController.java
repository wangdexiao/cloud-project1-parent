package com.cloud.ui.controller;

import com.cloud.ui.service.SomeHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @Autowired
    private SomeHystrixService someHystrixService;

    @GetMapping(value = "/getSome")
    public String getSome(){
        return someHystrixService.getSome();
    }
}
