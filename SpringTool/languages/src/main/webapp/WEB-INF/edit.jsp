<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Language</title>
</head>
<body>
	<div>
		<a href ="/languages/<c:out value="${language.id}"/>/destroy">Delete</a>
		<a href ="/languages">Dashboard</a>
	</div>
	<form:form method = "POST" action = "/languages/${language.id}/edit" modelAttribute = "language">
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
</body>
</html>