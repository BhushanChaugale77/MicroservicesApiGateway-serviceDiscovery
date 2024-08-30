package com.prowings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderCotroller {

	@GetMapping("/orders/{userId}")
	public String getUserOrders(@PathVariable String userId) {
		//get orders from database according to provided userId
		return "ORDER-1, ORDER-2, ORDER-3 - for user "+userId;
	}
	
}
