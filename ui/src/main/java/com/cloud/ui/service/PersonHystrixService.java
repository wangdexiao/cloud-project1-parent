package com.cloud.ui.service;

import com.cloud.entity.Person;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonHystrixService {

    @Autowired
    private PersonService personService;

    @HystrixCommand(fallbackMethod = "fallbackSave") //1 使用HystrixCommand的fallback 参数指定，当本方法调用失败时，调用备用方法fallbackSave
    public Person save(String name) {
        return personService.save(name);
    }


    public List<Person> fallbackSave(){
        List<Person> list = new ArrayList<>();
        Person p = new Person("Person Service 故障");
        list.add(p);
        return list;
    }
}
