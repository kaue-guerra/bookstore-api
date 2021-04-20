package com.guerra.bookstore.dtos;

import com.guerra.bookstore.domain.Book;
import com.guerra.bookstore.domain.Category;

import java.io.Serializable;

public class BookDTO implements Serializable {

    public static final long serialVersionUID = 1L;

    private Integer id;
    private String title;
    private String author;
    private String text;

    public BookDTO(){

        super();
    }

    public BookDTO(Book obj) {
        this.id = obj.getId();
        this.title = obj.getTitle();
        this.author = obj.getAuthor();
        this.text = obj.getText();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
