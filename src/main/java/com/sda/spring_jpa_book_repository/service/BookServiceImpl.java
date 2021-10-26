package com.sda.spring_jpa_book_repository.service;

import com.sda.spring_jpa_book_repository.model.Book;
import com.sda.spring_jpa_book_repository.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    @Transactional
    public List<Book> retrieveListOfBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book retrieveBooksById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    @Transactional
    public String addBooks(List<Book> book) {
        bookRepository.saveAll(book);
        String message = "Saving failed!";
        if (retrieveListOfBooks() != null) {
            message = "Successfully saved in database!";
        }
        return message;
    }

    @Override
    @Transactional

    public String updateBook(Book updatedBook) {
        Book book = retrieveBooksById(updatedBook.getId());
        String message = "Update failed!";
        if (book !=null) {
            book.setBookTitle(updatedBook.getBookTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setYearPublished(updatedBook.getYearPublished());
            bookRepository.save(book);
            message = "Updated Record!";
        }
        return message;

    }

    @Override
    @Transactional
    public String deleteBook(int id) {
        String message = "Does not exist!";
        if (retrieveBooksById(id) != null) {
            bookRepository.deleteById(id);
            message = "Delete successful!";

        }
        return message;
    }
}
