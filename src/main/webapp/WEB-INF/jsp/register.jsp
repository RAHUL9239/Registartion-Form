<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body class="row">
	<div class="col-sm-4"></div>
	
		<form:form action="processRegistration" modelAttribute="objReg">
			<h2 align="center">User Registration</h2>
			<div align="center"  class="form-group">
				<form:label  path="name">Name</form:label>
				<form:input  path="name" class="form-control" />
			</div>

			<div align="center"  class="form-group">
				<form:label path="username">User Name</form:label>
				<form:input path="username" class="form-control" />
			</div>

			<div align="center"  class="form-group">
				<form:label path="password">password</form:label>
				<form:password path="password" class="form-control" />
			</div>


			<div align="center"  class="form-group">
				<form:label path="country">Country</form:label>
				<form:select path="country" class="form-control">

					<form:option value="None" label="--select--" />
					<form:options items="${countryList}" />
				</form:select>
			</div>

			<div align="center"  class="form-group">
				<form:label path="gender">Gender</form:label>
				<form:radiobutton path="gender" value="M" label="Male" />
				<form:radiobutton path="gender" value="F" label="Female" />
				<form:radiobutton path="gender" value="F" label="other" />
			</div>

			<div align="center"  class="form-group">
				<input type="submit" value="Register Now" class="form-control" />
			</div>

		

	<h2>${objReg.msg}</h2>
	</form:form>

	<div class="col-sm-4"></div>

</body>
</html>