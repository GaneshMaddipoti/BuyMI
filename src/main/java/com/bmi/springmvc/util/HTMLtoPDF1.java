package com.bmi.springmvc.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class HTMLtoPDF1 {
	public static final String DEST = "C:\\html_table_3.pdf";
	public static final String HTML = "C:\\test.html";

	public static void main(String[] args) throws IOException, DocumentException {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new HTMLtoPDF1().createPdf(DEST);
	}

	/**
     * Creates a PDF with the words "Hello World"
     * @param file
     * @throws IOException
     * @throws DocumentException
     */
    public void createPdf(String file) throws IOException, DocumentException {
    	//
    	PrintWriter pw = new PrintWriter(new FileOutputStream("test1.html"));
    	StringBuilder sb = new StringBuilder();
    	sb.append("<html><head><title>Quotaion</title><style>table{border: 1px solid black;}"
    			+ "th {background-color: lightblue;}</style></head><body><h3 color='red'>"
    			+ "Quotaion for Private Motor Insurance - Buy-My	Insurance</h3>	<br /> "
    			+ "Dear User, Thanks you for showing interest in Buy-My Insurance	insurance company and providing us an "
    			+ "opportunity to present a uniquely	Motor Insurance Coverage for your vehicle through Buy-My Insurance Brokers.<br/>	"
    			+ "<br /> Kindly ensure that the information provided is correct and accurate.	<br />");
    	
    	sb.append("<table width='100%'>"
    			+ "<tr><th>Quotation</th><th></th></tr>"
    			+ "<tr><td>Quotation No :</td><td>12223</td></tr>"
    			+ "<tr><td>Date :</td><td>22/07/2017</td></tr>"
    			+ "<tr><td>Plan :</td><td>Buy-My Star</td></tr>"
    			+ "<tr><td>Validity of quotation :</td><td>30 Days</td></tr>");
    	
    	sb.append("<tr><th>Policy Details</th><th></th></tr>"
    			+ "<tr><td>Insurance Company :</td><td>Buy-My Insurance</td></tr>"
    			+ "<tr><td>Agent Name :</td><td>Advisor</td></tr>"
    			+ "<tr><td>Insurance Value of vehicle :</td><td>50000</td></tr>"
    			+ "<tr><td>Policy Type :</td><td>Motor Comprehensive</td></tr>");
    	
    	sb.append("<tr><th>Customer Details</th><th></th></tr>"
    			+ "<tr><td>Customer Name :</td><td>XYZ</td></tr>"
    			+ "<tr><td>Age :</td><td>25 Years</td></tr>"
    			+ "<tr><td>Phone Number :</td><td>9986565646</td></tr>"
    			+ "<tr><td>Email :</td><td>maddi@gmail.com</td></tr>");

    	sb.append("<tr><th>Vehicle Details</th><th></th></tr>"
    			+ "<tr><td>Insured Value :</td><td>50000</td></tr>"
    			+ "<tr><td>Model :</td><td>Captive</td></tr>"
    			+ "<tr><td>Vehicle Make :</td><td>Audi</td></tr>"
    			+ "<tr><td>No. Of Seats :</td><td>4</td></tr></table>");
    	
    	sb.append("<br/>We will be glad to issue a policy for your vehicle on your acceptance of the above quotation"
    			+ "<br/><br/><br/>Regards,<br/>Admin<br/>Buy-My Insurance<br/>");
    	
    	sb.append("</body></html>");
    	
    	
    	
    	pw.print(sb.toString());
    	pw.flush();
    	pw.close();
    	
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        // step 3
        document.open();
        // step 4
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream("test1.html"));
        // step 5
        document.close();
    }
}
