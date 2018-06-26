package com.bmi.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmi.springmvc.model.TMNationality;
import com.bmi.springmvc.service.NationService;

@Controller
@RequestMapping("/")
public class NationController {

	@Autowired
	NationService service;
	
	@Autowired
	MessageSource messageSource;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/nations/list" }, method = RequestMethod.GET)
	public String listNations(ModelMap model) {

		List<TMNationality> nations = service.findAllNations();
		model.addAttribute("nations", nations);
		return "allnations";
	}

}
