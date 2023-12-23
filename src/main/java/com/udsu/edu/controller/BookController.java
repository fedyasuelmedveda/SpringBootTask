package com.udsu.edu.controller;

import com.udsu.edu.entity.Book;
import com.udsu.edu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    //@GetMapping(name="/hello", consumes="application/json")
    //public String hello(@RequestParam(value = "name", defaultValue = "my friend") String name) {
      //  return String.format("Hello, %s!", name);
    //}

    @PostMapping("/save")
    public Book save(@RequestBody String name){
        Book book = new Book(name);
        return bookService.save(book);
    }
}
