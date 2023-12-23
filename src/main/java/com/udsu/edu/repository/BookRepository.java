package com.udsu.edu.repository;

import com.udsu.edu.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
