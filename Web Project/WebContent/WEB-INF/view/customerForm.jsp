<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" type="text/css">
	
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Customer Reg Page</title>


</head>


<body>
<br>
<div class="container">
  <div class="row"> 
   <div class="col-sm">
   
    
   
   
  <h1 class="display-2">Customer Tracker</h1>
  
  <h3 class="display-4">Add New Customer</h3>
  <br>
<form:form action="saveForm" class="form-control"  modelAttribute="customer" method="post">

 First Name: <form:input type="text" class="form-control"  path="firstName" placeholder="Enter first name" "/>
  <br>
  
   Last Name: <form:input type="text" class="form-control"  path="lastName" placeholder="Enter last name"/>
   
  <br>
  
  
 	Email: <form:input path="email" class="form-control"  placeholder="Enter email"/>
   
  <br>
  <input type="submit"class="btn btn-success"   value="Add Customer"/>

</form:form>
<br><br>

<a href="${pageContext.request.contextPath}/customer/list">Back to list page</a>

</div>
</div>
</div>
</body>
</html>