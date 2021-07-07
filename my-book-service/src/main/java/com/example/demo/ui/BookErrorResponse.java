package com.example.demo.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookErrorResponse {
	
	private String message;
	private int statusCode;
	private Long errorReportingTime;
	public void setMessage(String message2) {
		// TODO Auto-generated method stub
		
	}
	public void setErrorReportingTime(long currentTimeMillis) {
		// TODO Auto-generated method stub
		
	}
	public void setStatusCode(int value) {
		// TODO Auto-generated method stub
		
	}

}
