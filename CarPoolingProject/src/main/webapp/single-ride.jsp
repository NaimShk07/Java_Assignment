<%@page import="model.Rides"%>
<%@page import="dao.RidesDao"%>
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
<%int rid=Integer.parseInt(request.getParameter("rid"));
Rides r=RidesDao.getSingleRideByRid(rid);
%>
	<div class="container mt-3">
	  <h1>Ride info</h1>
	  <h2 class="text-center"><%=r.getRideDate() %></h2>
	  
	  <form action="BookedRideController" method="post" >
	    <div class="mb-3 mt-3">	      
	      <input type="text" class="form-control" value="<%=r.getDeparture() %>" readonly name="email">
	      <input type="text" class="form-control" value="<%=r.getExactDeparture() %>" readonly name="email">
	      <input type="text" class="form-control" value="<%=r.getDtime() %>" readonly name="email">
	    </div>
	    <h5>To</h5>
	    <div class="mb-3">	     
	       <input type="text" class="form-control" value="<%=r.getArrival() %>" readonly name="email">
	      <input type="text" class="form-control" value="<%=r.getExactArrival() %>" readonly name="email">
	      <input type="text" class="form-control" value="<%=r.getAtime() %>" readonly name="email">
	    </div>
	    <div class="mb-3">
	    <label for="cars">Select pickup location:</label>
	    	<select name="pickup" >
			  <option value="default"><%=r.getDeparture() %></option>
			  <option value="other">Other</option>			  
			</select>
	    </div>
	    <input type="hidden" name="rid" value="<%=rid %>">
	    <input type="hidden" name="pid" value="<%=p.getPid() %>">
	   
	  
			  <input  type="submit" class="btn btn-primary" name="action" value="book">
	  </form>
	</div>

</body>
</html>