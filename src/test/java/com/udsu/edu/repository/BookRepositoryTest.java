package com.udsu.edu.repository;

import com.udsu.edu.entity.Book;
import com.udsu.edu.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.Collection;

@Transactional
@DataJpaTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;
    @Test
    public void bookTest(){
        bookRepository.save(new Book("aaa"));
        Assertions.assertTrue(new ArrayList<>((Collection) bookRepository.findAll()).size()==1);

    }
}
