<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding new Product</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:errors path="product.*"/>
<center>
<form action="registered" method="post">
<input type="text" name="name"><br>
<input type="text" name="expiry"><br>
<input type="text" name="price"><br>
<input type="text" name="qty"><br>
<input type="text" name="id"><br>
<input type="submit" value="Add to Stock">
</form>
</center>
</body>
</html>