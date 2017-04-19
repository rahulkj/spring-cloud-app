package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SnacksController {
	@Value("${menu}")
	private String menu;

	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String getMenu() {
		return menu;
	}
}
