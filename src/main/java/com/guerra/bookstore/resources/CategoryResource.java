package com.guerra.bookstore.resources;

import com.guerra.bookstore.domain.Category;
import com.guerra.bookstore.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Integer id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
