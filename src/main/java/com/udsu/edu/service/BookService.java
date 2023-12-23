package com.udsu.edu.service;

import com.udsu.edu.entity.Book;
import com.udsu.edu.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    public Book save(Book book){
        return bookRepository.save(book);
    }
}
