<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>

</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
	<br><br>
	
	Last Name: <form:input path="lastName" />
	<br><br>
	
	Country:
	<form:select path="country">
		<form:options items="${student.countryOptions}" />
		
	</form:select>
	<br><br>
	
	Gender: 
	FEMALE: <form:radiobutton path="gender" value="Female"/>
	MALE: <form:radiobutton path="gender" value="Male"/>
	OTHER: <form:radiobutton path="gender" value="Other"/>
	<br><br>
	
	Hobbies: 
	Coding: <form:checkbox path="hoobies" value="Coding"/>
	Hanging out: <form:checkbox path="hoobies" value="Hanging out"/>
	Movies: <form:checkbox path="hoobies" value="Movies"/>
	Music: <form:checkbox path="hoobies" value="Music"/>
	<br><br>
	
	<input type="submit" value="Submit" />
	
	</form:form>






</body>
</html>