<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Panel</title>
<script type="text/javascript"> <!-- get login information from controller -->
function getUserRoles() {
	$.ajax({
	    url: 'loadUserRoles',
	    data: ({name : "me"}),
	    success: function(response) {
	        var elem = document.getElementById('#adminBody');
	        console.log(response);
	        $('#adminBody').html(response);
	    }
	  });
}
function getPartners() {
	$.ajax({
	    url: 'getPartners',
	    data: ({name : "me"}),
	    success: function(response) {
	        var elem = document.getElementById('#adminBody');
	        console.log(response);
	        $('#adminBody').html(response);
	    }
	  });
}
function getEmirates() {
	$.ajax({
	    url: 'getEmirates',
	    data: ({name : "me"}),
	    success: function(response) {
	        var elem = document.getElementById('#adminBody');
	        console.log(response);
	        $('#adminBody').html(response);
	    }
	  });
}
function getPlans() {
	$.ajax({
	    url: 'planmasters/list',
	    data: ({name : "me"}),
	    success: function(response) {
	        var elem = document.getElementById('#adminBody');
	        console.log(response);
	        $('#adminBody').html(response);
	    }
	  });
}
</script>
</head>
<body>
	<h3>Admin Panel</h3>
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<button type="button" class="list-group-item" onclick="getUserRoles()">User Roles</button>
					<button type="button" class="list-group-item" onclick="getPartners()">Partners</button>
					<button type="button" class="list-group-item" onclick="getEmirates()">Emirates</button>
					<button type="button" class="list-group-item" onclick="getPlans()">Plans</button>
					<button type="button" class="list-group-item">at eros</button>
				</div>
			</div>
			<div class="col-md-9">
				<div class="well" id="adminBody">Test</div>
			</div>
		</div>
	</div>
</body>
</html>