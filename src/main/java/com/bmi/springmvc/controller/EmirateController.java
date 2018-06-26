package com.bmi.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmi.springmvc.model.TMEmirates;
import com.bmi.springmvc.service.EmirateService;

@Controller
@RequestMapping("/")
public class EmirateController {

	@Autowired
	EmirateService service;
	
	@Autowired
	MessageSource messageSource;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/emirates/list" }, method = RequestMethod.GET)
	public String listEmirates(ModelMap model) {

		List<TMEmirates> emirates = service.findAllEmirates();
		model.addAttribute("emirates", emirates);
		return "allemirates";
	}

}
