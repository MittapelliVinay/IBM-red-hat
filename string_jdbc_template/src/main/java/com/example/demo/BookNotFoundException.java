package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookNotFoundException extends RuntimeException {
	
	public BookNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = 3307411853358267214L;
	private String message;
	
	

}