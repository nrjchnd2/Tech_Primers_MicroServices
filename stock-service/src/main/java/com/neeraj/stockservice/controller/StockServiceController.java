package com.neeraj.stockservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neeraj.stockservice.proxy.DBServiceProxy;

@RestController
@RequestMapping("/rest/stock")
public class StockServiceController {
	
	@Autowired
	DBServiceProxy proxy;
	
	@GetMapping("/{username}")
	public List<String> getStockQuotes(@PathVariable final String username) {
		return proxy.getSomething(username);
		
	}

}
