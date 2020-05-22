package com.cloud.ui.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.entity.Person;
import com.cloud.ui.service.PersonService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/getPerson")
    public Person getPerson(){
        Person wangdx = personService.save("wangdx");


        return wangdx;
    }

}
