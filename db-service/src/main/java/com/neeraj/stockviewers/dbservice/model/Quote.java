package com.neeraj.stockviewers.dbservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quotes",catalog="test")
public class Quote {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="user_name")
	private String userName;
	@Column(name="quote")
	private String quote;
	
	public Quote() {
		
	}
	

	public Quote(String userName, String quote) {
		super();
		this.userName = userName;
		this.quote = quote;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public Quote(Integer id, String username, String quote) {
		super();
		this.id = id;
		this.userName = username;
		this.quote = quote;
	}
	
	
	
	

}
