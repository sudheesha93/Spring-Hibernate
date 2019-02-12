<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>STUDENT CONFIRMATION</title>
</head>
<body>
	

Student is confirmed
<br>
student Details :
<br><br>
Name: ${student.firstName} ${student.lastName} 
<br><br>
Country: ${student.country}
<br><br>
Gender: ${student.gender} 
<br><br>
Hoobies:
<ul>
<c:forEach var="temp" items="${student.hoobies}">
<li> ${temp} </li>
</c:forEach>
</ul>


</body>
</html>