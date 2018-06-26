package com.bmi.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmi.springmvc.model.TMPartners;
import com.bmi.springmvc.model.TMUserRole;
import com.bmi.springmvc.service.PartnerService;
import com.bmi.springmvc.service.UserRoleService;

@Controller
@RequestMapping("/")
public class UserRoleController {

	@Autowired
	UserRoleService service;
	
	@Autowired
	MessageSource messageSource;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/userrole/list" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

		List<TMUserRole> userRoles = service.findAllUserRoles();
		model.addAttribute("userRoles", userRoles);
		return "alluserroles";
	}

}
