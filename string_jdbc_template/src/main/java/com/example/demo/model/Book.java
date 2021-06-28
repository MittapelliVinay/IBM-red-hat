package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

	private Integer bookId;
	private String bookName;
	private Double bookPrice;

	public Book(int nextInt, String bookName2, double bookPrice2) {
		// TODO Auto-generated constructor stub
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public void displayBook() {


		System.out.println(bookId+"\t"+bookName+"\t"+bookPrice);
		System.out.println("\n");
	}

	public Object getBookId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getBookName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getBookPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBookId(int int1) {
		// TODO Auto-generated method stub
		
	}

	public void setBookName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setBookPrice(double double1) {
		// TODO Auto-generated method stub
		
	}

}