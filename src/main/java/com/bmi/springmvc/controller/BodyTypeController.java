package com.bmi.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmi.springmvc.model.TMBodyType;
import com.bmi.springmvc.service.BodyTypeService;

@Controller
@RequestMapping("/")
public class BodyTypeController {

	@Autowired
	BodyTypeService service;
	
	@Autowired
	MessageSource messageSource;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/bodytype/list" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

		List<TMBodyType> bodyTypes = service.findAllBodyTypes();
		model.addAttribute("bodyTypes", bodyTypes);
		return "allbodytypes";
	}

}
