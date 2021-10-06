<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language View Screen</title>
</head>
<body>
	<p><c:out value = "${language.name}"/></p>
	<p><c:out value = "${language.creator}"/></p>
	<p><c:out value = "${language.currentVersion}"/></p>
	<div>
		<form action="/languages/<c:out value="${language.id}"/>/destroy" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input type="submit" value="Delete">
		</form>
	</div>
<%-- 	<p><a href ="/languages/<c:out value="${language.id}"/>/destroy">Delete</a></p> --%>
	<p><a href ="/languages">Dashboard</a></p>
</body>
</html>