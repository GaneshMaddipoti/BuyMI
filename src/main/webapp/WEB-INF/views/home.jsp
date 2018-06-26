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
<link href="<c:url value="/resources/css/scrolling-nav.css" />"
	rel="stylesheet" />
<link href="<c:url value="/resources/css/full-slider.css"/>"
	rel="stylesheet" />
<link href="<c:url value="/resources/css/flip.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/css/card.css"/>" rel="stylesheet" />
<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/slippry.css" />" />
<link rel="stylesheet" href="<c:url value="/resources/css/wc.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/registration.css" />" />
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
<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
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

	<div class="container-fluid zp" style="height: 100%">
		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header page-scroll">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-ex1-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand page-scroll" href="#page-top"
						style="font-size: xx-large;">Buy - My Insurance</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-ex1-collapse">
					<ul class="nav navbar-nav">
						<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
						<li class="hidden"><a class="page-scroll" href="#page-top"></a>
						</li>
						<li><a class="page-scroll" href="#admin">Admin</a></li>
						<li><a class="page-scroll" href="#services">Services</a></li>
						<li><a class="page-scroll" href="#contact">Contact</a></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container -->
		</nav>

		<!-- Intro Section -->
		<section id="intro" class="intro-section">
			<!-- Full Page Image Background Carousel Header -->
			<header id="myCarousel" class="carousel slide" data-interval="false"
				data-wrap="false">
				<!-- Indicators -->
				<!-- 				<ol class="carousel-indicators"> -->
				<!-- 					<li data-target="#myCarousel" data-slide-to="0" class="active"></li> -->
				<!-- 					<li data-target="#myCarousel" data-slide-to="1"></li> -->
				<!-- 					<li data-target="#myCarousel" data-slide-to="2"></li> -->
				<!-- 				</ol> -->

				<!-- Wrapper for Slides -->
				<div class="carousel-inner">
					<div class="item active">
						<!-- Set the first background image using inline CSS below. -->
						<div class="fill"></div>
						<div class="container"
							style="position: absolute; top: 50px; margin-left: 10%;">
							<div class="row">
								<div class="col-sm-6">
									<jsp:include page="${request.contextPath}/custinfo"></jsp:include>
								</div>
								<div class="col-sm-6">
									<img
										src="<c:url value="/resources/images/insurance-types.jpg"/>"
										class="img-rounded fill" />
								</div>
							</div>
						</div>
					</div>
					<div class="item">
						<!-- Set the second background image using inline CSS below. -->
						<div class="fill"></div>
						
					</div>

					<jsp:include page="${request.contextPath}/insuranceselection"></jsp:include>
				</div>

				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span> <span
					class="sr-only">Previous</span></span>
				</a> <a class="right carousel-control" href="#myCarousel"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span> <span
					class="sr-only">Next</span>
				</a>
			</header>

		</section>

		<!-- About Section -->
		<section id="admin" class="about-section">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<h1>Admin Section</h1>
					</div>
				</div>
			</div>
		</section>

		<!-- Services Section -->
		<section id="services" class="services-section">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<h1>Services Section</h1>
					</div>
				</div>
			</div>
		</section>

		<!-- Contact Section -->
		<section id="contact" class="contact-section">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<h1>Contact Section</h1>
					</div>
				</div>
			</div>
		</section>
	</div>
	<script src="<c:url value="/resources/js/main.js"/>"></script>
	<script src="<c:url value="/resources/js/parallax.js"/>" defer></script>
	<script
		src="<c:url value="/resources/js/bootstrap-datepicker.min.js"/>"></script>
	<script src="<c:url value="/resources/js/jquery.easing.min.js"/>"></script>
	<script src="<c:url value="/resources/js/scrolling-nav.js"/>"></script>

	<script>
		$('#startHere').click(function() {
			$('.info-card .front').css('-webkit-transform', 'rotateY(180deg)');
			$('.info-card .back').css('-webkit-transform', 'rotateY(0)');
			// or this:
			// $('object').attr('style', '-webkit-transform: rotateY(90deg)');
		});
	</script>
	<script>
		var dob = document.getElementById('insuredDob');
		$(function() {
			$('.input-group.date').datepicker({
				format : "yyyy-mm-dd",
				clearBtn : true,
				orientation : "bottom auto",
				autoclose : true
			});
			$('.input-group.date').datepicker().on("hide", function(e) {
				var event = new Event('change');

				// Dispatch it.
				//dob.dispatchEvent(event);
			});
		});
	</script>

	<script>
		$(document).ready(function() {
							var navListItems = $('div.setup-panel div a'), allWells = $('.setup-content'), allNextBtn = $('.nextBtn');
							allWells.hide();
							navListItems
									.click(function(e) {
										e.preventDefault();
										var $target = $($(this).attr('href')), $item = $(this);

										if (!$item.hasClass('disabled')) {
											navListItems.removeClass(
													'btn-primary').addClass(
													'btn-default');
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

										$(".form-group").removeClass(
												"has-error");
										for (var i = 0; i < curInputs.length; i++) {
											if (!curInputs[i].validity.valid) {
												isValid = false;
												$(curInputs[i]).closest(
														".form-group")
														.addClass("has-error");
											}
										}
										if (isValid)
											nextStepWizard.removeAttr(
													'disabled')
													.trigger('click');
									});
							$('div.setup-panel div a.btn-primary').trigger(
									'click');
						});
	</script>
</body>
</html>