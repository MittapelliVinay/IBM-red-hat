package com.example.spring_hibernate_integration.repo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -2007886334229652024L;
    private String message;
	/**
	 * 
	 */
	
	
	
	
}