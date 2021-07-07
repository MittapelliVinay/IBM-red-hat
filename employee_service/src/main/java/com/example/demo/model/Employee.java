package com.example.demo.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "employee_id")
	private String employeeId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	//@Basic(optional = false)
	@Column(name= "isactive")
	private Boolean isActive;
	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getIsActive() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setLastName(Object lastName2) {
		// TODO Auto-generated method stub
		
	}
	public void setFirstName(Object firstName2) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
	public void setIsActive(Object isActive2) {
		// TODO Auto-generated method stub
		
	}
	
}
