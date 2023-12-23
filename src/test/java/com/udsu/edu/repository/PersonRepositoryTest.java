package com.udsu.edu.repository;

import com.udsu.edu.entity.Person;
import com.udsu.edu.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.Collection;

@Transactional
@DataJpaTest
public class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;
    @Test
    public void bookTest(){
        personRepository.save(new Person("Ivan"));
        Assertions.assertTrue(new ArrayList<>((Collection) personRepository.findAll()).size()==1);

    }
}