<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="info-card">
	<div class="front" style="text-align: left;">
		<h1>Hi User, You are at the right place if you are searching for
			any insurance</h1>
		<br /> <a href="#" class="btn btn-success" id="startHere">Start
			Here</a>
	</div>
	<div class="back" style="background-color: #42ceb2">
		<form:form method="POST" action="addCustomer"
			modelAttribute="customer">
			<span style="color: #fff; font-size: 32px">We will help you
				out</span>
			<br />
			<br />
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-user"></i></span>
				<form:input path="name" type="text" class="form-control"
					placeholder="Your Name" />
			</div>
			<br />
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-phone"></i></span>
				<form:input path="phone" type="text" class="form-control"
					placeholder="Phone Number" />
			</div>
			<br />
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-envelope"></i></span>
				<form:input path="email" type="text" class="form-control"
					placeholder="Email" />
			</div>
			<br />
			<button class="btn btn-primary" type="submit">Proceed</button>
		</form:form>
		<br /> <br />
	</div>
</div>
<script>
	$('#startHere').click(function() {
		$('.info-card .front').css('-webkit-transform', 'rotateY(180deg)');
		$('.info-card .back').css('-webkit-transform', 'rotateY(0)');
		// or this:
		// $('object').attr('style', '-webkit-transform: rotateY(90deg)');
	});
</script>