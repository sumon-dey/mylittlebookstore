package com.sam.mylittlebookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.mylittlebookstore.entities.Book;
import com.sam.mylittlebookstore.service.BookService;

@RestController
@RequestMapping("/books")
public class BookRestController {

	@Autowired
	private BookService bookService;

	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@PutMapping
	public Book updateBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		Book bookToDelete = bookService.getBookById(id);
		bookService.deleteBook(bookToDelete);
	}

	@GetMapping("/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}

}
