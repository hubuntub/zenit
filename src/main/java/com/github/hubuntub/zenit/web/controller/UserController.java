package com.github.hubuntub.zenit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/hello")
@Controller
public class UserController{


	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model){
		model.addAttribute("username", "Zenit user");
		return "hello";
	}
}
