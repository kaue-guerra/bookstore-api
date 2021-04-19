package com.guerra.bookstore.service;

import com.guerra.bookstore.domain.Book;
import com.guerra.bookstore.repositories.BookRepostory;
import com.guerra.bookstore.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepostory repository;

    public Book findById(Integer id){
        Optional<Book> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Livro não encontrado! Id: " + id + "Tipo: " + Book.class.getName()));
    }

    public List<Book> findAll(){
        return repository.findAll();
    }
}
