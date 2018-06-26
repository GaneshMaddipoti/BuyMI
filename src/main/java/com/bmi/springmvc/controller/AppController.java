package com.bmi.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bmi.springmvc.model.Customer;
import com.bmi.springmvc.model.MotorRateBenifits;
import com.bmi.springmvc.model.RPlanBenefitsMapping;
import com.bmi.springmvc.model.RRMotorRate;
import com.bmi.springmvc.model.TMEmirates;
import com.bmi.springmvc.model.TMMotorOwner;
import com.bmi.springmvc.model.TMPartners;
import com.bmi.springmvc.model.TMUserRole;
import com.bmi.springmvc.model.TMVechicleInsured;
import com.bmi.springmvc.service.EmirateService;
import com.bmi.springmvc.service.NationService;
import com.bmi.springmvc.service.PartnerService;
import com.bmi.springmvc.service.UserRoleService;
import com.bmi.springmvc.service.VehicleMakeService;
import com.bmi.springmvc.service.VehicleModelService;
import com.bmi.springmvc.util.MetaDataUtil;


@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	UserRoleService userRoleService;
	@Autowired
	PartnerService partnerService;
	@Autowired
	EmirateService emirateService;
	@Autowired
	NationService nationService;
	@Autowired
	VehicleMakeService vehicleMakeService;
	@Autowired
	VehicleModelService vehicleModelService;
	
	@Autowired
	MessageSource messageSource;
	
	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String getHome(ModelMap model, HttpSession httpSession) {
		httpSession.removeAttribute("motorOwner");
		httpSession.removeAttribute("vehicleInsured");
		return "home1";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/admin")
	public String admin(ModelMap model) {
	    return "admin";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/custinfo")
	public String insuranceSelection(ModelMap model, HttpSession httpSession) {
		Object object = httpSession.getAttribute("customer");
		Customer customer = (object != null) ? (Customer) object : new Customer();
		model.addAttribute("customer", customer);		
		return "custinfo";
	}
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String submit(@ModelAttribute("customer") Customer customer, BindingResult result,
			HttpServletRequest request, HttpSession httpSession, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		httpSession.setAttribute("customer", customer);
		return "chooseinsurance";
	}
	
	@RequestMapping(value="/loadUserRoles") 
	public ModelAndView loadUserRoles(ModelMap model) throws Exception {
	    List<TMUserRole> userRoles = userRoleService.findAllUserRoles();
		model.addAttribute("userRoles", userRoles);
	    ModelAndView mav = new ModelAndView();
	    String viewName = "alluserroles";
	    mav.setViewName(viewName);
	    return mav;
	}
	
	@RequestMapping(value="/getPartners") 
	public ModelAndView getPartners(ModelMap model) throws Exception {
	    List<TMPartners> partners = partnerService.findAllPartners();
		model.addAttribute("partners", partners);
	    ModelAndView mav = new ModelAndView();
	    String viewName = "allpartners";
	    mav.setViewName(viewName);
	    return mav;
	}
	
	@RequestMapping(value="/getEmirates") 
	public ModelAndView getEmirates(ModelMap model) throws Exception {
	    List<TMEmirates> emirates = emirateService.findAllEmirates();
		model.addAttribute("emirates", emirates);
	    ModelAndView mav = new ModelAndView();
	    String viewName = "allemirates";
	    mav.setViewName(viewName);
	    return mav;
	}

	

}
