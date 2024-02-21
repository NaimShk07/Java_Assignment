<%@page import="dao.RidesDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int rid=Integer.parseInt(request.getParameter("rid"));
RidesDao.deleteRide(rid);
response.sendRedirect("manage-ride.jsp");
%>
</body>
</html>