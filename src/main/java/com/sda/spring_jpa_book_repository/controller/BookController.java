package com.sda.spring_jpa_book_repository.controller;

import com.sda.spring_jpa_book_repository.model.Book;
import com.sda.spring_jpa_book_repository.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/books/all")
    public List<Book> getAllBooks() {
        return bookService.retrieveListOfBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.retrieveBooksById(id);
    }
    @PostMapping("/books")
    public String addBooks(@RequestBody List<Book> book) {
        return bookService.addBooks(book);
    }
    @PutMapping("/books")
    public String updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable int id) {
        return bookService.deleteBook(id);
    }
}
