package com.tooryanaad.chakra.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tooryanaad.chakra.model.Riddles;
import com.tooryanaad.chakra.repositories.RiddleRepository;

@Controller
public class QuestionController {
	
	@Autowired
	private RiddleRepository riddleRepository;
	
	@RequestMapping(path="/admin/addRiddle",method=RequestMethod.GET)
	public String showAddRiddle(ModelMap model) {
		model.addAttribute("riddles",new Riddles(0,"Riddle","Answer"));
		return "riddle";
	}
	
	@RequestMapping(path="/admin/addRiddle",method=RequestMethod.POST)
	public String addRiddle(ModelMap model, @Valid Riddles riddles, BindingResult result) {
		if(result.hasErrors()) {
			return "riddle";
		}
		
		riddleRepository.save(riddles);
		return "riddle";

	}
	
	@RequestMapping(path="/admin/allRiddles", method= RequestMethod.GET)
	public String showAllRiddles(ModelMap model) {
		
		model.put("qna", riddleRepository.findAll());
		return "list-qna";
	}

}
