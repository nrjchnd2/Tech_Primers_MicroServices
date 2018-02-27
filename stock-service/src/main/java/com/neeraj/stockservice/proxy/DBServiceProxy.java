package com.neeraj.stockservice.proxy;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="db-service")
@RibbonClient(name="db-service")
@Service
public interface DBServiceProxy {
	
	@GetMapping("/rest/db/{username}")
	public List<String> getSomething(@PathVariable("username") final String username);

}
