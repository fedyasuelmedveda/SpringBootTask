package com.udsu.edu.service;

import com.udsu.edu.entity.Person;
import com.udsu.edu.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }
}
