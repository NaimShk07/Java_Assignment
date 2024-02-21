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
*{
margin:0px;
padding:0px;
box-sizing:border-box;
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
    <a class="navbar-brand" href="javascript:void(0)"><h4>CarPooling</h4></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="mynavbar">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link" href="rides.jsp">All Rides</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="booked-ride.jsp">Booked Rides</a>
        </li>
        
       
      </ul>
      <div class="d-flex">
       <ul class="navbar-nav me-auto ">
        
        <%Passenger p=null;
        if(session.getAttribute("passenger")!=null){
        	p=(Passenger)session.getAttribute("passenger");
        }
        %>
      
       <li class="nav-item dropdown ">
		  <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"><%=p.getName() %></a>
		  <ul class="dropdown-menu">
		    <li><a class="dropdown-item" href="passenger-profile.jsp">Profile</a></li>
		    <li><a class="dropdown-item" href="passenger-edit.jsp">Edit profile</a></li>
		    <li><a class="dropdown-item" href="passenger-logout.jsp">Logout</a></li>
		  </ul>
		</li>
      
      </ul>
      </div>
    </div>
  </div>
</nav>



</body>
</html>


    