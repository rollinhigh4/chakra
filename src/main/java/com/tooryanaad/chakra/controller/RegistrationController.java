package com.tooryanaad.chakra.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tooryanaad.chakra.model.UserInfo;
import com.tooryanaad.chakra.repositories.UserInfoRepository;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	

	@RequestMapping(path="/user/register",method = RequestMethod.GET)
	public String showRegister(ModelMap model) {
		model.addAttribute("userInfo",new UserInfo("example@example.com","hello","vikash","8827829080","Manit",0,0));
		return "registerr";
	}
	
	@RequestMapping(path="/user/register", method=RequestMethod.POST)
	public String saveRegistration(ModelMap model, @Valid UserInfo userInfo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "register";
		}
		
		userInfoRepository.save(userInfo);
		return "welcome";
		
		
		
	}
}
