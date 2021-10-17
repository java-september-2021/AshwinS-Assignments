<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href= "/css/product.css"></link>
</head>
<body>
<h1><c:out value = "${category.name}"></c:out></h1>
<div class = "Prod">
	<div class = "viewProd">
	<h3>Categories</h3>
	<ul>
		<c:forEach items = "${category.products}" var = "product">
		<li> <c:out value = "${product.name}"></c:out></li>
		</c:forEach>
	</ul>
	</div>
	<div class = "addProd">
		<form:form method = "POST" action = "/categories/${category.id}" modelAttribute = "category">
			<select name="products">
				<c:forEach items = "${products}" var ="product">
				<option value="${product.id}" >${product.name}</option>
				</c:forEach>
			</select>
			<p><button>Add Product</button></p>
		</form:form>
	</div>
</div>
</body>
</html>