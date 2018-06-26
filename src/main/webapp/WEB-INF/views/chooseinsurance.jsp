<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Buy - My Insurance</title>

<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/format.css"/>" />
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" />
<link href="<c:url value="/resources/css/full-slider.css"/>"
	rel="stylesheet" />
<link href="<c:url value="/resources/css/flip.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/css/card.css"/>" rel="stylesheet" />
<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/slippry.css" />" />
<link rel="stylesheet" href="<c:url value="/resources/css/wc.css" />" />
<link href="<c:url value="/resources/css/datepicker.css"/>"
	rel="stylesheet">
<link rel="stylesheet"
	href="<c:url value="/resources/css/intlTelInput.css" />" />
<link
	href="<c:url value="/resources/css/bootstrap-datepicker3.min.css" />"
	rel="stylesheet">
<link rel="stylesheet"
	href="<c:url value="/resources/css/multiform.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/comparision.css" />" />

<script src="<c:url value="/resources/js/jquery.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.js"/>"></script>
<script src="<c:url value="/resources/js/preloader.min.js"/>"></script>
<script src="<c:url value="/resources/js/modernizr.js"/>"></script>
<script src="<c:url value="/resources/js/slippry.js"/>"></script>
<script src="<c:url value="/resources/js/typed.js"/>"></script>

</head>
<body>
	<div class="bar"></div>

	<ul id="slider"
		style="list-style: none; width: 100%; height: 100%; padding: 0; margin: 0;"
		class="hde">
		<li><img src="<c:url value="/resources/images/slide1.jpg"/>"></li>
		<li><img src="<c:url value="/resources/images/slide2.jpg"/>"></li>
		<li><img src="<c:url value="/resources/images/slide3.jpg"/>"></li>
		<li><img src="<c:url value="/resources/images/slide4.jpg"/>"></li>
	</ul>


	<script>
		$(function() {
			var demo1 = $("#slider").slippry({
				transition : 'kenburns',
				useCSS : true,
				speed : 5000,
				pause : 9000,
				auto : true,
				controls : false,
				preload : 'visible',
				autoHover : false
			});

		});
	</script>

	<p id="back-top">
		<a href="#top"><span></span></a>
	</p>

	<div class="container-fluid zp container" style="height: 100%">
		<nav class="navbar navbar-default" role="navigation">

			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#example-navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="home" style="text-transform: uppercase;">Buy
					- My Insurance</a>
			</div>
			<div class="collapse navbar-collapse" id="example-navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Online Policy<span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Motor Insurance</a></li>
							<li><a href="#">Travel Insurance</a></li>
							<li><a href="#">Life Insurance</a></li>
							<li><a href="#">Health Insurance</a></li>
							<li><a href="#">Workmen Compensation</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">My Accounts<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Saved Quotation</a></li>
							<li><a href="#">Issued Policies</a></li>
							<li><a href="#">Manage Documents</a></li>
							<li><a href="#">Renewed Policies</a></li>
							<li><a href="#">Claims</a></li>
							<li><a href="#">Renewal</a></li>
							<li><a href="#">Offers</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">About Us<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Vision</a></li>
							<li><a href="#">Company Overview</a></li>
							<li><a href="#">Board Of Directors</a></li>
							<li><a href="#">Branch Locator</a></li>
							<li><a href="#">Customer Care</a></li>
							<li><a href="#">Complaints & Grievances</a></li>
						</ul></li>
				</ul>
			</div>
		</nav>
		<div class="container">
			<div class="col-sm-12">
				<h1 style="color: inherit;">Type of Insurance you need</h1>
				<br />
				<div class="row">
					<div class="col-sm-3">
						<div class="data-card">
							<div class="front" style="background-color: #776fce">
								<div class="row">
									<span class="spriteCard" style="background-position: -6px 5px;"></span>
								</div>
								<div class="row cardFront">Motor Insurance</div>
							</div>
							<div class="back">
								<div class="row cardBack">
									<a href="insuranceselection" class="btn btn-success">Get
										Quote</a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="data-card">
							<div class="front" style="background-color: #e6a65a">
								<div class="row">
									<span class="spriteCard"
										style="background-position: -1px -204px"></span>
								</div>
								<div class="row cardFront">Travel Insurance</div>
							</div>
							<div class="back">
								<div class="row cardBack">Get Quote</div>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="data-card">
							<div class="front" style="background-color: #505c8b">
								<div class="row">
									<span class="spriteCard" style="background-position: 4px -46px"></span>
								</div>
								<div class="row cardFront">Life Insurance</div>
							</div>
							<div class="back">
								<div class="row cardBack">Get Quote</div>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="data-card">
							<div class="front" style="background-color: #42ceb2">
								<div class="row">
									<span class="spriteCard"
										style="background-position: -3px -100px"></span>
								</div>
								<div class="row cardFront">Health Insurance</div>
							</div>
							<div class="back">
								<div class="row cardBack">Get Quote</div>
							</div>
						</div>
					</div>
				</div>
				<br />
				<div class="row">
					<div class="col-sm-3">
						<div class="data-card">
							<div class="front" style="background-color: #4b76c2">
								<div class="row">
									<span class="spriteCard"
										style="background-position: -538px -415px;"></span>
								</div>
								<div class="row cardFront">Workmen Compensation</div>
							</div>
							<div class="back">
								<div class="row cardBack">Get Quote</div>
							</div>
						</div>
					</div>
				</div>
				<br />
				<div class="row">
					<div class="col-sm-12" style="text-align: center;">
						<a href="#myCarousel" class="btn btn-success" data-slide="next">Proceed</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="<c:url value="/resources/js/main.js"/>"></script>
	<script src="<c:url value="/resources/js/parallax.js"/>" defer></script>
	<script
		src="<c:url value="/resources/js/bootstrap-datepicker.min.js"/>"></script>
	<script src="<c:url value="/resources/js/jquery.easing.min.js"/>"></script>
	<script src="<c:url value="/resources/js/scrolling-nav.js"/>"></script>
</body>
</html>