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
	<h2>List of Plans</h2>	
	<table class="table table-hover">
		<tr>
			<td>NAME</td><td>Created</td><td>By</td>
		</tr>
		<c:forEach items="${planMasters}" var="planMaster">
			<tr>
			<td>${planMaster.planName}</td>
			<td>${planMaster.createdDate}</td>
			<td>${planMaster.createdById}</td> 
			</tr>
		</c:forEach>
	</table>
	<br/>
	<button type="button" class="btn btn-success">Add New Plan</button>
</body>
</html>