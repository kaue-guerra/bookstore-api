package com.guerra.bookstore;

import com.guerra.bookstore.domain.Book;
import com.guerra.bookstore.domain.Category;
import com.guerra.bookstore.repositories.BookRepostory;
import com.guerra.bookstore.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private BookRepostory bookRepostory;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@java.lang.Override
	public void run(java.lang.String... args) throws Exception {
		Category cat1 = new Category(null, "Fantasia", "Livros de Fantasia");

		Book b1 = new Book(null, "Senhor dos anéis", "J.R.R. Tolkien", "Lorem ipsum", cat1);

		cat1.getBooks().addAll(Arrays.asList(b1));

		this.categoryRepository.saveAll(Arrays.asList(cat1));
		this.bookRepostory.saveAll(Arrays.asList(b1));
	}
}
