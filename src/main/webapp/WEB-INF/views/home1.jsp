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
				<a class="navbar-brand" href="${request.contextPath}" style="text-transform: uppercase;">Buy
					- My Insurance</a>
			</div>
			
		</nav>
		<div>
			<div class="row">
				<div class="col-sm-6">
					<jsp:include page="${request.contextPath}/custinfo"></jsp:include>
				</div>
				<div class="col-sm-6 hidden-xs">
					<img src="<c:url value="/resources/images/insurance-types.jpg"/>"
						class="img-rounded fill" />
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