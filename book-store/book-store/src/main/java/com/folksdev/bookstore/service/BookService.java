package com.folksdev.bookstore.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.folksdev.bookstore.Repository.IBookRepository;
import com.folksdev.bookstore.model.Book;

@Service
public class BookService {
	
	private final IBookRepository bookRepository;

	public BookService(IBookRepository bookRepository) {
		
		this.bookRepository = bookRepository;
	}
	
	public Optional<Book> findBookById(Integer bookId) {
		return bookRepository.findById(bookId);
	}

}
