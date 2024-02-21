<%@page import="dao.RidesDao"%>
<%@page import="model.Rides"%>
<%@page import="java.util.List"%>
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
<% List<Rides> list=RidesDao.getRidesByDid(d.getDid()); %>
<div class="container mt-3">
  <h2>Manage Rides</h2>
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Date</th>
        <th>Departure</th>
        <th>Exact Departure</th>
        <th>Departure time</th>
        <th>Arrival</th>
        <th>Exact Arrival</th>
        <th>Arrival time</th>
        <th>Distance</th>
        <th>No of seat</th>
        <th>Price</th>
        <th>Actions</th>
      </tr>
    </thead>
    <tbody>
      <%for(Rides r:list) {%>
	      <tr>
	        <td><%=r.getRideDate() %></td>
	        <td><%=r.getDeparture() %></td>
	        <td><%=r.getExactDeparture()%></td>
	        <td><%=r.getDtime() %></td>
	        <td><%=r.getArrival() %></td>
	        <td><%=r.getExactArrival() %></td>
	        <td><%=r.getAtime() %></td>
	        <td><%=r.getDistKm() %> KM</td>
	        <td><%=r.getNoOfSeat() %></td>
	        <td><%=r.getPrice() %></td>
	        <td>
	        	<a href="edit-ride.jsp?rid=<%=r.getRid() %>" class="btn btn-primary">Edit</a>
	        	<a href="delete-ride.jsp?rid=<%=r.getRid() %>" class="btn btn-danger">Delete</a>
	        </td>
	      </tr>
      
      <%} %>
    </tbody>
  </table>
</div>

</body>
</html>