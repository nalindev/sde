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
	Free Pass: <form:input path="freePasses"/>
	<form:errors path="freePasses" cssClass="error"></form:errors>
	<br><br>
	Postal Code: <form:input path="postalCode"/>
	<form:errors path="postalCode" cssClass="error"></form:errors>
	<br><br>
	Course Code: <form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="error"></form:errors>
	<br><br>
	<input type="submit" value="submit"/>
</form:form>

</body>
</html>