<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$('#proceed')
								.click(
										function(e) {

											var flag = $('#collapse0')
													.hasClass(
															'panel-collapse collapse in');

											if (flag) {
												var frm = $('#motorOwner');
												e.preventDefault();
												var data = {}
												var Form = this;
												data["ownerLinkId"] = $(
														"#ownerLinkId").val();
												data["insuredType"] = $(
														"#insuredType").val();
												data["insuredName"] = $(
														"#insuredName").val();
												data["insuredGender"] = $(
														"#insuredGender").val();
												data["insuredDob"] = $(
														"#insuredDob").val();
												data["insuredMobileNo"] = $(
														"#insuredMobileNo")
														.val();
												data["insuredEmailId"] = $(
														"#insuredEmailId")
														.val();
												data["ageDrivingLicence"] = $(
														"#ageDrivingLicence")
														.val();
												data["nationalityLinkId"] = $(
														"#nationalityLinkId")
														.val();
												data["countryFirstDrivingLicence"] = $(
														"#countryFirstDrivingLicence")
														.val();
												data["noNcdyears"] = $(
														"#noNcdyears").val();
												data["ncdDocsSupport"] = $(
														"#ncdDocsSupport")
														.val();
												console.log(JSON
														.stringify(data));
												$
														.ajax({
															contentType : 'application/json; charset=utf-8',
															type : frm
																	.attr('method'),
															url : frm
																	.attr('action'),
															dataType : 'json',
															data : JSON
																	.stringify(data),
															success : function(
																	callback) {
																$(this)
																		.html(
																				"Success!");
															},
															error : function() {
																$(this)
																		.html(
																				"Error!");
															}
														});
											} else {
												var frm = $('#motorOwnerOptional');
												e.preventDefault();
												var data = {}
												var Form = this;
												data["ownerLinkId"] = $(
														"#ownerLinkId").val();
												data["trafficCode"] = $(
														"#trafficCode").val();
												data["drivingLicenceNo"] = $(
														"#drivingLicenceNo")
														.val();
												data["insuredEmirates"] = $(
														"#insuredEmirates")
														.val();
												data["insuredAddress"] = $(
														"#insuredAddress")
														.val();
												data["poBox"] = $("#poBox")
														.val();
												data["insuredOccupation"] = $(
														"#insuredOccupation")
														.val();
												data["insuredNameArabic"] = $(
														"#insuredNameArabic")
														.val();
												data["companyNamedDriver"] = $(
														"#companyNamedDriver")
														.val();
												data["emiratesId"] = $(
														"#emiratesId").val();
												data["policyStartDt"] = $(
														"#policyStartDt").val();
												data["policyEndDt"] = $(
														"#policyEndDt").val();
												console.log(JSON
														.stringify(data));
												$
														.ajax({
															contentType : 'application/json; charset=utf-8',
															type : frm
																	.attr('method'),
															url : frm
																	.attr('action'),
															dataType : 'json',
															data : JSON
																	.stringify(data),
															success : function(
																	callback) {
																$(this)
																		.html(
																				"Success!");
															},
															error : function() {
																$(this)
																		.html(
																				"Error!");
															}
														});
											}
										});

						$('#proceed2')
								.click(
										function(e) {
											var flag = $('#collapse2')
													.hasClass(
															'panel-collapse collapse in');
											if (flag) {
												var frm = $('#vehicleInsured');
												e.preventDefault();
												$("#plancomparision")
														.html(
																'<div class="panel panel-default col-md-12 text-center" style="height: 550px;"><i class="fa fa-spinner fa-spin"style="font-size: 48px; color: green; margin-top: 100px"></i></div>');
												var data = {}
												var Form = this;
												data["ownerLinkId"] = $(
														"#ownerLinkId").val();
												data["vehicleRegType"] = $(
														"#vehicleRegType")
														.val();
												data["firstRegDate"] = $(
														"#firstRegDate").val();
												data["registrationPlaceLinkId"] = $(
														"#registrationPlaceLinkId")
														.val();
												data["vehicleMakeLinkId"] = $(
														"#vehicleMakeLinkId")
														.val();
												data["vehicleModelLinkId"] = $(
														"#vehicleModelLinkId")
														.val();
												data["vehicleModelSpec"] = $(
														"#vehicleModelSpec")
														.val();
												data["vehicleManufacturingYear"] = $(
														"#vehicleManufacturingYear")
														.val();
												data["noPassenger"] = $(
														"#noPassenger").val();
												data["sumInsured"] = $(
														"#sumInsured").val();
												data["nonGCCSpec"] = $(
														"#nonGCCSpec").val();
												data["bodyTypeLinkId"] = $(
														"#bodyTypeLinkId")
														.val();
												console.log(JSON
														.stringify(data));
												$
														.ajax({
															contentType : 'application/json; charset=utf-8',
															type : frm
																	.attr('method'),
															url : frm
																	.attr('action'),
															dataType : 'json',
															data : JSON
																	.stringify(data),
															success : function(
																	callback) {
																$(this)
																		.html(
																				"Success!");
																$(
																		"#plancomparision")
																		.load(
																				"plancomparision");
															},
															error : function() {
																$(this)
																		.html(
																				"Error!");
															}
														});
											} else {
												var frm = $('#vehicleInsuredOptional');
												e.preventDefault();
												$("#plancomparision")
														.html(
																'<div class="panel panel-default col-md-12 text-center" style="height: 550px;"><i class="fa fa-spinner fa-spin"style="font-size: 48px; color: green; margin-top: 100px"></i></div>');
												var data = {}
												var Form = this;
												data["ownerLinkId"] = $(
														"#ownerLinkId").val();
												data["vehicleChassisNo"] = $(
														"#vehicleChassisNo")
														.val();
												data["vehicleEngineNo"] = $(
														"#vehicleEngineNo")
														.val();
												data["vehicleColourLinkId"] = $(
														"#vehicleColourLinkId")
														.val();
												data["vehicleRegNo"] = $(
														"#vehicleRegNo").val();
												data["bankMortgageLinkId"] = $(
														"#bankMortgageLinkId")
														.val();
												console.log(JSON
														.stringify(data));
												$
														.ajax({
															contentType : 'application/json; charset=utf-8',
															type : frm
																	.attr('method'),
															url : frm
																	.attr('action'),
															dataType : 'json',
															data : JSON
																	.stringify(data),
															success : function(
																	callback) {
																$(this)
																		.html(
																				"Success!");
																$(
																		"#plancomparision")
																		.load(
																				"plancomparision");
															},
															error : function() {
																$(this)
																		.html(
																				"Error!");
															}
														});
											}
										});

					});
	$('#proceed3')
			.click(
					function(e) {
						e.preventDefault();
						$("#policydetails")
								.html(
										'<div class="panel panel-default col-md-12 text-center" style="height: 550px;"><i class="fa fa-spinner fa-spin"style="font-size: 48px; color: green; margin-top: 100px"></i></div>');
						$("#policydetails").load("policydetails");
					});
</script>
<div>
	<div class="row">
		<div class="col-md-12">

			<div class="row">
				<div class="col-sm-4 hidden-xs">
					<h3 style="margin-top: 0px">Motor Insurance</h3>
				</div>
				<div class="col-sm-8">
					<div class="stepwizard" style="margin: auto; width: 100%">
						<div class="stepwizard-row setup-panel">
							<div class="stepwizard-step">
								<a href="#step-1" type="button"
									class="btn btn-primary btn-circle"><img src="<c:url value="/resources/images/owner.png" />"/></a>
								<p>Owner</p>
							</div>
							<div class="stepwizard-step">
								<a href="#step-2" type="button"
									class="btn btn-default btn-circle"><img src="<c:url value="/resources/images/vehicle.png" />"/></a>
								<p>Vehicle</p>
							</div>
							<div class="stepwizard-step">
								<a href="#step-3" type="button"
									class="btn btn-default btn-circle"><img src="<c:url value="/resources/images/compare.png" />"/></a>
								<p>Compare</p>
							</div>
							<div class="stepwizard-step">
								<a href="#step-4" type="button"
									class="btn btn-default btn-circle"><img src="<c:url value="/resources/images/owner.png" />"/></a>
								<p>Payment</p>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row setup-content" id="step-1" style="height: 650px;">
				<div class="col-md-12" style="margin-top: -20px">
					<br />
					<div class="panel panel-success">
						<div class="panel-heading">Owner Details</div>
						<div class="panel-body">

							<div class="row">
								<div class="col-sm-4 hidden-xs">

									<div class="slideInUp animated" style="display: none"
										id="motorImageDiv1">
										<img src='<c:url value="/resources/images/car.png" />'
											class="fill">
									</div>

								</div>
								<div class="col-sm-8 fadeIn animated" id="motorDetailsForm1"
									style="display: none">

									<form:form method="POST" action="addMotorOwner"
										modelAttribute="motorOwner">
										<form:input type="hidden" path="ownerLinkId"></form:input>

										<div class="panel panel-success">
											<div class="panel-heading">
												<a data-toggle="collapse" href="#collapse0">Primary
													Details</a>
											</div>
											<div id="collapse0" class="panel-collapse collapse in">
												<div class="panel-body">

													<div class="row">
														<div class="col-sm-6  pull-left">
															<button type="button" class="btn btn-default">TPL</button>
															<button type="button" class="btn btn-success" style="margin-left: -5px;">Comprehensive</button>
														</div>
														<div class="col-sm-6  pull-left">
														</div>
													</div>
													<br/>
													<div class="row">
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<!-- 												<label class="control-label">Insured Type</label> -->
																<form:select class="form-control" path="insuredType">
																	<form:options items="${insuredTypes}" />
																</form:select>
																<label for="insuredType">Insured Type</label>
															</div>
														</div>
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<!-- 												<label class="control-label">Nationality</label> -->
																<form:select class="form-control"
																	path="nationalityLinkId">
																	<form:options items="${nations}" />
																</form:select>
																<label for="nationalityLinkId">Nationality</label>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<!-- 												<label class="control-label">Country of First Driving License</label> -->
																<form:select class="form-control"
																	path="countryFirstDrivingLicence">
																	<form:options items="${nations}" />
																</form:select>
																<label for="countryFirstDrivingLicence">Country of First Driving License</label>
															</div>
														</div>
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<!-- 												<label class="control-label">Insured DOB</label> -->
																<div class="input-group date">
																	<form:input type="text" class="form-control"
																		placeholder="Insured DOB" path="insuredDob"></form:input>
																	<label for="insuredDob">Insured Date of birth</label>
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-th"></i></span>
																</div>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<!-- 												<label class="control-label">Insured Gender</label> -->
																<form:select class="form-control" path="insuredGender">
																	<form:options items="${genders}" />
																</form:select>
																<label for="insuredGender">Gender</label>
															</div>
														</div>
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<!-- 												<label class="control-label">How old is your/driver's UAE driving License? </label> -->
																<form:select class="form-control"
																	path="ageDrivingLicence">
																	<form:options items="${uaeDlAgeInYears}" />
																</form:select>
																<label for="ageDrivingLicence">How old is your/driver's UAE driving License?</label>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<!-- 												<label class="control-label">No Claim Discount (NCD in years)</label> -->
																<form:select class="form-control" path="noNcdyears">
																	<form:options items="${noNCDYears}" />
																</form:select>
																<label for="noNcdyears">No Claim Discount (NCD in years)</label>
															</div>
														</div>
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<!-- 												<label class="control-label">Able to provide supporting document for NCD?</label> -->
																<form:select class="form-control" path="ncdDocsSupport">
																	<form:options items="${yesOrNos}" />
																</form:select>
																<label for="ncdDocsSupport">Able to provide supporting document for NCD?</label>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6  pull-left">
															<div class="form-group  has-float-label">
																<!-- 												<label class="control-label">Insured Name</label> -->
																<form:input maxlength="100" type="text" required="required"
																	class="form-control" placeholder="Enter Insured Name"
																	path="insuredName" />
																<label for="insuredName">Insured Name</label>
															</div>
														</div>
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<form:input maxlength="100" type="text" required="required"
																	class="form-control" placeholder="Enter Email"
																	path="insuredEmailId" />	
																<label for="insuredEmailId">Insured Email</label>															
															</div> 
														</div>
													</div>
													<div class="row">
														<div class="col-sm-6  pull-left">
															<div class="form-group has-float-label">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:input maxlength="100" type="text" required="required"
																	class="form-control" placeholder="Enter Phone Number"
																	path="insuredMobileNo" />
																<label for="insuredMobileNo">Insured Phone</label>
															</div>
														</div>
														<div class="col-sm-6  pull-left"></div>
													</div>
												</div>
											</div>
										</div>

									</form:form>

									<!-- Additional Details -->
									<form:form method="POST" action="addMotorOwnerOptional"
										modelAttribute="motorOwnerOptional">
										<form:input type="hidden" path="ownerLinkId"></form:input>
										<div class="panel panel-success">
											<div class="panel-heading">
												<a data-toggle="collapse" href="#collapse1">Additional
													Details</a>
											</div>
											<div id="collapse1" class="panel-collapse collapse">
												<div class="panel-body">
													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Email</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control" placeholder="Traffic Code"
																	path="trafficCode" />
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control"
																	placeholder="Driving License Number"
																	path="drivingLicenceNo" />
															</div>
														</div>
													</div>


													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:select class="form-control" path="insuredEmirates">
																	<option>Select Insured Emirates</option>
																	<form:options items="${insuredEmirates}" />
																</form:select>
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Email</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control" placeholder="Insured Address"
																	path="insuredAddress" />
															</div>
														</div>
													</div>


													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control" placeholder="PO Box" path="poBox" />
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control" placeholder="Insured Occupation"
																	path="insuredOccupation" />
															</div>
														</div>
													</div>


													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Email</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control"
																	placeholder="Insured Name (Arabic)"
																	path="insuredNameArabic" />
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control" placeholder="Company Named Driver"
																	path="companyNamedDriver" />
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control" placeholder="Emirates ID"
																	path="emiratesId" />
															</div>
														</div>


														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Email</label> -->
																<div class="input-group date">
																	<form:input type="text" class="form-control"
																		placeholder="Policy Start Date" path="policyStartDt"></form:input>
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-th"></i></span>
																</div>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<div class="input-group date">
																	<form:input type="text" class="form-control"
																		placeholder="Policy End Date" path="policyEndDt"></form:input>
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-th"></i></span>
																</div>
															</div>
														</div>
														<div class="col-sm-6 pull-left"></div>
													</div>
												</div>
											</div>
										</div>
									</form:form>

									<a href="home" class="btn btn-danger">Re-plan</a>
									<button class="btn btn-success nextBtn pull-right"
										type="button" id="proceed">Proceed</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>


			<div class="row setup-content" id="step-2" style="height: 650px;">
				<div class="col-md-12" style="margin-top: -20px">

					<br />
					<div class="panel panel-success">
						<div class="panel-heading">Vehicle Details</div>
						<div class="panel-body">

							<!-- Vehicle Details -->

							<div class="row">
								<div class="col-sm-4 hidden-xs">

									<div class="" style="display: block" id="motorImageDiv2">
										<img src='<c:url value="/resources/images/car.png" />'
											class="fill">
									</div>

								</div>
								<div class="col-sm-8 fadeIn animated" id="motorDetailsForm2"
									style="display: none">

									<form:form method="POST" action="addVehicleInsured"
										modelAttribute="vehicleInsured">
										<form:input type="hidden" path="ownerLinkId"></form:input>

										<div class="panel panel-success">
											<div class="panel-heading">
												<a data-toggle="collapse" href="#collapse2">Primary
													Details</a>
											</div>
											<div id="collapse2" class="panel-collapse collapse in">
												<div class="panel-body">

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Vehicle Registration Type</label> -->
																<form:select class="form-control" path="vehicleRegType">
																	<option>Select Vehicle Registration</option>
																	<form:options items="${registrationTypes}" />
																</form:select>
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Date of First Registration</label> -->
																<div class="input-group date">
																	<form:input type="text" class="form-control"
																		placeholder="First Registration Date"
																		path="firstRegDate"></form:input>
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-th"></i></span>
																</div>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Place of Registration</label> -->
																<form:select class="form-control"
																	path="registrationPlaceLinkId">
																	<option>Select Place of Registration</option>
																	<form:options items="${registrationPlaces}" />
																</form:select>
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Vehicle Make</label> -->
																<form:select class="form-control"
																	path="vehicleMakeLinkId">
																	<option>Select Vehicle Make</option>
																	<form:options items="${vehicleMakes}" />
																</form:select>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Vehicle Model Specification</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control" required="required"
																	placeholder="Enter Vehicle Model Specification"
																	path="vehicleModelSpec" />
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Body Type</label> -->
																<form:select class="form-control" path="bodyTypeLinkId">
																	<option>Select Body Type</option>
																	<form:options items="${bodyTypes}" />
																</form:select>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Vehicle Manufacturing Year</label> -->
																<form:select class="form-control"
																	path="vehicleManufacturingYear">
																	<option>Select Vehicle Manufacturing Year</option>
																	<form:options items="${manufactureYears}" />
																</form:select>
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Number of Passengers (ex. driver)</label> -->
																<form:select class="form-control" path="noPassenger">
																	<option>Select Number of Passengers (ex.
																		driver)</option>
																	<form:options items="${noPassengers}" />
																</form:select>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Sum Insured (in AED)</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control" placeholder="Sum Insured (in AED)"
																	path="sumInsured" />

															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Is Modified or Non-GCCSpecs?</label> -->
																<form:select class="form-control" path="nonGCCSpec">
																	<option>Is Modified or Non-GCCSpecs?</option>
																	<form:options items="${nonGCCSpecs}" />
																</form:select>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 											<label class="control-label">Vehicle Model</label> -->
																<form:select class="form-control"
																	path="vehicleModelLinkId">
																	<option>Select Vehicle Model</option>
																	<form:options items="${vehicleModels}" />
																</form:select>
															</div>
														</div>														
														<div class="col-sm-6 pull-left"></div>
													</div>

												</div>
											</div>
										</div>

									</form:form>

									<form:form method="POST" action="addVehicleInsuredOptional"
										modelAttribute="vehicleInsuredOptional">
										<form:input type="hidden" path="ownerLinkId"></form:input>

										<div class="panel panel-success">
											<div class="panel-heading">
												<a data-toggle="collapse" href="#collapse3">Additional
													Details</a>
											</div>
											<div id="collapse3" class="panel-collapse collapse">
												<div class="panel-body">
													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Email</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control"
																	placeholder="Vehicle Chassis Number"
																	path="vehicleChassisNo" />
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control"
																	placeholder="Vehicle Engine Number"
																	path="vehicleEngineNo" />
															</div>
														</div>
													</div>
													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<input maxlength="100" type="text" class="form-control"
																	placeholder="Engine Capacity" />
															</div>
														</div>

														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Email</label> -->
																<form:select class="form-control"
																	path="vehicleColourLinkId">
																	<option>Select Vehicle Color</option>
																	<form:options items="${vehicleColors}" />
																</form:select>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:input maxlength="100" type="text"
																	class="form-control" placeholder="Registration Number"
																	path="vehicleRegNo" />
															</div>
														</div>
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Mobile</label> -->
																<form:select class="form-control"
																	path="bankMortgageLinkId">
																	<option>Select Mortgage Bank</option>
																	<form:options items="${bankMortgages}" />
																</form:select>
															</div>
														</div>
													</div>

													<div class="row">
														<div class="col-sm-6 pull-left">
															<div class="form-group">
																<!-- 												<label class="control-label">Email</label> -->
																<input maxlength="100" type="text" class="form-control"
																	placeholder="Mortgage Company Name:(If Others)" />
															</div>
														</div>
														<div class="col-sm-6 pull-left"></div>
													</div>

												</div>
											</div>
										</div>
									</form:form>
									<a href="home" class="btn btn-danger">Re-plan</a>
									<button class="btn btn-success nextBtn pull-right"
										type="button" id="proceed2">Proceed</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row setup-content" id="step-3" style="height: 550px;">
				<br />
				<div class="col-md-12" style="margin-top: -20px">
					<div id="plancomparision"
						style="background-color: #fff; padding: 10px 25px">
						<div class="panel panel-default col-md-12 text-center"
							style="height: 550px;">
							<i class="fa fa-spinner fa-spin"
								style="font-size: 48px; color: green; margin-top: 100px"></i>
						</div>
					</div>
				</div>
			</div>
			<div class="row setup-content" id="step-4" style="height: 550px;">
				<br />
				<div id="policydetails"
					style="background-color: #fff; padding: 10px 25px">
					<div class="panel panel-default col-md-12 text-center"
						style="height: 550px;">
						<i class="fa fa-spinner fa-spin"
							style="font-size: 48px; color: green; margin-top: 100px"></i>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
	var dob = document.getElementById('insuredDob');
	$(function() {
		$('.input-group.date').datepicker({
			format : "yyyy-mm-dd"
		});
	});

	$(document).ready(function() {
		setTimeout(function() {
			$("#motorImageDiv1").show();
		}, 1000);
		setTimeout(function() {
			$("#motorDetailsForm1").show();
		}, 1000);
		setTimeout(function() {
			$("#motorImageDiv2").show();
		}, 1000);
		setTimeout(function() {
			$("#motorDetailsForm2").show();
		}, 1000);
	});

	$(document)
			.ready(
					function() {
						var navListItems = $('div.setup-panel div a'), allWells = $('.setup-content'), allNextBtn = $('.nextBtn');
						allWells.hide();
						navListItems
								.click(function(e) {
									e.preventDefault();
									var $target = $($(this).attr('href')), $item = $(this);

									if (!$item.hasClass('disabled')) {
										navListItems.removeClass('btn-primary')
												.addClass('btn-default');
										$item.addClass('btn-primary');
										allWells.hide();
										$target.show();
										$target.find('input:eq(0)').focus();
									}
								});
						allNextBtn
								.click(function() {
									var curStep = $(this).closest(
											".setup-content"), curStepBtn = curStep
											.attr("id"), nextStepWizard = $(
											'div.setup-panel div a[href="#'
													+ curStepBtn + '"]')
											.parent().next().children("a"), curInputs = curStep
											.find("input[type='text'],input[type='url']"), isValid = true;

									$(".form-group").removeClass("has-error");
									for (var i = 0; i < curInputs.length; i++) {
										if (!curInputs[i].validity.valid) {
											isValid = false;
											$(curInputs[i]).closest(
													".form-group").addClass(
													"has-error");
										}
									}
									if (isValid)
										nextStepWizard.removeAttr('disabled')
												.trigger('click');
								});
						$('div.setup-panel div a.btn-primary').trigger('click');
					});
</script>