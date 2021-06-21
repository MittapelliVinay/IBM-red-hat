package org.example.demo.dto;


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

public class AccountDTO {
	
	public AccountDTO(String string, String string2, String string3, String string4, String string5, String string6,
			double double1) {
		// TODO Auto-generated constructor stub
	}
	private String accountId;
	private String accountType;
	private String accountHolderName;
	private String  addressLine1;
	private String addressLine2;
	private String city;
	private double balance;

}
