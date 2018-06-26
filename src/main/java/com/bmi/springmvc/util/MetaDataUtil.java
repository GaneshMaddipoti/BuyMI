package com.bmi.springmvc.util;

import java.util.HashMap;
import java.util.Map;

public class MetaDataUtil {
	
	public static Map<String, String> getInsuredTypes(){
		Map<String, String> insuredTypes = new HashMap<>();
		insuredTypes.put("Individual", "Individual");
		insuredTypes.put("Comapnay", "Company");
		return insuredTypes;
	}
	
	public static Map<String, String> getGenders(){
		Map<String, String> genders = new HashMap<>();
		genders.put("Male", "Male");
		genders.put("Female", "Female");
		return genders;
	}
	
	public static Map<String, String> getYesOrNos(){
		Map<String, String> yesNos = new HashMap<>();
		yesNos.put("Yes", "Yes");
		yesNos.put("No", "No");
		return yesNos;
	}
	
	public static Map<String, String> getRegistrationTypes(){
		Map<String, String> insuredTypes = new HashMap<>();
		insuredTypes.put("Private", "Private");
		insuredTypes.put("Commercial", "Commercial");
		return insuredTypes;
	}
	
	public static Map<Integer, Integer> getNumbers(Integer from, Integer to){
		Map<Integer, Integer> years = new HashMap<>();
		for(int i=from; i<= to; i++){
			years.put(i, i);
		}
		return years;
	}
	

}
