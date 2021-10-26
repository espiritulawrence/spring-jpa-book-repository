package com.sda.spring_jpa_book_repository.service;

import com.sda.spring_jpa_book_repository.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> retrieveListOfBooks();
    public Book retrieveBooksById(int id);
    public String addBooks (List<Book> book);
    public String updateBook (Book book);
    public String deleteBook (int id);
}
