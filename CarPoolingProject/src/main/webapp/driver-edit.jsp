<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="driver-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container pt-3">
	<form action="DriverController" method="post">
	<h3>Driver edit Profile</h3>
	
  <div class="mb-3 mt-3">
  <input type="hidden" name="did" value="<%=d.getDid()%>">
  <label for="email" class="form-label">Name:</label>
    <input type="text" class="form-control"  name="name" value="<%=d.getName()%>">
  </div>
  <div class="mb-3">
  <label for="email" class="form-label">Number:</label>
   <input type="text" class="form-control"   name="number" value="<%=d.getNumber()%>">
  </div>
  <div class="mb-3 mt-3">
  <label for="email" class="form-label">Age:</label>
    <input type="text" class="form-control"  name="age" value="<%=d.getAge()%>">
  </div>
   <div class="mb-3 mt-3">
   <label for="email" class="form-label">Address:</label>
    <input type="text" class="form-control"  name="address" value="<%=d.getAddress()%>">
  </div>
  <div class="mb-3 mt-3">
  <label for="email" class="form-label">Vehicle name:</label>
    <input type="text" class="form-control"  name="vname" value="<%=d.getVname()%>">
  </div>
  <div class="mb-3 mt-3">
  <label for="email" class="form-label">Email:</label>
     <input type="email" class="form-control" id="email"  name="email" value="<%=d.getEmail()%>">
  </div>
  <div class="mb-3">
  <label for="email" class="form-label">Password:</label>
    <input type="password" class="form-control" id="pwd"  name="password" value="<%=d.getPassword()%>">
  </div>
  
 
  <input type="submit" class="btn btn-primary" name="action" value="update">
</form>
</div>

</body>
</html>