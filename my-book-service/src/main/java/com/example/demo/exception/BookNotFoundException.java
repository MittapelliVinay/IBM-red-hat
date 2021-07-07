package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -3150816611453843183L;
	
	private String message;

}