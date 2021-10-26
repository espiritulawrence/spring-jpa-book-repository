package com.sda.spring_jpa_book_repository.repository;

import com.sda.spring_jpa_book_repository.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
