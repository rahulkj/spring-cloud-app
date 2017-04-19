package com.example.service;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class SnacksService {
	@HystrixCommand(fallbackMethod = "defaultSnacksMenu")
	public String getSnacksMenu() {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = URI.create("http://localhost:9999/menu");
		return restTemplate.getForObject(uri, String.class);
	}

	public String defaultSnacksMenu() {
		return "nothing available";
	}
}
