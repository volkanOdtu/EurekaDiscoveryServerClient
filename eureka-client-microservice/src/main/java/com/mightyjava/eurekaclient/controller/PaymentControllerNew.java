package com.mightyjava.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentControllerNew {

	@GetMapping("/paymentprovider/payNow/{price}")
	public String payNow(@PathVariable int price)
	{
		return "payment with " +price+ "is successful";
	}
	@GetMapping("/moviesall")
	public String getMovies()
	{		
		return "Su an hic movie yok";
	}
}
