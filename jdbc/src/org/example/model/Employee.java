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

	public Employee(int nextInt, String firstName2, String lastName2, String email2) {
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setFirstName(String firstName2) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}
}