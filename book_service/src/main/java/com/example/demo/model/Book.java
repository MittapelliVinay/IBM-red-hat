package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
	
	public Book(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}
	private String bookId;
	private String bookName;
	private Double bookPrice;
	public void setBookId(String string) {
		// TODO Auto-generated method stub
		
	}

}
