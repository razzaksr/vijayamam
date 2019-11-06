<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change to Update</title>
</head>
<body>
<h1>Do changes to update</h1>
<form action="changed" method="post">
<input type="text" name="macId" value=${updata.macId }><input type="text" name="macModel" value=${updata.macModel }>
<input type="number" name="macPrice" value=${updata.macPrice }><input type="submit" value="Update in stock">
</form>
</body>
</html>