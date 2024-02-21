<%@page import="model.Driver"%>
<%@page import="model.Passenger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>title</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&family=Roboto:wght@100;300;400;500;700;900&display=swap");
			* {
				margin: 0;
				padding: 0;
				box-sizing: border-box;
				font-family: "Poppins", sans-serif;
				font-family: "Roboto", sans-serif;
			}


</style>
<body>
<%
response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", 0);
%>

<nav class="navbar navbar-expand-sm navbar-dark bg-dark ">
  <div class="container pr-5">
    <a class="navbar-brand" href="driver-home.jsp"><h4>CarPooling</h4></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="mynavbar">
      <ul class="navbar-nav me-auto">
        <li class="nav-item dropdown">
		  <a class="nav-link dropdown-toggle" href="driver-login.jsp" role="button" data-bs-toggle="dropdown">Rides</a>
		  <ul class="dropdown-menu">
		    <li><a class="dropdown-item" href="add-ride.jsp">Add rides</a></li>
		    <li><a class="dropdown-item" href="manage-ride.jsp">Manage rides</a></li>
		   
		  </ul>
		</li>
        
       
      </ul>
      <div class="d-flex">
       <ul class="navbar-nav me-auto ">
        
        <%Driver d=null;
        if(session.getAttribute("driver")!=null){
        	d=(Driver)session.getAttribute("driver");
        }
        %>
      
       <li class="nav-item dropdown ">
		  <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"><%=d.getName() %></a>
		  <ul class="dropdown-menu">
		    <li><a class="dropdown-item" href="driver-profile.jsp">Profile</a></li>
		    <li><a class="dropdown-item" href="driver-edit.jsp">Edit profile</a></li>
		    <li><a class="dropdown-item" href="driver-logout.jsp">Logout</a></li>
		  </ul>
		</li>
      
      </ul>
      </div>
    </div>
  </div>
</nav>



</body>
</html>


    