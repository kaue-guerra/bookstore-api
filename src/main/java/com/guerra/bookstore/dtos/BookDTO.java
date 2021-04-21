package com.guerra.bookstore.dtos;

import com.guerra.bookstore.domain.Book;
import com.guerra.bookstore.domain.Category;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class BookDTO implements Serializable {

    public static final long serialVersionUID = 1L;

    private Integer id;

    @NotEmpty(message = "Preencha o campo TITULO")
    @Length(min = 3, max = 50, message = "O campo nome precisa ter no minimo 3 caracteres e no maximo 50")
    private String title;

    @NotEmpty(message = "Preencha o campo NOME DO AUTOR")
    @Length(min = 3, max = 50, message = "O campo nome precisa ter no minimo 3 caracteres e no maximo 50")
    private String author;

    @NotEmpty(message = "Preencha o campo TEXTO")
    @Length(min = 3, max = 400, message = "O campo nome precisa ter no minimo 3 caracteres e no maximo 400")
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
