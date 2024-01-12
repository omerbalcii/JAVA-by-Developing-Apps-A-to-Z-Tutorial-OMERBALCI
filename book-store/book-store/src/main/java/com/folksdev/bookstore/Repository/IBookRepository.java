package com.folksdev.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.folksdev.bookstore.model.Book;

public interface IBookRepository extends JpaRepository<Book,Integer>{

}
