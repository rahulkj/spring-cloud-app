package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Menu;
import com.example.service.SnacksService;

@RestController
public class CoffeeController {

	@Autowired
	Menu menu;

	@Autowired
	SnacksService snacksService;

	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String getMenu() {
		return "Coffee menu is : " + menu.getMenu() + " and the snacks menu has " + snacksService.getSnacksMenu();
	}

}
