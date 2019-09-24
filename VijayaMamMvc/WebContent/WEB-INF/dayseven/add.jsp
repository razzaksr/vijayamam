<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding new Stock</title>
</head>
<body>
<h1>${who }</h1>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:errors path="bill.*"/>


<form action="added" method="post">
<input type="text" name="furniture.name"><br>
<input type="text" name="furniture.material"><br>
<select name="furniture.usage" multiple="multiple">
<option>Home</option><option>Office</option><option>Commercial</option>
</select><br>
<input type="number" name="furniture.qty"><br>
<input type="number" name="furniture.price"><br>
<input type="number" name="id">
<input type="submit" value="Add Bill">
</form>
</body>
</html>