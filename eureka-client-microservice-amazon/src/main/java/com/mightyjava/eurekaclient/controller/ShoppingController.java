package com.mightyjava.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ShoppingController {
	@Autowired
	private RestTemplate template;

	@GetMapping("/amazon-payment/{price}")
	public String payNow(@PathVariable int price)
	{
		System.out.println("invoke Payment a geldi");
		//Eger Euroke kullanmasaydik kullanmasaydik ,payment microservice e soyle erisirdik
		String url = "http://localhost:8888/payment-provider/payNow/" + price;
	
		//Host ve port u ignore ediyoruz Eureka ile
		url = "http://PAYMENTSERVICE/paymentprovider/payNow/" + price;
		
		return template.getForObject(url, String.class);		
	}
	@GetMapping("/moviesall")
	public String getMovies()
	{		
		return "Su an hic movie yok";
	}
}
