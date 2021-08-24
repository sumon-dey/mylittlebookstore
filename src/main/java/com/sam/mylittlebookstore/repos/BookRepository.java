package com.sam.mylittlebookstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sam.mylittlebookstore.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
