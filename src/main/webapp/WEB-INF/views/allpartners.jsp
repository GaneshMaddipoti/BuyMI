<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Partners</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Partners</h2>	
	<table class="table table-hover">
		<tr>
			<td>NAME</td><td>Joining Date</td><td>Salary</td><td>SSN</td><td></td>
		</tr>
		<c:forEach items="${partners}" var="partner">
			<tr>
			<td>${partner.partnerName}</td>
			<td>${partner.partnerType}</td>
			<td>${partner.patnerCode}</td>
			<td><a href="<c:url value='/edit-${partner.patnerStatus}-employee' />">${partner.patnerStatus}</a></td>
			<td><a href="<c:url value='/delete-${partner.createdDate}-employee' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<button type="button" class="btn btn-success">Add New Partner</button>
</body>
</html>