package com.guerra.bookstore.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Book() {
        super();
    }

    public Book(Integer id, String title, String author, String text, Category category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.text = text;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (id == null){
            if (other.id !=null)
                return false;
        }else if (!id.equals(other.id))
            return false;
        return true;
    }
}
