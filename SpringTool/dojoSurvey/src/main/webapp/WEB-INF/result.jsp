<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  	<div id="wrapper">
    	<h1>Submitted Info:</h1>
        <p>Your name is: <c:out value="${name}"/></p>
        <p>Your Dojo location is: <c:out value="${location}"/></p>
        <p>Your Favorite Langauge is: <c:out value="${language}"/></p>
        <p>Comment: <c:out value="${comment}"/></p>
        <button><a href="/">Go Back</a></button>
   </div>
</body>
</html>