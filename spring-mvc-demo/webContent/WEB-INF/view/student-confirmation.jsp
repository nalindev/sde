<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
<title>Student Form data </title>
</head>

<body>
Given Student Details is registered: ${student.firstName} ${student.lastName }
<br><br>
Country: ${student.country } 

<br><br>
Operating Systems:
<ul>
	<c:forEach var="temp" items="${student.operatingSystems }">
	<li>${temp} </li>
	</c:forEach>
</ul>
</body>

</html>