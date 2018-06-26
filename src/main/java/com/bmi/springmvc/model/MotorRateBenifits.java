package com.bmi.springmvc.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class MotorRateBenifits implements Comparable<MotorRateBenifits> {

	private RRMotorRate motorRate;
	private Integer sortId;
	private TMPartners company;
	private List<RPlanBenefitsMapping> planBenifits;
	private RRPlanLoadingDiscount loadingDiscount;
	private TMVechicleInsured vechicleInsured;
	private TMMotorOwner motorOwner;
	private Double basePremium;
	private Double todaysOffer;

	public MotorRateBenifits() {
		super();
	}

	public MotorRateBenifits(RRMotorRate motorRate, List<RPlanBenefitsMapping> planBenifits, TMPartners companry,
			RRPlanLoadingDiscount loadingDiscount, TMMotorOwner motorOwner, TMVechicleInsured vechicleInsured) {
		super();
		this.motorRate = motorRate;
		this.planBenifits = planBenifits;
		this.company = companry;
		this.loadingDiscount = loadingDiscount;
		this.motorOwner = motorOwner;
		this.vechicleInsured = vechicleInsured;

		this.basePremium = ((motorRate.getBaseRate() * vechicleInsured.getSumInsured() / 100) > motorRate
				.getMinimumPremium()) ? (motorRate.getBaseRate() * vechicleInsured.getSumInsured() / 100)
						: motorRate.getMinimumPremium();
				
		this.basePremium  = round(this.basePremium, 2);
				
		this.todaysOffer = round(this.basePremium * this.loadingDiscount.getDiscountPercent() / 100, 2);

	}
	
	public double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

	public RRMotorRate getMotorRate() {
		return motorRate;
	}

	public void setMotorRate(RRMotorRate motorRate) {
		this.motorRate = motorRate;
	}

	public Integer getSortId() {
		return sortId;
	}

	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	public TMPartners getCompany() {
		return company;
	}

	public void setCompany(TMPartners company) {
		this.company = company;
	}

	public List<RPlanBenefitsMapping> getPlanBenifits() {
		return planBenifits;
	}

	public void setPlanBenifits(List<RPlanBenefitsMapping> planBenifits) {
		this.planBenifits = planBenifits;
	}

	public RRPlanLoadingDiscount getLoadingDiscount() {
		return loadingDiscount;
	}

	public void setLoadingDiscount(RRPlanLoadingDiscount loadingDiscount) {
		this.loadingDiscount = loadingDiscount;
	}

	public TMVechicleInsured getVechicleInsured() {
		return vechicleInsured;
	}

	public void setVechicleInsured(TMVechicleInsured vechicleInsured) {
		this.vechicleInsured = vechicleInsured;
	}

	public TMMotorOwner getMotorOwner() {
		return motorOwner;
	}

	public void setMotorOwner(TMMotorOwner motorOwner) {
		this.motorOwner = motorOwner;
	}
	
	

	public Double getTodaysOffer() {
		return todaysOffer;
	}

	public void setTodaysOffer(Double todaysOffer) {
		this.todaysOffer = todaysOffer;
	}

	public Double getBasePremium() {
		return basePremium;
	}

	public void setBasePremium(Double basePremium) {
		this.basePremium = basePremium;
	}

	@Override
	public int compareTo(MotorRateBenifits o) {
		if (this.sortId < o.sortId)
			return -1;
		else if (this.sortId == o.sortId) {
			return 0;
		} else {
			return 1;
		}
	}

}
