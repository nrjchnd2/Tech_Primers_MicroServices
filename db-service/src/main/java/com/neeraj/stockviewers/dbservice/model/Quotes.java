package com.neeraj.stockviewers.dbservice.model;

import java.util.List;

public class Quotes {

	private String userName;
	private List<String> quotes;
	
	public Quotes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quotes(String userName, List<String> quote) {
		super();
		this.userName = userName;
		this.quotes = quote;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getQuotes() {
		return quotes;
	}

	public void setQuotes(List<String> quote) {
		this.quotes = quote;
	}
	
	
}
