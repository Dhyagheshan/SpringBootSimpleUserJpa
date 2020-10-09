package com.sb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sb.demo.dao.UserRepo;
import com.sb.demo.model.User;

@RestController
public class UserController {
	
	@Autowired
	UserRepo repo;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addUser")
	public String addUser(User user)
	{
		repo.save(user);
		return "home.jsp";
	}
	@RequestMapping("/getUser")
	public ModelAndView getUser(@RequestParam int userid)
	{
		ModelAndView mv=new ModelAndView("showUser.jsp");
		User user=repo.findById(userid).orElse(new User());
		mv.addObject(user);
		return mv;
	}
	
	@GetMapping("/welcome/{username}")
	public String welcomeUser(@PathVariable("username") String username){
		
		return "Hello "+username+". Welcome to SpringBootSimpleUserJPA Application";
	}

}
