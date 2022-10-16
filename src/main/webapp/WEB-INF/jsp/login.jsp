<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href='<spring:url value="/resources/css/style.css"/>'
	rel="stylesheet" />
</head>
<body>

	<form:form action="login-panel" modelAttribute="obj">
		<h2 align="center">Login Here...</h2>
		<div id="box" align="center">
			<form:input path="Username" class="form-control" />
			<br />
			<form:password path="userPassword" class="form-control" />
			<br /> <input type="submit" value="login" name="action"
				class="btn btn-info mybtn" />

		</div>
	</form:form>
	
	<form:form action="registration" modelAttribute="objReg">
		<input type="submit" value="resister" name="action"
			class="btn btn-info mybtn" />
	</form:form>


	<h2>${msg}</h2>

</body>
</html>