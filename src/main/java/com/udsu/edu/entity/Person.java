package com.udsu.edu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "person_id")
    private List<Book> books;

    public Person(String name){
        this.name = name;
    }
    public Person(){}
}
