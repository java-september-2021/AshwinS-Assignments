<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Create</title>
</head>
<body>
	<h1>New Product</h1>
	<form:form method = "POST" action = "/categories/new" modelAttribute = "category">
		<form:label path="name">Name</form:label>
		<form:errors path ="name"/>
		<form:input type ="text" path ="name"/>
		<p><button>Create Category</button></p>
	</form:form>
</body>
</html>