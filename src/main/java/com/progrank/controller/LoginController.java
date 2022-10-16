package com.progrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {


	@RequestMapping("/")
	public String login(@ModelAttribute("obj") Username user)
	{
		return "login";
	}

	@RequestMapping("/login-panel")
	public String home(@ModelAttribute("obj") Username login, Model model, @RequestParam("action") String click)
	{
		System.out.println(click);
		if(click.equalsIgnoreCase("login")) {
			if(login.getUsername().equals("Rahul")&& login.getUserPassword().equals("141"))
			{
				return "home";
			}
			else
			{
				model.addAttribute("msg", "invalid");
				return "login";
			}
			
		}
		else if(click.equalsIgnoreCase("register now"))
		{
			return "redirect:/registration";
		}
		return "login";
	}



}


