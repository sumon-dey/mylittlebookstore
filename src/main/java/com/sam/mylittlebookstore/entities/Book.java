package com.sam.mylittlebookstore.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mylittlebookstore")
public class Book {

	@Id
	private int bookid;
	private String bookname;
	private String bookauthor;
	private String bookpurchasedate;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookpurchasedate() {
		return bookpurchasedate;
	}

	public void setBookpurchasedate(String bookpurchasedate) {
		this.bookpurchasedate = bookpurchasedate;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor
				+ ", bookpurchasedate=" + bookpurchasedate + "]";
	}

}
