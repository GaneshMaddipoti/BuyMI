package com.bmi.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmi.springmvc.model.Customer;
import com.bmi.springmvc.model.MotorRateBenifits;
import com.bmi.springmvc.model.RPlanBenefitsMapping;
import com.bmi.springmvc.model.RRMotorRate;
import com.bmi.springmvc.model.RRPlanLoadingDiscount;
import com.bmi.springmvc.model.TMBenefit;
import com.bmi.springmvc.model.TMMotorOwner;
import com.bmi.springmvc.model.TMMotorOwnerOptional;
import com.bmi.springmvc.model.TMPartners;
import com.bmi.springmvc.model.TMVechicleInsured;
import com.bmi.springmvc.model.TMVechicleInsuredOptional;
import com.bmi.springmvc.service.BenifitService;
import com.bmi.springmvc.service.BodyTypeService;
import com.bmi.springmvc.service.EmirateService;
import com.bmi.springmvc.service.MotorOwnerService;
import com.bmi.springmvc.service.MotorRateService;
import com.bmi.springmvc.service.NationService;
import com.bmi.springmvc.service.PartnerService;
import com.bmi.springmvc.service.UserRoleService;
import com.bmi.springmvc.service.VehicleInsuredService;
import com.bmi.springmvc.service.VehicleMakeService;
import com.bmi.springmvc.service.VehicleModelService;
import com.bmi.springmvc.util.MetaDataUtil;

@Controller
@RequestMapping("/")
public class InsuranceController {

	@Autowired
	UserRoleService userRoleService;
	@Autowired
	BodyTypeService bodyTypeService;
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
	MotorOwnerService motorOwnerService;
	@Autowired
	VehicleInsuredService vehicleInsuredService;
	@Autowired
	MotorRateService motorRateService;
	@Autowired
	BenifitService benifitService;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(method = RequestMethod.GET, value = "/insuranceselection")
	public String insuranceSelection(ModelMap model, HttpSession httpSession) {
		return "insuranceselection";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/vehicledetails")
	public String vehicledetails(ModelMap model, HttpSession httpSession) {

		return "vehicledetails";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/plancomparision")
	public String planComparision(ModelMap model, HttpSession httpSession) {
		return "plancomparision";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/policydetails")
	public String policyDetails(ModelMap model, HttpSession httpSession, @RequestParam String arg) {
		int index = Integer.parseInt(arg);
		TMPartners company = (TMPartners) httpSession.getAttribute("company" + arg);
		httpSession.setAttribute("policyDetailsCompany", company);
		List<MotorRateBenifits> motorRateBenifitsList = (List<MotorRateBenifits>)httpSession.getAttribute("motorRateBenifits");
		httpSession.setAttribute("policyDetailsMotorRate", motorRateBenifitsList.get(index));
		
		Object object = httpSession.getAttribute("vehicleInsured");
		TMVechicleInsured vehicleInsured = (object != null) ? (TMVechicleInsured) object : new TMVechicleInsured();
		String vehicleModel = vehicleModelService.getAllVehicleModelMap().get(vehicleInsured.getVehicleModelLinkId());
		String vehicleMake = vehicleMakeService.getAllVehicleMakeMap().get(vehicleInsured.getVehicleMakeLinkId());
		
		httpSession.setAttribute("vehicleModel", vehicleModel);
		httpSession.setAttribute("vehicleMake", vehicleMake);
		
		return "policydetails";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/insuranceselectiondetails")
	public String insuranceSelectionDetails(ModelMap model, HttpSession httpSession) {

		// for motor owner

		model.addAttribute("insuredTypes", MetaDataUtil.getInsuredTypes());
		model.addAttribute("genders", MetaDataUtil.getGenders());
		model.addAttribute("yesOrNos", MetaDataUtil.getYesOrNos());
		model.addAttribute("nations", nationService.getAllNationsMap());
		model.addAttribute("noNCDYears", MetaDataUtil.getNumbers(1, 5));
		model.addAttribute("uaeDlAgeInYears", MetaDataUtil.getNumbers(1, 5));

		Object object = httpSession.getAttribute("motorOwner");
		TMMotorOwner motorOwner = (object != null) ? (TMMotorOwner) object : new TMMotorOwner();
		object = httpSession.getAttribute("customer");
		Customer customer = (object != null) ? (Customer) object : new Customer();
		
		model.addAttribute("insuredEmirates", emirateService.getAllVehicleMakeMap());		
		object = httpSession.getAttribute("motorOwnerOptional");
		TMMotorOwnerOptional motorOwnerOptional = (object != null) ? (TMMotorOwnerOptional) object : new TMMotorOwnerOptional();
		
		motorOwner.setInsuredName(customer.getName());
		motorOwner.setInsuredMobileNo(customer.getPhone());
		motorOwner.setInsuredEmailId(customer.getEmail());

		model.addAttribute("motorOwner", motorOwner);
		model.addAttribute("motorOwnerOptional", motorOwnerOptional);

		// for vehicle insured
		model.addAttribute("registrationTypes", MetaDataUtil.getRegistrationTypes());
		model.addAttribute("registrationPlaces", emirateService.getAllVehicleMakeMap());
		model.addAttribute("vehicleMakes", vehicleMakeService.getAllVehicleMakeMap());
		model.addAttribute("vehicleModels", vehicleModelService.getAllVehicleModelMap());
		model.addAttribute("noPassengers", MetaDataUtil.getNumbers(1, 5));
		model.addAttribute("manufactureYears", MetaDataUtil.getNumbers(1990, 2017));
		model.addAttribute("nonGCCSpecs", MetaDataUtil.getYesOrNos());
		model.addAttribute("bodyTypes", bodyTypeService.getAllBodyTypeMap());
		model.addAttribute("bankMortgages", vehicleInsuredService.getAllBankMortgageMap());
		model.addAttribute("vehicleColors", vehicleInsuredService.getAllVehicleColorMap());

		object = httpSession.getAttribute("vehicleInsured");
		TMVechicleInsured vehicleInsured = (object != null) ? (TMVechicleInsured) object : new TMVechicleInsured();
		
		object = httpSession.getAttribute("vehicleInsuredOptional");
		TMVechicleInsuredOptional vehicleInsuredOptional = (object != null) ? (TMVechicleInsuredOptional) object : new TMVechicleInsuredOptional();

		model.addAttribute("vehicleInsured", vehicleInsured);
		model.addAttribute("vehicleInsuredOptional", vehicleInsuredOptional);

		return "insuranceselectiondetails";
	}

	@RequestMapping(value = "/addMotorOwner", method = RequestMethod.POST)
	public @ResponseBody TMMotorOwner submittedFromData(@RequestBody TMMotorOwner motorOwner,
			HttpServletRequest request, HttpSession httpSession) {
		motorOwner = motorOwnerService.saveMotorOwner(motorOwner);
		httpSession.setAttribute("motorOwner", motorOwner);
		return motorOwner;
	}
	
	@RequestMapping(value = "/addMotorOwnerOptional", method = RequestMethod.POST)
	public @ResponseBody TMMotorOwnerOptional submittedFromData1(@RequestBody TMMotorOwnerOptional motorOwnerOptional,
			HttpServletRequest request, HttpSession httpSession) {
		motorOwnerOptional = motorOwnerService.saveMotorOwnerOptional(motorOwnerOptional);
		httpSession.setAttribute("motorOwnerOptional", motorOwnerOptional);
		return motorOwnerOptional;
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/addVehicleInsured", method = RequestMethod.POST)
	public @ResponseBody TMVechicleInsured submittedFromDataVI(@RequestBody TMVechicleInsured vehicleInsured,
			HttpServletRequest request, HttpSession httpSession) {
		vehicleInsured = vehicleInsuredService.saveVehicleInsured(vehicleInsured);
		httpSession.setAttribute("vehicleInsured", vehicleInsured);
		getMotorRates(httpSession);
		return vehicleInsured;
	}
	
	@RequestMapping(value = "/addVehicleInsuredOptional", method = RequestMethod.POST)
	public @ResponseBody TMVechicleInsuredOptional submittedFromDataVI1(@RequestBody TMVechicleInsuredOptional vechicleInsuredOptional,
			HttpServletRequest request, HttpSession httpSession) {
		vechicleInsuredOptional = vehicleInsuredService.saveVehicleInsuredOptional(vechicleInsuredOptional);
		httpSession.setAttribute("vehicleInsuredOptional", vechicleInsuredOptional);
		getMotorRates(httpSession);
		return vechicleInsuredOptional;
	}
	
	private void getMotorRates(HttpSession httpSession){
		TMMotorOwner motorOwner = (TMMotorOwner) httpSession.getAttribute("motorOwner");
		TMVechicleInsured vehicleInsured = (TMVechicleInsured) httpSession.getAttribute("vehicleInsured");

		// Getting all matched motor rates
		List<RRMotorRate> motorRates = motorRateService.getMotorRate(motorOwner, vehicleInsured);
		List<MotorRateBenifits> motorRateBenifitsList = new ArrayList<>();
		if (!motorRates.isEmpty()) {
			for (int i = 0; i < 3 && i < motorRates.size(); i++) {
				RRMotorRate motorRate = motorRates.get(i);
				TMPartners company = motorRateService.getPlanCompany(motorRate);
				httpSession.setAttribute("company" + i, company);
				RRPlanLoadingDiscount loadingDiscount = motorRateService.getLoadingDiscounts(motorRate);
				List<RPlanBenefitsMapping> planBenifits = motorRateService.getPlanBenifitMaps(motorRate);
				for (RPlanBenefitsMapping planBenefitsMapping : planBenifits) {
					planBenefitsMapping.getBenefitLinkId();
				}
				MotorRateBenifits motorRateBenifits = new MotorRateBenifits(motorRate, planBenifits, company,
						loadingDiscount, motorOwner, vehicleInsured);
				motorRateBenifitsList.add(motorRateBenifits);
			}
		}
		httpSession.setAttribute("motorRateBenifits", motorRateBenifitsList);
	}

}
