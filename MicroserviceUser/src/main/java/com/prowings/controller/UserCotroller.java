package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserCotroller {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/user/{userId}")
	public String getUsersOrder(@PathVariable String userId) {
		String orders = restTemplate.getForObject("http://MICROSERVICEORDER/orders/"+userId, String.class);
		
		return "User Orders("+userId+") : "+orders;
	}
	
}
