<%@page import="dao.WishlistDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int wid=Integer.parseInt(request.getParameter("wid"));
WishlistDao.deleteWishlist(wid);
response.sendRedirect("customer-wishlist.jsp");



%>

</body>
</html>