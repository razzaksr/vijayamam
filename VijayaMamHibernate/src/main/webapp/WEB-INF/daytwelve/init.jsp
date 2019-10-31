<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Initiate</title>
</head>
<body>
<form action="done" method="post">
<input type="text" name="concern" placeholder="Concern name"><br>
<input type="number" name="person.pid" placeholder="Person Id"><br>
<input type="text" name="person.name" placeholder="person name"><br>
<input type="number" name="person.exp" placeholder="person Experience"><br>
<input type="text" name="person.laptop.model" placeholder="laptop model"><br>
<input type="number" name="person.laptop.ram" placeholder="laptop ram"><br>
<input type="text" name="person.laptop1.laptop1model" placeholder="laptop model"><br>
<input type="number" name="person.laptop1.laptop1ram" placeholder="laptop ram"><br>
<input type="submit" value="Add">
<!-- <input type="text" name="name"><br>
<input type="number" name="exp"><br>
<input type="text" name="laptop.model"><br>
<input type="number" name="laptop.ram"><br>
<input type="submit" value="Add"> -->
</form>
</body>
</html>