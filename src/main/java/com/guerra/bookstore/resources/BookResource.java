package com.guerra.bookstore.resources;

import com.guerra.bookstore.domain.Book;
import com.guerra.bookstore.dtos.BookDTO;
import com.guerra.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/Books")
public class BookResource {

    @Autowired
    private BookService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Book> findById(@PathVariable Integer id){
        Book obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<BookDTO>> findAll(){
        List<Book> list = service.findAll();
        List<BookDTO> listDTO = list.stream().map(obj -> BookDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
}
