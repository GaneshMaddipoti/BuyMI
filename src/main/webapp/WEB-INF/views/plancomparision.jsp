<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<style>
input[type=checkbox] {
	-webkit-appearance: checkbox;
}
</style>
<h3>Choose Plan</h3>
<h4>Quotation</h4>
<c:if test="${fn:length(motorRateBenifits) gt 0}">
	<table width="100%" style="border: 1px solid;"
		class="table table-bordered table-hover ">
		<tr>
			<td>Benifits</td>
			<c:forEach items="${motorRateBenifits}" var="motorRateBenifit"
				varStatus="loop">
				<td width="25%" class="info">${motorRateBenifit.company.partnerName}<img
					src="resources/images/logo${motorRateBenifit.company.partnersLinkId}.jpg"
					class="filled" style="width: 25%" />
				</td>
			</c:forEach>
		</tr>
		<tr class="info">
			<td>Mandatory</td>
			<c:forEach items="${motorRateBenifits}" var="motorRateBenifit">
				<td width="25%"></td>
			</c:forEach>
		</tr>
		<c:set var="motorRateBenifit" value="${motorRateBenifits[0]}" />
		<c:forEach items="${motorRateBenifit.planBenifits}" var="planBenifit">
			<c:if test="${planBenifit.included eq 1}">
				<tr>
					<td>${planBenifit.benefitLinkId.benefitName}</td>
					<c:forEach items="${motorRateBenifits}" var="mrBenifit">
						<c:forEach items="${mrBenifit.planBenifits}" var="pBenifit">
							<c:if
								test="${planBenifit.benefitLinkId.benefitLinkId eq pBenifit.benefitLinkId.benefitLinkId}">
								<td>Covered</td>
							</c:if>
						</c:forEach>
					</c:forEach>
				</tr>
			</c:if>
		</c:forEach>
		<tr class="info">
			<td>Optional</td>
			<c:forEach items="${motorRateBenifits}" var="motorRateBenifit">
				<td width="25%"></td>
			</c:forEach>
		</tr>
		<c:set var="motorRateBenifit" value="${motorRateBenifits[0]}" />
		<c:forEach items="${motorRateBenifit.planBenifits}" var="planBenifit">
			<c:if test="${planBenifit.included eq 0}">
				<tr>
					<td>${planBenifit.benefitLinkId.benefitName}</td>
					<c:forEach items="${motorRateBenifits}" var="mrBenifit"
						varStatus="loop">
						<c:forEach items="${mrBenifit.planBenifits}" var="pBenifit">
							<c:if
								test="${planBenifit.benefitLinkId.benefitLinkId eq pBenifit.benefitLinkId.benefitLinkId}">
								<c:if test="${pBenifit.percentage eq 0}">
									<td id="price${loop.index}">$ ${pBenifit.price} <input
										type="checkbox"
										onclick="calculateTotalPremium(this, ${pBenifit.price}, ${pBenifit.percentage}, ${loop.index});" /></td>
								</c:if>
								<c:if test="${pBenifit.percentage gt 0}">
									<td id="percentage${loop.index}">${pBenifit.percentage}%<input
										type="checkbox"
										onclick="calculateTotalPremium(this, ${pBenifit.price}, ${pBenifit.percentage}, ${loop.index});" />
									</td>
								</c:if>
							</c:if>
						</c:forEach>
					</c:forEach>
				</tr>
			</c:if>
		</c:forEach>
		<tr class="warning">
			<td>Base Premium</td>
			<c:forEach items="${motorRateBenifits}" var="mrBenifit"
				varStatus="loop">
				<input type="hidden" id="loadingDiscount${loop.index}"
					value="${mrBenifit.todaysOffer}" />
				<td id="basePremium${loop.index}">${mrBenifit.basePremium}</td>
			</c:forEach>
		</tr>
		<tr class="success">
			<td>Total Premium</td>
			<c:forEach items="${motorRateBenifits}" var="mrBenifit"
				varStatus="loop">
				<td id="totalPremium${loop.index}">${mrBenifit.basePremium}</td>
			</c:forEach>
			<!-- 			//Add optional benefits -->
		</tr>
		<tr class="danger">
			<td>Today's Offer</td>
			<c:forEach items="${motorRateBenifits}" var="mrBenifit"
				varStatus="loop">
				<td id="todaysOffer${loop.index}">${mrBenifit.basePremium - mrBenifit.todaysOffer}</td>
			</c:forEach>
		</tr>
		<tr>
			<td></td>
			<c:forEach items="${motorRateBenifits}" var="mrBenifit"
				varStatus="loop">
				<td id="getQuote${loop.index}"><a class="btn btn-primary"
					href="download/pdf/${loop.index}">Get Quotation</a> <br /> <a
					class="btn btn-success" href="#" id="payNow"
					onclick="getPolicyDetails(${loop.index})">Pay Now</a></td>
			</c:forEach>
		</tr>
	</table>
	<a href="download/pdfall/0" class="btn btn-danger">Get All
		Quotations</a>
</c:if>
<c:if test="${fn:length(motorRateBenifits) eq 0}">
					No Plans Matched
					<a href="home" class="btn btn-danger">Re-plan</a>
</c:if>
<script>
	function calculateTotalPremium(elm, price, pcnt, arg) {
		var totalPremium = $("#totalPremium"+arg).html();
		var basePremium = $("#basePremium"+arg).html();
		if(elm.checked){			
			if(price > 0){
				totalPremium = parseFloat(totalPremium) + price;
			}else{
				totalPremium = parseFloat(totalPremium) + parseFloat((basePremium*pcnt/100).toFixed(2));
			}
			$("#totalPremium"+arg).html(totalPremium.toFixed(2));
			$("#todaysOffer"+arg).html(parseFloat($("#totalPremium"+arg).html()) - parseFloat($("#loadingDiscount"+arg).val()));
		}else{
			var totalPremium = $("#totalPremium"+arg).html();
			if(price > 0){
				totalPremium = totalPremium - price;
			}else{
				totalPremium = totalPremium - parseFloat((basePremium*pcnt/100).toFixed(2));
			}
			$("#totalPremium"+arg).html(totalPremium.toFixed(2));
			$("#todaysOffer"+arg).html(parseFloat($("#totalPremium"+arg).html()) - parseFloat($("#loadingDiscount"+arg).val()));
		}
	}
	function getQuote(arg){
		
	}
	function getPolicyDetails(arg) {
		var flag = $('#collapse3')
		.hasClass(
				'panel-collapse collapse in');

		if (flag) {
			$("#step-3").hide();
			$("#step-4").show();
			$("#policydetails").html('<div class="panel panel-default col-md-12 text-center" style="height: 550px;"><i class="fa fa-spinner fa-spin"style="font-size: 48px; color: green; margin-top: 100px"></i></div>');
			$("#policydetails").load("policydetails?arg="+arg);
		}else{
			$("#step-3").hide();
			$("#step-1").show();
			$('#collapse0').removeClass().addClass('panel-collapse collapse');
			$('#collapse1').removeClass().addClass('panel-collapse collapse in');
			
			$('#collapse2').removeClass().addClass('panel-collapse collapse');
			$('#collapse3').removeClass().addClass('panel-collapse collapse in');
			
		}
	}
</script>