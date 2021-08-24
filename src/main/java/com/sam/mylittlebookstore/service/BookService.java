package com.sam.mylittlebookstore.service;

import java.util.List;

import com.sam.mylittlebookstore.entities.Book;

public interface BookService {

	Book saveBook(Book book);

	Book updateBook(Book book);

	void deleteBook(Book book);

	Book getBookById(int id);

	List<Book> getAllBooks();

}
