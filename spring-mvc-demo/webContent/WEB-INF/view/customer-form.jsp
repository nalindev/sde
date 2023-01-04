<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Form</title>
<style>
.error {color:red}
</style>
</head>
<body>

<form:form action="processForm" modelAttribute="customer">
	<i>Fill out the form. Asterisk (*) means required.</i>
	<br><br>
	First Name: <form:input path="firstName"/>
	<br><br>
	Last Name (*): <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error" />
	<br><br>
	<input type="submit" value="submit"/>
</form:form>

</body>
</html>