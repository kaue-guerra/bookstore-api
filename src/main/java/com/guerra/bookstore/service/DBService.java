package com.guerra.bookstore.service;

import com.guerra.bookstore.domain.Book;
import com.guerra.bookstore.domain.Category;
import com.guerra.bookstore.repositories.BookRepostory;
import com.guerra.bookstore.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private BookRepostory bookRepostory;

    public void databaseInstantiate(){
        Category cat1 = new Category(null, "Informática", "Livros de TI");
        Category cat2 = new Category(null, "Ficcção Científica", "Ficcção científica");
        Category cat3 = new Category(null, "Biografias", "Livros de Biografias");

        Book l1 = new Book(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
        Book l2 = new Book(null, "Engenharia de Software", "Louis V. Gerstner", "Lorem ipsum", cat1);
        Book l3 = new Book(null, "The Time Machine", "H.G. Wells", "Lorem ipsum", cat2);
        Book l4 = new Book(null, "The War of the Worlds", "H.G. Wells", "Lorem ipsum", cat2);
        Book l5 = new Book(null, "I, Robot", "Isaac Asimov", "Lorem ipsum", cat2);

        cat1.getBooks().addAll(Arrays.asList(l1, l2));
        cat2.getBooks().addAll(Arrays.asList(l3, l4, l5));

        this.categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.bookRepostory.saveAll(Arrays.asList(l1, l2, l3, l4, l5));

    }
}
