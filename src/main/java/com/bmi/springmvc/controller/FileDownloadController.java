package com.bmi.springmvc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bmi.springmvc.model.MotorRateBenifits;
import com.bmi.springmvc.model.TMMotorOwner;
import com.bmi.springmvc.model.TMPartners;
import com.bmi.springmvc.model.TMVechicleInsured;
import com.bmi.springmvc.service.VehicleMakeService;
import com.bmi.springmvc.service.VehicleModelService;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

@Controller
@RequestMapping("/download")
public class FileDownloadController {
	
	@Autowired
	VehicleMakeService vehicleMakeService;
	@Autowired
	VehicleModelService vehicleModelService;
	
	@RequestMapping("/pdf/{fileName:.+}")
	public void downloadPDFResource(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("fileName") String fileName, HttpSession httpSession) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");

		try {
			
			int index = Integer.parseInt(fileName);
			
			TMMotorOwner motorOwner = (TMMotorOwner) httpSession.getAttribute("motorOwner");
			TMVechicleInsured vehicleInsured = (TMVechicleInsured) httpSession.getAttribute("vehicleInsured");
			
			String vehicleModel = vehicleModelService.getAllVehicleModelMap().get(vehicleInsured.getVehicleModelLinkId());
			String vehicleMake = vehicleMakeService.getAllVehicleMakeMap().get(vehicleInsured.getVehicleMakeLinkId());
			
			TMPartners company = (TMPartners) httpSession.getAttribute("company" + fileName);
			List<MotorRateBenifits> motorRateBenifits = (List<MotorRateBenifits>) httpSession.getAttribute("motorRateBenifits");
			
			OutputStream file = new FileOutputStream(new File("Quotation_"+company.getPartnerName()+".pdf"));
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);
		
			PrintWriter pw = new PrintWriter(new FileOutputStream("test1.html"));
	    	StringBuilder sb = new StringBuilder();
	    	sb.append("<html><head><title>Quotaion</title><style>table{border: 1px solid black;}"
	    			+ "th {background-color: lightblue;}</style></head><body><h3 color='red'>"
	    			+ "Quotaion for Private Motor Insurance - "+ company.getPartnerName() +" </h3>	<br /> "
	    			+ "Dear User, Thanks you for showing interest in Buy-My Insurance	insurance company and providing us an "
	    			+ "opportunity to present a uniquely Motor Insurance Coverage for your vehicle through "+company.getPartnerName()+" Brokers.<br/>	"
	    			+ "<br /> Kindly ensure that the information provided is correct and accurate.	<br />");
	    	
	    	sb.append("<table width='100%'>"
	    			+ "<tr><th>Quotation</th><th></th></tr>"
	    			+ "<tr><td>Quotation No :</td><td>12223</td></tr>"
	    			+ "<tr><td>Date :</td><td>"+sdf.format(Calendar.getInstance().getTime())+"</td></tr>"
	    			+ "<tr><td>Plan :</td><td>Buy-My Star</td></tr>"
	    			+ "<tr><td>Validity of quotation :</td><td>30 Days</td></tr>");
	    	
	    	sb.append("<tr><th>Policy Details</th><th></th></tr>"
	    			+ "<tr><td>Insurance Company :</td><td>"+company.getPartnerName()+"</td></tr>"
	    			+ "<tr><td>Agent Name :</td><td>"+company.getContactPersonName()+"</td></tr>"
	    			+ "<tr><td>Insurance Value of vehicle :</td><td>"+vehicleInsured.getSumInsured()+"</td></tr>"
	    			+ "<tr><td>Policy Type :</td><td>Motor Comprehensive</td></tr>");
	    	
	    	sb.append("<tr><th>Customer Details</th><th></th></tr>"
	    			+ "<tr><td>Customer Name :</td><td>"+motorOwner.getInsuredName()+"</td></tr>"
	    			+ "<tr><td>Age :</td><td>"+motorOwner.getAge()+" Years </td></tr>"
	    			+ "<tr><td>Phone Number :</td><td>"+motorOwner.getInsuredMobileNo()+"</td></tr>"
	    			+ "<tr><td>Email :</td><td>"+motorOwner.getInsuredEmailId()+"</td></tr>");

	    	sb.append("<tr><th>Vehicle Details</th><th></th></tr>"
	    			+ "<tr><td>Insured Value :</td><td>"+vehicleInsured.getSumInsured()+"</td></tr>"
	    			+ "<tr><td>Model :</td><td>"+vehicleModel+"</td></tr>"
	    			+ "<tr><td>Vehicle Make :</td><td>"+vehicleMake+"</td></tr>"
	    			+ "<tr><td>No. Of Seats :</td><td>"+vehicleInsured.getNoPassenger()+"</td></tr>");
	    	
	    	sb.append("<tr><th>Plan Details</th><th></th></tr>");
	    	
	    	for(int i=0; i< motorRateBenifits.get(index).getPlanBenifits().size(); i++){
	    		sb.append("<tr><td>" + motorRateBenifits.get(index).getPlanBenifits().get(i).getBenefitLinkId().getBenefitName() + ":</td><td>"
		    			+ ((motorRateBenifits.get(index).getPlanBenifits().get(i).getIncluded() == 1) ? "Covered" : "Not Covered")  +"</td></tr>");
	    	}
	    		
			sb.append("<tr><td>Base Premium :</td><td>"+ motorRateBenifits.get(index).getBasePremium() +"</td></tr>"
	    			+ "<tr><td>Total Premium :</td><td>"+motorRateBenifits.get(index).getBasePremium() +"</td></tr>"
	    			+ "<tr><td>Today's Offer :</td><td>"+ (motorRateBenifits.get(index).getBasePremium() - motorRateBenifits.get(index).getTodaysOffer()) +"</td></tr>");
	    	
	    	sb.append("</table>");
	    	
	    	sb.append("<br/>We will be glad to issue a policy for your vehicle on your acceptance of the above quotation"
	    			+ "<br/><br/><br/><br/><br/>Regards,<br/>Admin<br/>Buy-My Insurance<br/><br/><br/>");
	    	
	    	sb.append("</body></html>");
	    	
	    	
	    	
	    	pw.print(sb.toString());
	    	pw.flush();
	    	pw.close();

			document.open();
			XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream("test1.html"));
			document.close();
			file.close();
			response.setContentType("application/pdf");
			response.addHeader("Content-Disposition", "attachment; filename=Quotation_"+company.getPartnerName()+".pdf");
			try {
				Files.copy(Paths.get("Quotation_"+company.getPartnerName()+".pdf"), response.getOutputStream());
				response.getOutputStream().flush();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/pdfall/{fileName:.+}")
	public void downloadPDFAllResource(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("fileName") String fileName, HttpSession httpSession) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");

		try {
			
			TMMotorOwner motorOwner = (TMMotorOwner) httpSession.getAttribute("motorOwner");
			TMVechicleInsured vehicleInsured = (TMVechicleInsured) httpSession.getAttribute("vehicleInsured");
			
			String vehicleModel = vehicleModelService.getAllVehicleModelMap().get(vehicleInsured.getVehicleModelLinkId());
			String vehicleMake = vehicleMakeService.getAllVehicleMakeMap().get(vehicleInsured.getVehicleMakeLinkId());
			
			List<MotorRateBenifits> motorRateBenifits = (List<MotorRateBenifits>) httpSession.getAttribute("motorRateBenifits");
			
			OutputStream file = new FileOutputStream(new File("Quotation_All.pdf"));
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);
		
			PrintWriter pw = new PrintWriter(new FileOutputStream("test1.html"));
	    	StringBuilder sb = new StringBuilder();
	    	
	    	sb.append("<html><head><title>Quotaion</title><style>table{border: 1px solid black;}"
	    			+ "th {background-color: lightblue;}</style></head><body>");
	    	
	    	for(int m = 0; m<3 ;m++){
	    	
		    	TMPartners company = (TMPartners) httpSession.getAttribute("company" + m);
		    	
		    	sb.append("<h3 color='red'>"
		    			+ "Quotaion for Private Motor Insurance - "+ company.getPartnerName() +" </h3>	<br /> "
		    			+ "Dear User, Thanks you for showing interest in Buy-My Insurance	insurance company and providing us an "
		    			+ "opportunity to present a uniquely Motor Insurance Coverage for your vehicle through "+company.getPartnerName()+" Brokers.<br/>	"
		    			+ "<br /> Kindly ensure that the information provided is correct and accurate.	<br />");
		    	
		    	sb.append("<table width='100%'>"
		    			+ "<tr><th>Quotation</th><th></th></tr>"
		    			+ "<tr><td>Quotation No :</td><td>12223</td></tr>"
		    			+ "<tr><td>Date :</td><td>"+sdf.format(Calendar.getInstance().getTime())+"</td></tr>"
		    			+ "<tr><td>Plan :</td><td>Buy-My Star</td></tr>"
		    			+ "<tr><td>Validity of quotation :</td><td>30 Days</td></tr>");
		    	
		    	sb.append("<tr><th>Policy Details</th><th></th></tr>"
		    			+ "<tr><td>Insurance Company :</td><td>"+company.getPartnerName()+"</td></tr>"
		    			+ "<tr><td>Agent Name :</td><td>"+company.getContactPersonName()+"</td></tr>"
		    			+ "<tr><td>Insurance Value of vehicle :</td><td>"+vehicleInsured.getSumInsured()+"</td></tr>"
		    			+ "<tr><td>Policy Type :</td><td>Motor Comprehensive</td></tr>");
		    	
		    	sb.append("<tr><th>Customer Details</th><th></th></tr>"
		    			+ "<tr><td>Customer Name :</td><td>"+motorOwner.getInsuredName()+"</td></tr>"
		    			+ "<tr><td>Age :</td><td>"+motorOwner.getAge()+" Years </td></tr>"
		    			+ "<tr><td>Phone Number :</td><td>"+motorOwner.getInsuredMobileNo()+"</td></tr>"
		    			+ "<tr><td>Email :</td><td>"+motorOwner.getInsuredEmailId()+"</td></tr>");
	
		    	sb.append("<tr><th>Vehicle Details</th><th></th></tr>"
		    			+ "<tr><td>Insured Value :</td><td>"+vehicleInsured.getSumInsured()+"</td></tr>"
		    			+ "<tr><td>Model :</td><td>"+vehicleModel+"</td></tr>"
		    			+ "<tr><td>Vehicle Make :</td><td>"+vehicleMake+"</td></tr>"
		    			+ "<tr><td>No. Of Seats :</td><td>"+vehicleInsured.getNoPassenger()+"</td></tr>");
		    	
		    	sb.append("<tr><th>Plan Details</th><th></th></tr>");
		    	
		    	for(int i=0; i< motorRateBenifits.get(m).getPlanBenifits().size(); i++){
		    		sb.append("<tr><td>" + motorRateBenifits.get(m).getPlanBenifits().get(i).getBenefitLinkId().getBenefitName() + ":</td><td>"
			    			+ ((motorRateBenifits.get(m).getPlanBenifits().get(i).getIncluded() == 1) ? "Covered" : "Not Covered")  +"</td></tr>");
		    	}
		    		
				sb.append("<tr><td>Base Premium :</td><td>"+ motorRateBenifits.get(m).getBasePremium() +"</td></tr>"
		    			+ "<tr><td>Total Premium :</td><td>"+motorRateBenifits.get(m).getBasePremium() +"</td></tr>"
		    			+ "<tr><td>Today's Offer :</td><td>"+ (motorRateBenifits.get(m).getBasePremium() - motorRateBenifits.get(m).getTodaysOffer()) +"</td></tr>");
		    	
		    	sb.append("</table>");
		    	
		    	sb.append("<br/>We will be glad to issue a policy for your vehicle on your acceptance of the above quotation"
		    			+ "<br/><br/><br/><br/><br/>Regards,<br/>Admin<br/>Buy-My Insurance<br/><br/><br/>");
		    	
	    	}
	    	
	    	sb.append("</body></html>");
	    	
	    	
	    	
	    	pw.print(sb.toString());
	    	pw.flush();
	    	pw.close();

			document.open();
			XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream("test1.html"));
			document.close();
			file.close();
			response.setContentType("application/pdf");
			response.addHeader("Content-Disposition", "attachment; filename=Quotation_All.pdf");
			try {
				Files.copy(Paths.get("Quotation_All.pdf"), response.getOutputStream());
				response.getOutputStream().flush();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}