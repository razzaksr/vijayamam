<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Basic Page</title>
</head>
<body>
<h2>Welcome to Zealous Tech Corp</h2>
<h3>${bikemodel}</h3>
<h4>${bikeprice }</h4>
<form action="heaven" method="post">
<input type="number" name="days">
<input type="number" name="pay">
<input type="submit" value="PO">
</form>
</body>
</html>