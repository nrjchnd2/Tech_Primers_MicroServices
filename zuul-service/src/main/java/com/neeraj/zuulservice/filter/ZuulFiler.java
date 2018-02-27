package com.neeraj.zuulservice.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
@Component
public class ZuulFiler extends ZuulFilter {

	@Override
	public Object run() {
		
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
