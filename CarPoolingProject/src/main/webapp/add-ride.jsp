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
		<form action="RideController" method="post">
		<h3>Add rides</h3>
		<input type="hidden" name="did" value="<%=d.getDid()%>">
		
		<div class="mb-3 mt-3">
	    <label for="email" class="form-label">Date of ride:</label>
	    <input type="date" class="form-control" placeholder="Enter ride date" name="date">
	  </div>		
	  <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Departure From:</label>
	    <input type="text" class="form-control" placeholder="Enter departure place" name="departure">
	      <input type="text" class="form-control"  placeholder="Enter exact departure address" name="exactdeparture">
	  
	  </div>
	   <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Departure time:</label>
	    <input type="time" class="form-control" placeholder="Enter departure time" name="dtime">
	  </div>
	  <div class="mb-3">
	    <label for="pwd" class="form-label">Arrival to:</label>
	    <input type="text" class="form-control"  placeholder="Enter arrival place" name="arrival">
	     <input type="text" class="form-control"  placeholder="Enter exact arrival address" name="exactarrival">
	  
	  </div>
	 
	   <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Arrival time:</label>
	    <input type="time" class="form-control" placeholder="Enter arrival time" name="atime">
	  </div>
	   <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Distance in KM:</label>
	    <input type="text" class="form-control"  placeholder="Enter distance in KM" name="distkm">
	  </div>
	  <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Number of seats:</label>
	    <input type="text" class="form-control"  placeholder="Enter number of seats" name="seat">
	  </div>
	  <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Number of seats fills:</label>
	    <input type="text" class="form-control" placeholder="Enter number of seats filled"   name="seatfill">
	  </div>
	  <div class="mb-3">
	    <label for="pwd" class="form-label">Price:</label>
	    <input type="text" class="form-control"  placeholder="Enter price" name="price">
	  </div>
	 
	  <input type="submit" class="btn btn-primary" name="action" value="add ride">
	</form>
	</div>

</body>
</html>