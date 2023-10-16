package com.jubaer.BookManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jubaer.BookManagement.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
