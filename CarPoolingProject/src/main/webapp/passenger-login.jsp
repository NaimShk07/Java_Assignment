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

	<div class="container pt-3">
	<form action="PassController" method="post">
		<h3>Passenger login</h3>
			<%String msg1=(String)request.getAttribute("msg1");
			String msg2=(String)request.getAttribute("msg2");%>
			<%
			if(msg1!=null){%>
				<h2>Email not registered</h2>
			<%}%>	
			<%
			if(msg2!=null){%>
				<h2>Password is incorrect</h2>
			<%}%>	  
			
		  <div class="mb-3 mt-3">
		    <label for="email" class="form-label">Email:</label>
		    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
		  </div>
		  <div class="mb-3">
		    <label for="pwd" class="form-label">Password:</label>
		    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
		  </div>
 
 		 <input type="submit" class="btn btn-primary" name="action" value="login">
</form>
</div>
</body>
</html>