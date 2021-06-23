package org.example.hibernate_set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class StudentNotFoundException extends RuntimeException {
	public StudentNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}

	private String message;

}