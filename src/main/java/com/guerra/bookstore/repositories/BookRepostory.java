package com.guerra.bookstore.repositories;

import com.guerra.bookstore.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepostory extends JpaRepository<Book, Integer> {

}
