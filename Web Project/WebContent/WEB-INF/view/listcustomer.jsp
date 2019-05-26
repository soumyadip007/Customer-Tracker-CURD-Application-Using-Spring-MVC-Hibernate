<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>


    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" type="text/css">
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
<br><br>
<div class="container">
  <div class="row"> 
   <div class="col-sm">
   
   
   
  <h1 class="display-2">Customer Tracker</h1>
  <br>
  
<input type="button" class="btn btn-success" value="Add Customer"
onclick="window.location.href='showFormForAdd'; return false;"
/>


<table  class="table table-striped table-dark">
  <thead >

<tr>
	<th scope="col">First Name</th>
	<th scope="col">Last Name</th>
	<th scope="col">Email</th>
	<th scope="col">Update</th>
	<th scope="col">Delete</th>
</tr>
</thead  >
  <tbody>
<c:forEach var="temp" items="${customers}">
<tr>
	<td>${temp.firstName}</td>
	<td>${temp.lastName}</td>
	<td>${temp.email}</td>
	
<td>	
<c:url var="updateLink" value="/customer/showFormForUpdate">
	<c:param name="customerID" value="${temp.id}" />
</c:url>	
<!-- - 
<input type="button" class="btn btn-outline-primary" value="Update"
onclick="window.location.href='showFormForUpdate?id=${temp.id}'; return false;"
/>-->	
<a href="${updateLink}" >Update</a>
</td>

	
<td>
<c:url var="deleteLink" value="/customer/delete">
	<c:param name="customerID" value="${temp.id}" />
</c:url>
<a href="${deleteLink}" 
onclick="if (!(confirm('Are you sure that you want to delete this customer? '))) return false"
>Delete</a>
</td>
</tr>

</c:forEach>
</tbody>
</table>
</div>
</div>
</div>


</body>
</html>