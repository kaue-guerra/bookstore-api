package com.guerra.bookstore.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Preencha o campo NOME")
    @Length(min = 3, max = 100, message = "O campo nome precisa ter no minimo 3 caracteres e no maximo 100")
    private String name;

    @NotEmpty(message = "Preencha o campo Descrição")
    @Length(min = 3, max = 200, message = "O campo Descrição precisa ter no minimo 3 caracteres e no maximo 200")
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Book> books = new ArrayList<>();

     public Category(){
         super();
     }

    public Category(Integer id, String name, String description){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
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
         Category other = (Category) obj;
         if (id == null){
             if (other.id !=null)
                 return false;
         }else if (!id.equals(other.id))
             return false;
         return true;
    }
}
