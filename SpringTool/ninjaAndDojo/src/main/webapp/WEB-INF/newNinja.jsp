<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form method = "POST" action = "/ninjas/new" modelAttribute = "ninja">
		<form:label path="first_name">First Name</form:label>
		<form:errors path ="first_name"/>
		<form:input type ="text" path ="first_name"/>
		<form:label path="last_name">Last Name</form:label>
		<form:errors path ="last_name"/>
		<form:input type ="text" path ="last_name"/>
		<form:label path="age">Age</form:label>
		<form:errors path ="age"/>
		<form:input type ="text" path ="age"/>
		<form:select path ="dojoNinjaIn">
		<c:forEach items = "${allDojos}" var ="dojo">
		<option value="${dojo.id}">${dojo.name}</option>
		</c:forEach>
		</form:select>
		
		<p><button>Create Ninja</button></p>
	</form:form>
</body>
</html>