<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user</title>
</head>
<body>

User Name : ${user.Username+login.getUsername()}<br/>
User Pass : ${user.userPassword+login.getUserPassword()}</br>
</body>
</html>