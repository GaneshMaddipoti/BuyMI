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
	<h2>List of User Roles</h2>	
	<table class="table table-hover">
		<tr>
			<td>NAME</td><td>Joining Date</td><td>Salary</td><td>SSN</td><td></td>
		</tr>
		<c:forEach items="${userRoles}" var="userRole">
			<tr>
			<td>${userRole.roleCode}</td>
			<td>${userRole.name}</td>
			<td>${userRole.description}</td>
			<td><a href="<c:url value='/edit-${userRole.active}-employee' />">${userRole.active}</a></td>
			<td><a href="<c:url value='/delete-${userRole.createdDate}-employee' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<button type="button" class="btn btn-success">Add New User Role</button>
</body>
</html>