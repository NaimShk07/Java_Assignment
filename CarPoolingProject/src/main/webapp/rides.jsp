<%@page import="model.Passenger"%>
<%@page import="model.Driver"%>
<%@page import="dao.DriverDao"%>
<%@page import="model.Rides"%>
<%@page import="java.util.List"%>
<%@page import="dao.RidesDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="passenger-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&family=Roboto:wght@100;300;400;500;700;900&display=swap");
	* {
				margin: 0;
				padding: 0;
				box-sizing: border-box;
				font-family: "Poppins", sans-serif;
				font-family: "Roboto", sans-serif;
				color:black;
				
			}		
		




.ticket {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border: 1px solid #ccc;
  padding:  20px 30px;
  background-color:white;
  border:none;
  border-radius: 15px;
  margin-bottom:30px;
  box-shadow: 0px 1px 8px 0px hsla(0, 0%, 0%, 0.2);
  font-size:20px;
  

}
.journey{
 display:flex;
  flex-direction:column;
  gap:10px;
  width:60%;
  }

.journey p {
  margin: 0;
 
}

.time, .duration {
  color: gray; /* You can change the color according to your needs */
}
.price{

width:20%;
}

.user{


width:20%;}




.user img {
   border-radius:50%;
}
a{
text-decoration:none;

}
</style>

</head>
<body>
<%Passenger p2=null;
        if(session.getAttribute("passenger")!=null){
        	p2=(Passenger)session.getAttribute("passenger");
        }else{
        	response.sendRedirect("passenger-login.jsp");
        }
        %>
<div class="container mt-5 mb-4">
	<h2>All rides</h2>
</div>
<% List<Rides> list= RidesDao.getAllRides();

for(Rides r:list){%>
<a href="single-ride.jsp?rid=<%=r.getRid()%>">
	<div class="ticket container">
	    <div class="journey">
	        <p><span class="time"><%=r.getDtime() %></span> <%=r.getDeparture() %></p>
	        <p><span class="duration">to <%=r.getDistKm() %>km</span></p>
	        <p><span class="time"><%=r.getAtime() %></span> <%=r.getArrival() %></p>
	    </div>
	    <div class="price">₹<%=r.getPrice() %></div>
	    <div class="user">
	    <%Driver dinfo=DriverDao.getDriverInfo(r.getDid()); %>
	       <i class="fa-regular fa-circle-user"></i><%=dinfo.getName() %>
	        <span>&nbsp; </span>
	        <i class="fa-solid fa-car"></i><%=dinfo.getVname() %>
	    </div>
	    
	</div>
</a>
<%} %>

</body>
</html>