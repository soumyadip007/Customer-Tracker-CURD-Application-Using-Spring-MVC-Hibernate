<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>


<table>
<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
</tr>

<c:forEach var="temp" items="${customers}">
<tr>
	<th>${temp.firstname}</th>
	<th>${temp.lastname}</th>
	<th>${temp.email}</th>
</tr>



</c:forEach>

</table>



</body>
</html>