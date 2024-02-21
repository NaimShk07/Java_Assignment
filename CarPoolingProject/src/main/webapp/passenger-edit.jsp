<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="passenger-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container pt-3">
	<form action="PassController" method="post">
	<h3>Passenger edit Profile</h3>
	
  <div class="mb-3 mt-3">
  <input type="hidden" name="pid" value="<%=p.getPid()%>">
  <label for="email" class="form-label">Name:</label>
    <input type="text" class="form-control"  name="name" value="<%=p.getName()%>">
  </div>
  <div class="mb-3">
  <label for="email" class="form-label">Number:</label>
   <input type="text" class="form-control"   name="number" value="<%=p.getNumber()%>">
  </div>
  <div class="mb-3 mt-3">
  <label for="email" class="form-label">Age:</label>
    <input type="text" class="form-control"  name="age" value="<%=p.getAge()%>">
  </div>
   <div class="mb-3 mt-3">
   <label for="email" class="form-label">Address:</label>
    <input type="text" class="form-control"  name="address" value="<%=p.getAddress()%>">
  </div>

  <div class="mb-3 mt-3">
  <label for="email" class="form-label">Email:</label>
     <input type="email" class="form-control" id="email"  name="email" value="<%=p.getEmail()%>">
  </div>
  <div class="mb-3">
  <label for="email" class="form-label">Password:</label>
    <input type="password" class="form-control" id="pwd"  name="password" value="<%=p.getPassword()%>">
  </div>
  
 
  <input type="submit" class="btn btn-primary" name="action" value="update">
</form>
</div>

</body>
</html>