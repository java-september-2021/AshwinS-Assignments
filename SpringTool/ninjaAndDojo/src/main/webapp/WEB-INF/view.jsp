<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous"><meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>View Ninjas</h1>
	<table class = "table">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Dojo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items ="${allNinjas}" var="ninja">
				<tr>
					<td>${ninja.first_name}</td>
					<td>${ninja.last_name}</td>
					<td>${ninja.age}</td>
					<td>${ninja.dojoNinjaIn.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>