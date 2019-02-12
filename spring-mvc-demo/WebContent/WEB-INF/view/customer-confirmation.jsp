<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>CUSTOMER CONFIRMATION</title>
</head>
<body>
	

Customer is confirmed
<br>
Customer Details :
<br><br>
Name: ${customer.firstName} ${customer.lastName} 
<br>
Count of Free passes: ${customer.freePasses}
<br>
PostalCode: ${customer.postalCode}
<br><br>

</body>
</html>