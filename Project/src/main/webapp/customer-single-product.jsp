<%@page import="dao.CartDao"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="customer-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<title>Insert title here</title>
</head>
<body>
	<%
	//this is coming from url
	%>
	<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	%>
	<%
	Product p = ProductDao.getProductByPid(pid);
	%>
	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<form action="ProductController" 
					enctype="multipart/form-data">
					<h3 class="checkout__title">Product Detail</h3>
					<div class="row d-flex">
					
						<div class="col-lg-6 col-md-6">
							<img src="image/<%=p.getImage()%>" style="width: 400px" alt="">

						</div>
						<div class="col-lg-6 col-md-6">
							

							
							<div class="checkout__input">

								<input type="hidden" name="pid" readonly value="<%=pid%>">
							</div>

							
							<div class="checkout__input">

								<input type="text" name="pname" readonly value="<%=p.getPname()%>">
							</div>
							<div class="checkout__input">

								<input type="text" name="pprice" readonly value="<%=p.getPprice()%>">
							</div>
							<div class="checkout__input">

								<input type="text" name="pcategory" readonly value="<%=p.getPcategory()%>">
							</div>
							<div class="checkout__input">

								<input type="text" name="pdesc" readonly value="<%=p.getPdesc()%>">
							</div>
							<div class="checkout__input">
							<%
							if(WishlistDao.checkProdInWishlist(pid, u.getId())){					
							%>
							<a href="WishlistController?action=addtowishlist&pid=<%=pid %>&cusid=<%=u.getId() %>"  class="site-btn col-4 text-light">Wishlist <i class="fa-solid fa-heart"></i></a>
							<%} %>
							<%
							if(CartDao.checkProdCart(u.getId(), pid)){					
							%>
								<a href="CartController?action=addtocart&pid=<%=pid %>&cusid=<%=u.getId() %>" class="site-btn col-4 text-light">Add to cart <i class="fa-solid fa-cart-shopping"></i></a>
								<%} %>		
							</div>



							


						</div>

					</div>
				</form>
			</div>
		</div>
	</section>

</body>
</html>