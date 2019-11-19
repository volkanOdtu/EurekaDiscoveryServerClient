package com.mightyjava.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@GetMapping("/payment-provider/payNow/{price}")
	public String payNow(@PathVariable int price)
	{
		return "payment with " +price+ "is successful";
	}
	@GetMapping("/movies")
	public String getMovies()
	{		
		return "Su an hic movie yok";
	}
}