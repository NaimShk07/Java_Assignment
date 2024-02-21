<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<form action="DriverController" method="post">
	<h3>Driver Signup</h3>
	
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Name:</label>
    <input type="text" class="form-control" placeholder="Enter name" name="name">
  </div>
  <div class="mb-3">
    <label for="pwd" class="form-label">Mobile number:</label>
    <input type="text" class="form-control"  placeholder="Enter mobile number" name="number">
  </div>
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Age:</label>
    <input type="text" class="form-control" placeholder="Enter age" name="age">
  </div>
   <div class="mb-3 mt-3">
    <label for="email" class="form-label">Address:</label>
    <input type="text" class="form-control" placeholder="Enter address" name="address">
  </div>
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Vehicle name:</label>
    <input type="text" class="form-control" placeholder="Enter vehicle name" name="vname">
  </div>
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Email:</label>
    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
  </div>
  <div class="mb-3">
    <label for="pwd" class="form-label">Password:</label>
    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
  </div>
  
 
  <input type="submit" class="btn btn-primary" name="action" value="register">
</form>
</div>

</body>
</html>