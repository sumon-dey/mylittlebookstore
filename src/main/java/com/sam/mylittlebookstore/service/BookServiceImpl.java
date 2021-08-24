package com.sam.mylittlebookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.mylittlebookstore.entities.Book;
import com.sam.mylittlebookstore.repos.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBook(Book book) {
		bookRepository.delete(book);
	}

	@Override
	public Book getBookById(int id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

}
