package com.udsu.edu.controller;

import com.udsu.edu.entity.Person;
import com.udsu.edu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    //@GetMapping(name="/hello", consumes="application/json")
    //public String hello(@RequestParam(value = "name", defaultValue = "my friend") String name) {
    //  return String.format("Hello, %s!", name);
    //}

    @PostMapping("/save")
    public Person save(@RequestBody String name){
        Person person = new Person(name);
        return personService.save(person);
    }
}