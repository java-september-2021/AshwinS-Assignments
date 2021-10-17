<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product View</title>
<link rel="stylesheet" href= "/css/product.css"></link>
</head>
<body>
<h1><c:out value = "${product.name}"></c:out></h1>
<div class = "Cat">
	<div class = "viewCat">
	<h3>Categories</h3>
	<ul>
		<c:forEach items = "${product.categories}" var = "category">
		<li> <c:out value = "${category.name}"></c:out></li>
		</c:forEach>
	</ul>
	</div>
	<div class = "addCat">
		<form:form method = "POST" action = "/products/${product.id}" modelAttribute = "product">
			<select name="categories">
				<c:forEach items = "${categories}" var ="category">
				<option value="${category.id}" >${category.name}</option>
				</c:forEach>
			</select>
			<p><button>Add Category</button></p>
		</form:form>
	</div>
</div>

</body>
</html>