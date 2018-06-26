package com.bmi.springmvc.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class HtmlToPdf {

	public static void main(String[] args) {
		try {
			OutputStream file = new FileOutputStream(new File("C:\\HTMLtoPDF.pdf"));
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);
			StringBuilder sb = new StringBuilder();
			sb
					.append(new String("<html><body> <h3>Quotation for Private Motor Insurance - Reliable Star </h3>"));
			sb.append(new String("Dear User, <br/>"
					+ "Thanks you for showing interest in Middle East insurancy company and providing us an opportunity "
					+ "to present a uniquely Motor Insurance Coverage for your vehicle through Reliable Star Insurance Brokers."));
			
			sb.append("<br/><br/>");
			sb.append("Kindlyu ensure that the information provided is correct and accurate.<br/>");
			
			sb.append("<table border='0px solid'><tr>");
			sb.append("<td>Quotation No: 23423</td>");
			sb.append("<td>Date: 22/7/2017</td>");
			sb.append("<td>Plan: Reliable Star</td>");
			sb.append("<td>Validity of quotation: 22/7/2017</td>");
			sb.append("</tr></table>");


			

			sb.append(
					"<br/>We will be glad to issue a policy for your vehicle on your acceptance of the above quotation<br/><br/><br/>");

			sb.append("Regards,<br/>");
			sb.append("Admin<br/>");

			
			document.open();
			InputStream is = new ByteArrayInputStream(sb.toString().getBytes());
			XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
			document.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
