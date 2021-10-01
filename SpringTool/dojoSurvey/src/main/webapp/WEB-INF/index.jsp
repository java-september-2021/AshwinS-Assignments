<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<form action="/welcome">
        <p>Your Name: <input name="name" type="text"></p>
            <div class="container">
               <label for="locations">Dojo Location:</label>
               <select name="locations" id="locations">
                   <option value="Seattle">Seattle</option>
                   <option value="Bellevue">Bellevue</option>
                   <option value="Silicon Valley">Silicon Valley</option>
                   <option value="Dallas">Dallas</option>
                   <option value="Los Angeles">Los Angeles</option>
               </select>
            </div>
            <div class="container">
            <label for="languages">Favorite Language:</label>
            <select name="languages" id="languages">
                <option value="Java">Java</option>
                <option value="Python">Python</option>
                <option value="C">C</option>
            </select>
            </div>
            <div id="comment">
            <label for="comment">Comment (optional):</label>
            <textarea name="comment" id="comment" cols="30" rows="3"></textarea>
        	</div>
            <div id="button">
                <button type="submit">Submit</button>  
            </div>
    </form>
</body>
</html>