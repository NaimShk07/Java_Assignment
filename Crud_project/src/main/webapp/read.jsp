<%@page import="user.User"%>
<%@page import="dao.UserDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>


</head>
<body>
<%
List<User> list = UserDao.getAllUser(); // for all data
%>

<div class="container mt-3">
  <h2>All user data</h2>
     
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Name</th>
        <th>Number</th>
        <th>Email</th>
        <th>Password<th/>
        
      </tr>
    </thead>
    <tbody>
    <%for(User u:list){ %>
      <tr>
        <td><%=u.getName() %></td>
        <td><%=u.getNumber() %></td>
        <td><%=u.getEmail() %></td>
        <td><%=u.getPassword() %></td>
        <td>
	        <form action="UserController" method="post">
	        	<input type="hidden" name="id" value="<%=u.getId()%>">
		        <input type="submit" name="action" class="btn btn-primary mr-5" value="edit" >
		        <input type="submit" name="action" class="btn btn-danger" value="delete">
		    </form>
        <td/>
        
      </tr>
      <%} %>
      
    </tbody>
  </table>
</div>
<%User user = null; // for one data

if (request.getAttribute("user") != null) {
    user = (User) request.getAttribute("user");
    
%>
    <script>
    $(document).ready(function(){
        $('#myModal').modal('show'); 
    });
    </script>
    <!-- The Modal -->
		<div class="modal" id="myModal">
		  <div class="modal-dialog modal-lg modal-dialog-centered">
		    <div class="modal-content">
		
		      <!-- Modal Header -->
		      <div class="modal-header">
		        <h4 class="modal-title">Modal Heading</h4>
		        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
		      </div>
		
		      <!-- Modal body -->
		      <div class="modal-body">
		       <form action="UserController" method="post" >
		       <input type="hidden" name="id" value="<%=user.getId()%>">
		    
		       		<div class="mb-3 mt-3">
				      <label for="email">Name:</label>
				      <input type="text" class="form-control" name="name" value="<%=user.getName()%>">
				    </div>
				    <div class="mb-3">
				      <label for="pwd">number:</label>
				      <input type="text" class="form-control"  name="number" value="<%=user.getNumber()%>">
				    </div>
				     <div class="mb-3 mt-3">
				      <label for="email">Email:</label>
				      <input type="email" class="form-control"  name="email" value="<%=user.getEmail()%>">
				    </div>
				    <div class="mb-3">
				      <label for="pwd">Password:</label>
				      <input type="password" class="form-control"  name="password" value="<%=user.getPassword()%>">
				    </div>
				
				    	<input type="submit" name="action" class="btn btn-primary"  data-bs-dismiss="modal" value="update">
												
		  		</form>
		      </div>
		    </div>
		  </div>
		</div>
   
<%} %>

</body>
</html>