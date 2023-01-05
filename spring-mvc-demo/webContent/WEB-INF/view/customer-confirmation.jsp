<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Confirmation</title>
</head>
<body>
	<p>The customer is confirmed: ${customer.firstName} ${customer.lastName} </p>
	<p>Total number of free passes: ${customer.freePasses}</p>
	<p>Postal Code: ${customer.postalCode}</p>
	<p>Course Code: ${customer.courseCode}</p>
</body>
</html>