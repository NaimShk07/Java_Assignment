<%@page import="dao.BookedRideDao"%>
<%@page import="model.BookedRides"%>
<%@page import="java.util.List"%>
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
<%List<BookedRides> list=BookedRideDao.getBookedrideByPid(p.getPid()); %>

<div class="container mt-3">
  <h2>Booked ride</h2>
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Date</th>
        <th>Departure</th>
        <th>Departure time</th>
        <th>Arrival</th>
        <th>Arrival time</th>
        <th>Price</th>
       
      </tr>
    </thead>
    <tbody>
      <%for(BookedRides br:list){%>
	      <tr>
	      <%int totalprice=br.getFhprice()+br.getShprice(); %>
	        <td><%=br.getRideDate() %></td>
	        <td><%=br.getDeparture() %></td>
	        <td><%=br.getDtime() %></td>
	        <td><%=br.getArrival() %></td>
	        <td><%=br.getAtime() %></td>
	        <td><%=totalprice %></td>
	        
	      </tr>
      
      <%} %>
    </tbody>
  </table>
</div>

</body>
</html>