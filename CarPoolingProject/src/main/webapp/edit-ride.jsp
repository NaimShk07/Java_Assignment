<%@page import="model.Rides"%>
<%@page import="dao.RidesDao"%>
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
<% int rid=Integer.parseInt(request.getParameter("rid"));
Rides r=RidesDao.getSingleRideByRid(rid);
%>

	<div class="container pt-3">
		<form action="RideController" method="post">
		<h3>Edit ride</h3>
		<input type="hidden" name="rid" value="<%=rid%>">
		
		<div class="mb-3 mt-3">
	    <label for="email" class="form-label">Date of ride:</label>
	    <input type="date" class="form-control" value="<%=r.getRideDate() %>" name="date">
	  </div>		
	  <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Departure From:</label>
	    <input type="text" class="form-control" value="<%=r.getDeparture() %>" name="departure">
	      <input type="text" class="form-control"  value="<%=r.getExactDeparture() %>" name="exactdeparture">
	  
	  </div>
	   <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Departure time:</label>
	    <input type="time" class="form-control" value="<%=r.getDtime() %>" name="dtime">
	  </div>
	  <div class="mb-3">
	    <label for="pwd" class="form-label">Arrival to:</label>
	    <input type="text" class="form-control"  value="<%=r.getArrival() %>" name="arrival">
	     <input type="text" class="form-control"  value="<%=r.getExactArrival() %>" name="exactarrival">
	  
	  </div>
	 
	   <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Arrival time:</label>
	    <input type="time" class="form-control" value="<%=r.getAtime() %>" name="atime">
	  </div>
	  <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Number of distance:</label>
	    <input type="text" class="form-control"  value="<%=r.getDistKm() %>" name="distkm">
	  </div>
	  <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Number of seats:</label>
	    <input type="text" class="form-control"  value="<%=r.getNoOfSeat() %>" name="seat">
	  </div>
	   <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Number of seats fills:</label>
	    <input type="text" class="form-control"  value="<%=r.getNoofseatfill() %>" name="seatfill">
	  </div>
	  <div class="mb-3">
	    <label for="pwd" class="form-label">Price:</label>
	    <input type="text" class="form-control"  value="<%=r.getPrice() %>" name="price">
	  </div>
	 
	  <input type="submit" class="btn btn-primary" name="action" value="update">
	</form>
	</div>
</body>
</html>