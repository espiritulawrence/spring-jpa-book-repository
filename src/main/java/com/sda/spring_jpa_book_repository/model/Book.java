package com.sda.spring_jpa_book_repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="BOOK")
public class Book {
    @Id
    @Column (name = "BOOK_ID")
    private int id;
    @Column(name = "BOOK_TITLE")
    private String bookTitle;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "YR_PUBLISHED")
    private Date yearPublished;

}
