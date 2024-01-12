package com.folksdev.bookstore;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.folksdev.bookstore.Repository.IBookRepository;
import com.folksdev.bookstore.model.Book;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	private final IBookRepository bookRepository;
	public BookStoreApplication(IBookRepository bookRepository) {
		
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	
		
	
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Book book1=Book.builder()
				.name("yüzüklerin efendisi")
				.author("J.R.R Tolkien")
				.price(10.0)
				.stock(10)
				.build();
		
		Book book2=Book.builder()
				.name("Başlangıç")
				.author("Don Brown")
				.price(15.0)
				.stock(15)
				.build();
		
		Book book3=Book.builder()
				.name("Formül")
				.author("Santos")
				.price(20.0)
				.stock(5)
				.build();
		bookRepository.saveAll(Arrays.asList(book1,book2,book3));
		
	}

}
