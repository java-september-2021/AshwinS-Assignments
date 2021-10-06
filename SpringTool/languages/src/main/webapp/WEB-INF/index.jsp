<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>
	<div class = "container">
		<h1>Welcome to Languages</h1>
		<table class = "table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Creator</th>
					<th>Current Version</th>
					<th>Actions</th>
				</tr>
			</thead>
			<c:forEach items ="${allLanguages}" var="language">
				<tr>
				<td>${language.id}</td>
				<td><a href='/languages/${language.id}'>${language.name}</a></td>
				<td>${language.creator}</td>
				<td>${language.currentVersion}</td>
				<td><a href='/languages/${language.id}/edit'>Edit</a> <a href ="/languages/<c:out value="${language.id}"/>/destroy">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<form:form method = "POST" action = "/languages/new" modelAttribute = "language">
			<form:label path="name">Name</form:label>
			<form:errors path ="name"></form:errors>
			<form:input type ="text" path ="name"></form:input>
			<form:label path="creator">Creator</form:label>
			<form:errors path ="creator"></form:errors>
			<form:input type ="text" path ="creator"></form:input>
			<form:label path="currentVersion">Current Version</form:label>
			<form:errors path ="currentVersion"></form:errors>
			<form:input type ="text" path ="currentVersion"></form:input>
			<p><button>Submit</button></p>
		</form:form>
	</div>

</body>
</html>