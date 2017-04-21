package com.pipatpol.spa.assignment2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {
	
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "index";
	}
	
	@RequestMapping(value = { "/test"}, method = RequestMethod.GET)
	public String infoPage(ModelMap model) {
		return "test";
	}
	
}
