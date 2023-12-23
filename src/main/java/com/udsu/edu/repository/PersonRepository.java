package com.udsu.edu.repository;


import com.udsu.edu.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
