package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.SnacksService;

@RefreshScope
@RestController
public class CoffeeController {
	@Value("${menu}")
	private String menu;
	
	@Autowired
	SnacksService snacksService;
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String getMenu() {
		return "Coffee menu is : " + menu + " and the snacks menu has " + snacksService.getSnacksMenu();
	}

}
