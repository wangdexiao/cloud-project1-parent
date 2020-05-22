package com.cloud.person.web.controller;

import com.cloud.entity.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping(method = {RequestMethod.POST,RequestMethod.GET},value = "/save")
    public Person savePerson(@RequestBody String name) {
        Person p = new Person(name);
        return p;
    }

}
