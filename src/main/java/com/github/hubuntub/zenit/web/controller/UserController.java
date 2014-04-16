package com.github.hubuntub.zenit.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.hubuntub.zenit.model.User;
import com.github.hubuntub.zenit.service.UserService;


@RequestMapping("/user")
@Controller
public class UserController{


	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<User> getUsers(){
		try {
			return userService.getAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
}
