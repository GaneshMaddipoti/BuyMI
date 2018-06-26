<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="item">
		<!-- Set the third background image using inline CSS below. -->
		<div class="fill"></div>
		<div class="container"
			style="position: absolute; top: 50px; margin-left: 10%; text-align: left;"">

			<div class="row">
				<div class="col-md-12">
					<div class="well">
						<h3 style="margin-top: 0px">Motor Insurance</h3>
						<div class="stepwizard" style="margin: auto; width: 100%">
							<div class="stepwizard-row setup-panel">
								<div class="stepwizard-step">
									<a href="#step-1" type="button"
										class="btn btn-primary btn-circle">1</a>
								</div>
								<div class="stepwizard-step">
									<a href="#step-2" type="button"
										class="btn btn-default btn-circle">2</a>
								</div>
								<div class="stepwizard-step">
									<a href="#step-3" type="button"
										class="btn btn-default btn-circle">3</a>
								</div>
								<div class="stepwizard-step">
									<a href="#step-4" type="button"
										class="btn btn-default btn-circle">4</a>
								</div>
							</div>
						</div>

						<form:form method="POST" action="${request.contextPath}/addMotorOwner" modelAttribute="motorOwner">

							<div class="row setup-content" id="step-1" style="height: 550px">
								<div class="col-md-12">
									<h4>Commercial License Details</h4>

									<div class="row">
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">Insured Type</label> <select
													class="form-control" id="insuredType" name="insuredType">
													<option>Select Insured Type</option>
													<option>Individual</option>
													<option>Company</option>
												</select>
											</div>
										</div>
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">Nationality</label> <select
													class="form-control" id="nationality" name="nationality">
													<option>Select Nationality</option>
													<c:forEach items="${nations}" var="nation">
														<option>${nation.nation}</option>
													</c:forEach>
												</select>
											</div>
										</div>
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">Country of First
													Driving License</label> <select class="form-control"
													id="nationality" name="nationality">
													<option>Select Country of First Driving License</option>
													<c:forEach items="${nations}" var="nation">
														<option>${nation.nation}</option>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">Insured DOB</label>
												<div class="input-group date">
													<input type="text" class="form-control"
														placeholder="Insured DOB" id="inputDob" name="inputDob"><span
														class="input-group-addon"><i
														class="glyphicon glyphicon-th"></i></span>
												</div>
											</div>
										</div>
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">Insured Gender</label> <select
													class="form-control" id="gender" name="gender">
													<option>Select Gender</option>
													<option>Male</option>
													<option>Female</option>
												</select>
											</div>
										</div>
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">How old is
													your/driver's UAE driving License? </label> <select
													class="form-control" id="sel1">
													<option>1</option>
													<option>2</option>
													<option>3</option>
													<option>4</option>
												</select>
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">No Claim Discount (NCD
													in years)</label> <select class="form-control" id="sel1">
													<option>1</option>
													<option>2</option>
													<option>3</option>
													<option>4</option>
												</select>
											</div>
										</div>
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">Able to provide
													supporting document for NCD?</label> <select class="form-control"
													id="sel1">
													<option>Yes</option>
													<option>No</option>
												</select>
											</div>
										</div>
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">Insured Name</label> <input
													maxlength="100" type="text" class="form-control"
													placeholder="Enter Insured Name" />

											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">Email</label> <input
													maxlength="100" type="text" class="form-control"
													placeholder="Enter Email" />
											</div>
										</div>
										<div class="col-xs-4 col-md-4 pull-left">
											<div class="form-group">
												<label class="control-label">Mobile</label> <input
													maxlength="100" type="text" class="form-control"
													placeholder="Enter Mobile Number" />

											</div>
										</div>
										<div class="col-xs-4 col-md-4 pull-left"></div>
									</div>


								</div>
								<button class="btn btn-primary nextBtn pull-right" type="button">Proceed</button>
							</div>
						</form:form>
							<div class="row setup-content" id="step-2" style="height: 550px">
								<div class="col-md-12">
									<div class="col-md-12">
										<h4>Commercial License Details</h4>

										<div class="row">
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Vehicle Registration
														Type</label> <select class="form-control" id="sel1">
														<option>Select Vehicle Registration</option>
														<option>Private</option>
														<option>Commercial</option>
													</select>
												</div>
											</div>
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Date of First
														Registration</label>
													<div class="input-group date">
														<input type="text" class="form-control"
															placeholder="Insured DOB" id="inputDob" name="inputDob"><span
															class="input-group-addon"><i
															class="glyphicon glyphicon-th"></i></span>
													</div>
												</div>
											</div>
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Place of Registration</label>
													<select class="form-control" id="nationality"
														name="nationality">
														<option>Select Place of Registration</option>
														<c:forEach items="${nations}" var="nation">
															<option>${nation.nation}</option>
														</c:forEach>
													</select>
												</div>
											</div>
										</div>

										<div class="row">
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Vehicle Make</label> <select
														class="form-control" id="nationality" name="nationality">
														<option>Select Vehicle Make</option>
														<c:forEach items="${vehicleMakes}" var="vehicleMake">
															<option>${vehicleMake.vehicleMakeName}</option>
														</c:forEach>
													</select>
												</div>
											</div>
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Vehicle Model</label> <select
														class="form-control" id="nationality" name="nationality">
														<option>Select Vehicle Model</option>
														<c:forEach items="${vehicleModels}" var="vehicleModel">
															<option>${vehicleModel.vehicleModelName}</option>
														</c:forEach>
													</select>
												</div>
											</div>
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Vehicle Model
														Specification</label> <input maxlength="100" type="text"
														class="form-control"
														placeholder="Enter Vehicle Model Specification" />

												</div>
											</div>
										</div>

										<div class="row">
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Vehicle Manufacturing
														Year</label> <select class="form-control" id="sel1">
														<option>Select Vehicle Manufacturing Year</option>
														<option>1995</option>
														<option>1996</option>
														<option>1997</option>
														<option>1998</option>
														<option>1999</option>
														<option>2001</option>
														<option>2002</option>
														<option>2003</option>
														<option>2004</option>
														<option>2005</option>
														<option>2006</option>
														<option>2007</option>
														<option>2008</option>
														<option>2009</option>
														<option>2010</option>
														<option>2011</option>
														<option>2012</option>
														<option>2013</option>
														<option>2014</option>
														<option>2015</option>
													</select>
												</div>
											</div>
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Number of Passengers (ex. driver)</label>
													<select class="form-control" id="sel1">
														<option>Select Number of Passengers</option>
														<option>1</option>
														<option>2</option>
														<option>3</option>
														<option>4</option>
													</select>
												</div>
											</div>
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Sum Insured (in AED)</label> <input
														maxlength="100" type="text" class="form-control"
														placeholder="e.g.. 52,000" />

												</div>
											</div>
										</div>

										<div class="row">
											<div class="col-xs-4 col-md-4 pull-left">
												<div class="form-group">
													<label class="control-label">Is Modified or Non-GCC
														Specs?</label> <select class="form-control" id="sel1">
														<option>Select</option>
														<option>Yes</option>
														<option>No</option>
													</select>
												</div>
											</div>
											<div class="col-xs-4 col-md-4 pull-left"></div>
											<div class="col-xs-4 col-md-4 pull-left"></div>
										</div>


									</div>
									<button class="btn btn-primary nextBtn pull-right"
										type="button">Proceed</button>
								</div>
							</div>
							<div class="row setup-content" id="step-3" style="height: 550px">
								<div class="col-md-12">
									<h4>Choose Plan</h4>
									<span>Quotation No : 123131321</span>

									<!-- Plans -->
									<section id="plans">
									<div class="row">

										<!-- item -->
										<div class="col-md-2 text-center"
											style="padding-left: 15px; padding-right: 0px">
											<div class="panel panel-default panel-pricing">
												<div class="panel-heading">
													<h5>Features</h5>
												</div>
												<ul class="list-group text-center">
													<li class="list-group-item">TL Valid</li>
													<li class="list-group-item">No of Employees</li>
													<li class="list-group-item">Annual Salary</li>
													<li class="list-group-item">WC Premium</li>
													<li class="list-group-item">Actual Price</li>
												</ul>
												<div class="panel-footer">Todays Best Price</div>
											</div>
										</div>
										<!-- /item -->

										<!-- item -->
										<div class="col-md-2 text-center"
											style="padding-left: 0px; padding-right: 0px">
											<div class="panel panel-danger panel-pricing">
												<div class="panel-heading">
													<h5>Company 1</h5>
												</div>
												<ul class="list-group text-center">
													<li class="list-group-item"><i class="fa fa-check"></i>
														Yes</li>
													<li class="list-group-item">15</li>
													<li class="list-group-item">$24000</li>
													<li class="list-group-item">@2.5%</li>
													<li class="list-group-item">$1800</li>
												</ul>
												<div class="panel-footer">$1700</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-danger nextBtn"
														style="width: 150px">Save as PDF</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-primary nextBtn"
														style="width: 150px">Follow Up</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-success nextBtn"
														style="width: 150px">Proceed to Pay</button>
												</div>
											</div>
										</div>
										<!-- /item -->

										<!-- item -->
										<div class="col-md-2 text-center"
											style="padding-left: 0px; padding-right: 0px">
											<div class="panel panel-warning panel-pricing">
												<div class="panel-heading">
													<h5>Company 2</h5>
												</div>
												<ul class="list-group text-center">
													<li class="list-group-item"><i class="fa fa-check"></i>
														Yes</li>
													<li class="list-group-item">15</li>
													<li class="list-group-item">$24000</li>
													<li class="list-group-item">@2.0%</li>
													<li class="list-group-item">$1600</li>
												</ul>
												<div class="panel-footer">$1500</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-danger nextBtn"
														style="width: 150px">Save as PDF</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-primary nextBtn"
														style="width: 150px">Follow Up</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-success nextBtn"
														style="width: 150px">Proceed to Pay</button>
												</div>
											</div>
										</div>
										<!-- /item -->

										<!-- item -->
										<div class="col-md-2 text-center"
											style="padding-left: 0px; padding-right: 0px">
											<div class="panel panel-success panel-pricing">
												<div class="panel-heading">
													<h5>Company 3</h5>
												</div>
												<ul class="list-group text-center">
													<li class="list-group-item"><i class="fa fa-check"></i>
														Yes</li>
													<li class="list-group-item">15</li>
													<li class="list-group-item">$24000</li>
													<li class="list-group-item">@2.3%</li>
													<li class="list-group-item">$1700</li>
												</ul>
												<div class="panel-footer">$1500</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-danger nextBtn"
														style="width: 150px">Save as PDF</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-primary nextBtn"
														style="width: 150px">Follow Up</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-success nextBtn"
														style="width: 150px">Proceed to Pay</button>
												</div>
											</div>
										</div>
										<!-- /item -->

										<!-- item -->
										<div class="col-md-2 text-center"
											style="padding-left: 0px; padding-right: 0px">
											<div class="panel panel-danger panel-pricing">
												<div class="panel-heading">
													<h5>Company 4</h5>
												</div>
												<ul class="list-group text-center">
													<li class="list-group-item"><i class="fa fa-check"></i>
														Yes</li>
													<li class="list-group-item">15</li>
													<li class="list-group-item">$24000</li>
													<li class="list-group-item">@2.5%</li>
													<li class="list-group-item">$1800</li>
												</ul>
												<div class="panel-footer">$1700</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-danger nextBtn"
														style="width: 150px">Save as PDF</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-primary nextBtn"
														style="width: 150px">Follow Up</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-success nextBtn"
														style="width: 150px">Proceed to Pay</button>
												</div>
											</div>
										</div>
										<!-- /item -->

										<!-- item -->
										<div class="col-md-2 text-center"
											style="padding-left: 0px; padding-right: 0px">
											<div class="panel panel-warning panel-pricing">
												<div class="panel-heading">
													<h5>Company 5</h5>
												</div>
												<ul class="list-group text-center">
													<li class="list-group-item"><i class="fa fa-check"></i>
														Yes</li>
													<li class="list-group-item">15</li>
													<li class="list-group-item">$24000</li>
													<li class="list-group-item">@2.0%</li>
													<li class="list-group-item">$1600</li>
												</ul>
												<div class="panel-footer">$1500</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-danger nextBtn"
														style="width: 150px">Save as PDF</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-primary nextBtn"
														style="width: 150px">Follow Up</button>
												</div>
												<div class="panel-footer">
													<button type="button" class="btn btn-success nextBtn"
														style="width: 150px">Proceed to Pay</button>
												</div>
											</div>
										</div>
										<!-- /item -->

									</div>
									</section>
								</div>
							</div>
							<div class="row setup-content" id="step-4" style="height: 550px">
								<div class="col-md-6">
									<h4>Policy Details</h4>

									<div class="row">
										<div
											style="margin: auto; width: 95%; height: auto; color: #666;">
											<div
												style="width: 100%; float: left; background: #1ca8dd; color: #fff; font-size: 20px; text-align: center;">
												Summary</div>
											<br />
											<div style="width: 100%; padding: 0px 0px; float: left;">
												<div style="width: 30%; float: left; padding: 10px;">
													<br /> <span
														style="font-size: 14px; float: left; width: 100%;">
														Company Name </span> <span
														style="font-size: 14px; float: left; width: 100%;">
														#, Emirates Name , </span> <span
														style="font-size: 14px; float: left; width: 100%;">
														Commercial License Number </span>

												</div>
												<div style="width: 40%; float: right; padding:">
													<span
														style="font-size: 14px; float: right; padding: 10px; text-align: right;">
														<b>Date : </b>2017-05-04
													</span> <span
														style="font-size: 14px; float: right; padding: 10px; text-align: right;">
														<b>Quotation # : </b>123131321
													</span>
												</div>
											</div>


											<br />


											<div style="width: 100%; padding: 0px; float: left;">

												<div style="width: 100%; float: left; background: #efefef;">
													<span
														style="float: left; text-align: left; padding: 10px; width: 50%; color: #888; font-weight: 600;">
														Decription </span> <span
														style="font-weight: 600; float: left; padding: 10px; width: 50%; color: #888; text-align: right;">
														Amount </span>
												</div>

												<div style="width: 100%; float: left;">
													<span
														style="float: left; text-align: left; padding: 10px; width: 50%; color: #888;">
														Number of Employees </span> <span
														style="font-weight: normal; float: left; padding: 10px; width: 50%; color: #888; text-align: right;">
														15 </span>
												</div>

												<div style="width: 100%; float: left;">
													<span
														style="float: left; text-align: left; padding: 10px; width: 50%; color: #888;">
														Annual Salary </span> <span
														style="font-weight: normal; float: left; padding: 10px; width: 50%; color: #888; text-align: right;">
														$24000 </span>
												</div>
												<div style="width: 100%; float: left;">
													<span
														style="float: left; text-align: left; padding: 10px; width: 50%; color: #888;">
														Workmen Compensation Premium <span
														style="font-size: 10px; float: left; width: 100%;">
															(0%) </span>
													</span> <span
														style="font-weight: normal; float: left; padding: 10px; width: 50%; color: #888; text-align: right;">
														@2.5 %</span>
												</div>


												<div style="width: 100%; float: left; background: #fff;">

													<span
														style="font-weight: 600; float: right; padding: 10px 0px; width: 50%; color: #666; text-align: center;">
														Total : $1900 </span>
													<button class="btn btn-primary pull-left" type="button">Save
														as PDF</button>
												</div>

											</div>
											<br />
										</div>
										<br />
									</div>

								</div>
								<div class="col-md-6">
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
																		placeholder="Valid Card Number" required autofocus />
																	<span class="input-group-addon"><span
																		class="glyphicon glyphicon-lock"></span></span>
																</div>
															</div>
															<div class="row">
																<div class="col-xs-7 col-md-7">
																	<div class="form-group">
																		<label for="expityMonth"> EXPIRY DATE</label>
																		<div class="col-xs-6 col-lg-6 pl-ziro">
																			<input type="text" class="form-control"
																				id="expityMonth" placeholder="MM" required />
																		</div>
																		<div class="col-xs-6 col-lg-6 pl-ziro">
																			<input type="text" class="form-control"
																				id="expityYear" placeholder="YY" required />
																		</div>
																	</div>
																</div>
																<div class="col-xs-5 col-md-5 pull-right">
																	<div class="form-group">
																		<label for="cvCode"> CV CODE</label> <input
																			type="password" class="form-control" id="cvCode"
																			placeholder="CV" required />
																	</div>
																</div>
															</div>
														</form>
													</div>
												</div>
												<ul class="nav nav-pills nav-stacked">
													<li class="active"><a href="#"><span
															class="badge pull-right"><span
																class="glyphicon glyphicon-usd"></span>4200</span> Final
															Payment</a></li>
												</ul>
												<br /> <a href="#" class="btn btn-success btn-lg btn-block"
													role="button">Pay</a>
											</div>
										</div>
									</div>

								</div>
							</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>