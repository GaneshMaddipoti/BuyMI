<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<style>
input[type=checkbox] {
	-webkit-appearance: checkbox;
}
</style>
<% SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY"); %>
<div class="row">
	<div class="col-md-8">
		<h4>Policy Details</h4>

		<div class="row">
			<div
				style="width: 100%; float: left; background: #1ca8dd; color: #fff; font-size: 20px; text-align: center;">
				Summary</div>
				
	    	
	    	<table width='100%'>
	    	<tr><th>&nbsp;</th><th></th></tr>
	    	<tr><td>Quotation No :</td><td>12223</td></tr>
	    	<tr><td>Date :</td><td> <%=sdf.format(Calendar.getInstance().getTime()) %> </td></tr>
	    	<tr><td>Plan :</td><td>Buy-My Star</td></tr>
	    	<tr><td>Validity of quotation :</td><td>30 Days</td></tr>
	    	
	    	<tr><th>Policy Details</th><th></th></tr>
	    	<tr><td>Insurance Company :</td><td>${policyDetailsCompany.partnerName}</td></tr>
	    	<tr><td>Agent Name :</td><td>${policyDetailsCompany.contactPersonName}</td></tr>
	    	<tr><td>Insurance Value of vehicle :</td><td>${vehicleInsured.sumInsured}</td></tr>
	    	<tr><td>Policy Type :</td><td>Motor Comprehensive</td></tr>
	    	
	    	<tr><th>Customer Details</th><th></th></tr>
	    	<tr><td>Customer Name :</td><td>${motorOwner.insuredName}</td></tr>
	    	<tr><td>Age :</td><td>${motorOwner.age} Years </td></tr>
	    	<tr><td>Phone Number :</td><td>${motorOwner.insuredEmailId}</td></tr>
	    	<tr><td>Email :</td><td>${motorOwner.insuredMobileNo}</td></tr>

	    	<tr><th>Vehicle Details</th><th></th></tr>
	    	<tr><td>Insured Value :</td><td>${vehicleInsured.sumInsured}</td></tr>
	    	<tr><td>Model :</td><td>${vehicleModel}</td></tr>
	    	<tr><td>Vehicle Make :</td><td>${vehicleMake}</td></tr>
	    	<tr><td>No. Of Seats :</td><td>${vehicleInsured.noPassenger}</td></tr>
	    	
	    	<tr><th>Plan Details</th><th></th></tr>
	    	
	    	
			<tr><td>Base Premium :</td><td>${policyDetailsMotorRate.basePremium}</td></tr>
	    	<tr><td>Total Premium :</td><td>${policyDetailsMotorRate.basePremium}</td></tr>
	    	<tr><td>Today's Offer :</td><td>${policyDetailsMotorRate.basePremium - policyDetailsMotorRate.todaysOffer}</td></tr>
	    	
	    	</table>

		</div>

	</div>
	<div class="col-md-4">
		<h4>Payment Process</h4>

		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-md-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Payment Details</h3>
							<div class="checkbox pull-right">
								<label> <input type="checkbox" /> Remember
								</label>
							</div>
						</div>
						<div class="panel-body">
							<form role="form">
								<div class="form-group">
									<label for="cardNumber"> CARD NUMBER</label>
									<div class="input-group">
										<input type="text" class="form-control" id="cardNumber"
											placeholder="Valid Card Number" required autofocus /> <span
											class="input-group-addon"><span
											class="glyphicon glyphicon-lock"></span></span>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-7 col-md-7">
										<div class="form-group">
											<label for="expityMonth"> EXPIRY DATE</label>
											<div class="col-xs-6 col-lg-6 pl-ziro">
												<input type="text" class="form-control" id="expityMonth"
													placeholder="MM" required />
											</div>
											<div class="col-xs-6 col-lg-6 pl-ziro">
												<input type="text" class="form-control" id="expityYear"
													placeholder="YY" required />
											</div>
										</div>
									</div>
									<div class="col-xs-5 col-md-5 pull-right">
										<div class="form-group">
											<label for="cvCode"> CV CODE</label> <input type="password"
												class="form-control" id="cvCode" placeholder="CV" required />
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
					<ul class="nav nav-pills nav-stacked">
						<li class="active"><a href="#"><span
								class="badge pull-right"><span
									class="glyphicon glyphicon-usd"></span>4200</span> Final Payment</a></li>
					</ul>
					<br /> <a href="#" class="btn btn-success btn-lg btn-block"
						role="button">Pay</a>
				</div>
			</div>
		</div>
	</div>
</div>