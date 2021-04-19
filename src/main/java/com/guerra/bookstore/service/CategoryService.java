package com.guerra.bookstore.service;

import com.guerra.bookstore.domain.Category;
import com.guerra.bookstore.dtos.CategoryDTO;
import com.guerra.bookstore.repositories.CategoryRepository;
import com.guerra.bookstore.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category findById(Integer id){
        Optional<Category> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " Tipo: " + Category.class.getName()));
    }

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category create(Category obj){
        obj.setId(null);
        return repository.save(obj);
    }

    public Category update(Integer id, CategoryDTO objDTO) {
        Category obj = findById(id);
        if (objDTO.getName() != null){
            obj.setName(objDTO.getName());
        }
        if (objDTO.getDescription() != null){
            obj.setDescription(objDTO.getDescription());
        }
        return repository.save(obj);
    }
}
