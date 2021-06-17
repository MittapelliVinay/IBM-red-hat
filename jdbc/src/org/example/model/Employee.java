package org.example.model;

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
public class Employee {
	
	public Employee(int int1, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;

}