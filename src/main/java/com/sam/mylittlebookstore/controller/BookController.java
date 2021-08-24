package com.sam.mylittlebookstore.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sam.mylittlebookstore.entities.Book;
import com.sam.mylittlebookstore.repos.BookRepository;
import com.sam.mylittlebookstore.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	@Autowired
	BookRepository bookRepository;
	@Autowired
	ServletContext servletContext;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createBook";
	}

	@RequestMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Book book, ModelMap modelMap) {
		Book bookSaved = bookService.saveBook(book);
		String msg = "Book saved with Id: " + bookSaved.getBookid();
		modelMap.addAttribute("msg", msg);
		return "createBook";
	}

	@RequestMapping("/displayBooks")
	public String displayBooks(ModelMap modelMap) {
		List<Book> allBooks = bookService.getAllBooks();
		modelMap.addAttribute("books", allBooks);
		return "displayBooks";
	}

	@RequestMapping("/deleteBook")
	public String deleteBook(@RequestParam("id") int id, ModelMap modelMap) {
		Book bookToDelete = bookService.getBookById(id);
		bookService.deleteBook(bookToDelete);
		List<Book> allBooks = bookService.getAllBooks();
		modelMap.addAttribute("books", allBooks);
		return "displayBooks";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Book book = bookService.getBookById(id);
		modelMap.addAttribute("book", book);
		return "updateBook";
	}

	@RequestMapping("/updateBook")
	public String updateBook(@ModelAttribute("book") Book book, ModelMap modelMap) {
		bookService.updateBook(book);
		List<Book> allBooks = bookService.getAllBooks();
		modelMap.addAttribute("books", allBooks);
		return "displayBooks";
	}

}
