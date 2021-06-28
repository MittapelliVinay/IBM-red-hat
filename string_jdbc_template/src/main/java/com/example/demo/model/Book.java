package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Book {

	private Integer bookId;
	private String bookName;
	private Double bookPrice;

	public Book(int nextInt, String bookName2, double bookPrice2) {
		// TODO Auto-generated constructor stub
	}

	public void displayBook() {


		System.out.println(bookId+"\t"+bookName+"\t"+bookPrice);
		System.out.println("\n");
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Object getBookId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Object getBookPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Object getBookName() {
		// TODO Auto-generated method stub
		return null;
	}

}