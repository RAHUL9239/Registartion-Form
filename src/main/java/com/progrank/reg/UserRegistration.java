package com.progrank.reg;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.progrank.controller.Username;
import com.progrank.service.UserService;
@Controller
public class UserRegistration {
	@Autowired
	UserService service;
	
	
	
	@RequestMapping("/registration")
	public ModelAndView register()
	{
		return new ModelAndView("register", "objReg", new UserregDTO());
	}
	
	@ModelAttribute("countryList")
	public Map<String, String> countries()
	{
		Map<String , String> map=new HashMap<String , String>();
		map.put("SI", "SINGAPORE");
		map.put("IND", "INDIA");
		map.put("AUS", "AUSTRALIA");
		map.put("USA", "UNITED STATE");
		return map;
	}
	
	@RequestMapping("/processRegistration")
	public ModelAndView processReg(@ModelAttribute("objReg") UserregDTO user)
	{
		System.out.println("hiiiiii");
		if(service.registerUser(user)) {
			return new ModelAndView("login", "obj", new Username());
		}
		return new ModelAndView("register", "objReg", new UserregDTO("reg failde"));
	}
}
