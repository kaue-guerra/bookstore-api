package com.guerra.bookstore.service;

import com.guerra.bookstore.domain.Category;
import com.guerra.bookstore.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoryRepository repository;

    public Category findById(Integer id){
        Optional<Category> obj = repository.findById(id);
        return obj.orElse(null);
    }

}
