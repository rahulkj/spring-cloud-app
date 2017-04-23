package com.example.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class SnacksService {
	@Value("${snacks.app.url}")
	private String snacksAppUrl;

	@HystrixCommand(fallbackMethod = "defaultSnacksMenu")
	public String getSnacksMenu() {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = URI.create(snacksAppUrl + "/menu");
		return restTemplate.getForObject(uri, String.class);
	}

	public String defaultSnacksMenu() {
		return "nothing available";
	}
}
