package org.example.demo.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "address")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "stree_tname")
	private String streetName;
	@Column(name = "city")
	private String city;
	
	@OneToOne(mappedBy = "Address",cascade = CascadeType.ALL)
	private Users user;

	public void setStreetName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCity(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setUser(Users u) {
		// TODO Auto-generated method stub
		
	}

}







