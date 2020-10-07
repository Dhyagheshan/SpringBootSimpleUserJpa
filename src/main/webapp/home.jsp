<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>
    <h1>Add User Details</h1>
	<form action="addUser">
		<input type="text" name="userid"><br>
		<input type="text" name="username"><br>
		<input type="text" name="tech"><br>
		<input type="submit"><br>
	</form>
	
	<h1>Get User Details</h1>
	<form action="getUser">
		<input type="text" name="userid"><br>
		
		<input type="submit"><br>
	</form>

</body>
</html>