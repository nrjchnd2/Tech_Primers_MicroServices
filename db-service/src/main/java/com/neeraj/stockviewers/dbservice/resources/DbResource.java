package com.neeraj.stockviewers.dbservice.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neeraj.stockviewers.dbservice.model.Quote;
import com.neeraj.stockviewers.dbservice.model.Quotes;
import com.neeraj.stockviewers.dbservice.repository.QuoteRepository;

@RestController
@RequestMapping("/rest/db")
public class DbResource {
	@Autowired
	private QuoteRepository repo;

	@GetMapping("/{username}")
	public List<String> getQuote(@PathVariable final String username) {

		return getQuotesByUserName(username);

	}

	@PostMapping("/user")
	public ResponseEntity<List<String>> addQuotes(@RequestBody final Quotes quotes) {
		quotes.getQuotes().stream().map(quote->new Quote(quotes.getUserName(),quote))
			.forEach(quotez->repo.save(quotez));
		return new ResponseEntity<List<String>>(getQuotesByUserName(quotes.getUserName()),HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{username}")
	public List<String> deleteQuotesByUserName(@PathVariable final String username){
		List<Quote> li=repo.findByUserName(username);
		repo.delete(li);
		return getQuotesByUserName(username);
	}
	

	private List<String> getQuotesByUserName(final String username) {
		return repo.findByUserName(username).stream().
				map(Quote::getQuote).collect(Collectors.toList());
	}
	
}
