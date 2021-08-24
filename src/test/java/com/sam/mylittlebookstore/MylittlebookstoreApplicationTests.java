package com.sam.mylittlebookstore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sam.mylittlebookstore.entities.Book;
import com.sam.mylittlebookstore.repos.BookRepository;

@SpringBootTest
class MylittlebookstoreApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Test
	void testStoreBook() {
		Book book = new Book();
		book.setBookid(1);
		book.setBookname("Deep Work");
		book.setBookauthor("Cal Newport");
		book.setBookpurchasedate("23/08/2021");
		bookRepository.save(book);
	}

	@Test
	void testFindBookById() {
		Book book = bookRepository.findById(1).get();
		System.out.println(book);
	}

	@Test
	void testUpdateBook() {
		Book book = bookRepository.findById(1).get();
		book.setBookauthor("Cal");
		bookRepository.save(book);
	}

	@Test
	void testDeleteteBook() {
		Book book = bookRepository.findById(1).get();
		bookRepository.delete(book);
	}

}
