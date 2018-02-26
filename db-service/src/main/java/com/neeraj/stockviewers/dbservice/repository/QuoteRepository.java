package com.neeraj.stockviewers.dbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neeraj.stockviewers.dbservice.model.Quote;
@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {

	List<Quote> findByUserName(String username);

}
