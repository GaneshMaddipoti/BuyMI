package com.bmi.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmi.springmvc.model.TMEmirates;
import com.bmi.springmvc.model.TMPlanMaster;
import com.bmi.springmvc.service.EmirateService;
import com.bmi.springmvc.service.PlanMasterService;

@Controller
@RequestMapping("/")
public class PlanMasterController {

	@Autowired
	PlanMasterService service;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/planmasters/list" }, method = RequestMethod.GET)
	public String listPlanMasters(ModelMap model) {

		List<TMPlanMaster> planMasters = service.findAllPlanMasters();
		model.addAttribute("planMasters", planMasters);
		return "allplanmasters";
	}

}
