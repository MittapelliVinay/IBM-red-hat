package org.example.demo.model;


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
public class Account {
	
	private String accountId;
	private AccountType accountType;
	private String accountHolderName;
	private Address address;
	private double balance;
	public String getAccountId() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getAccountHolderName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public Throwable getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
