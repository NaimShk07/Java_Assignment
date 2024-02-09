<%@page import="dao.CartDao"%>
<%@page import="model.Cart"%>
<%@page import="dao.WishlistDao"%>
<%@page import="model.Wishlist"%>
<%@page import="java.util.List"%>
<%@page import="model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>

<%
response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", 0);
%>
<%
	Customer u = null;
	if (session.getAttribute("user") != null) {
		u = (Customer) session.getAttribute("user");
	}
	
	
	List<Wishlist> wlist=WishlistDao.getWishlistByCusid(u.getId());
	List<Cart> cartList=CartDao.getCartItemByCusid(u.getId());
	
%>
	<!-- Header Section Begin -->
	<header>
		<div class="ml-5 mr-5">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<div class="header__logo">
						<a href="./customer-home.jsp"><img src="img/logo.png" alt=""></a>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<nav class="header__menu mobile-menu">
						<ul>
							<li class="active"><a href="./customer-home.jsp">Home</a></li>
							<li><a href="./shop.html">Shop</a></li>

							<li><a href="./blog.html">Blog</a></li>
							<li><a href="#">Pages</a>
								<ul class="dropdown">
									<li><a href="./about.html">About Us</a></li>
									<li><a href="./contact.html">Contact Us</a></li>
									<li><a href="./shop-details.html">Shop Details</a></li>
									<li><a href="./shopping-cart.html">Shopping Cart</a></li>
									<li><a href="./checkout.html">Check Out</a></li>
									<li><a href="./blog-details.html">Blog Details</a></li>
								</ul></li>

							
							<li><a href="#"><i class="fa fa-user mr-2"></i><%=u.getName()%></a>
								<ul class="dropdown " style="width: 170px">
									<li><a href="customer-profile.jsp">Profile</a></li>
									<li><a href="customer-change-password.jsp">Change password</a></li>
									<li><a href="customer-logout.jsp">Logout</a></li>
								</ul></li>

						</ul>
					</nav>
				</div>
				<div class="col-lg-3 col-md-3">
					<div class="header__nav__option">
						<a href="#" class="search-switch"><img src="img/icon/search.png" alt=""></a> 
							<a href="customer-wishlist.jsp"><img src="img/icon/heart.png" alt=""><span style="margin :-13px 0 0 13px;"><%=wlist.size() %></span></a>
							 <a href="shopping-cart.jsp"><img src="img/icon/cart.png" alt="">
							<span><%=cartList.size() %></span></a>
						
					</div>
				</div>
			</div>
			<div class="canvas__open">
				<i class="fa fa-bars"></i>
			</div>
		</div>
	</header>
	<!-- Header Section End -->

	<!-- Js Plugins -->
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/jquery.countdown.min.js"></script>
	<script src="js/jquery.slicknav.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>