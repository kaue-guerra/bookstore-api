package com.guerra.bookstore.dtos;

import com.guerra.bookstore.domain.Category;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @NotEmpty(message = "Preencha o campo NOME")
    @Length(min = 3, max = 100, message = "O campo nome precisa ter no minimo 3 caracteres e no maximo 100")
    private String name;

    @NotEmpty(message = "Preencha o campo Descrição")
    @Length(min = 3, max = 200, message = "O campo Descrição precisa ter no minimo 3 caracteres e no maximo 200")
    private String description;

    public CategoryDTO() {

        super();
    }

    public CategoryDTO(Category obj) {
        super();
        this.id = obj.getId();
        this.name = obj.getName();
        this.description = obj.getDescription();
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
}
