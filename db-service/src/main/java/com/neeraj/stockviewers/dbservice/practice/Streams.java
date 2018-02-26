package com.neeraj.stockviewers.dbservice.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.neeraj.stockviewers.dbservice.model.Quote;

public class Streams {

	public static void main(String[] args) {
		Quote q1=new Quote(1,"naxi", "abc");
		Quote q2=new Quote(2,"baxi", "abc");
		Quote q3=new Quote(3,"taxi", "abc");
		List<Quote> li=new ArrayList<>();
		li.add(q1);li.add(q2);li.add(q3);
		
		List<String> l2=li.stream().map(q->q.getQuote()).collect(Collectors.toList());
		
		
		System.out.println(l2);

	}

	private static List<Integer> getSum(List<Integer> li) {
		return(li.stream().filter(i->i%2==0)).collect(Collectors.toList());
	}

}
