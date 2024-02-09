<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="customer-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>

<body>
<%
	List<Wishlist> list=WishlistDao.getWishlistByCusid(u.getId());

%>
<section class="product spad mt-5 ">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<ul class="filter__controls">
						<li class="active" data-filter="*">Our Products</li>

					</ul>
				</div>
			</div>
			<div class="row product__filter">
                <%for(Wishlist p:list){ %>
                <div class="col-lg-3 col-md-6 col-sm-6 col-md-6 col-sm-6 mix hot-sales">
                    <div class="product__item">
                        <div class="product__item__pic set-bg" data-setbg="image/<%=p.getImage()%>">
                            <ul class="product__hover">
                                <li>
                                  <a href="delete-wishlist.jsp?wid=<%=p.getWid() %>"  class="site-btn text-light"><i class="fa-solid fa-trash" ></i></i></a>		
                                </li>
                           </ul>
                           
                        </div>
                        <div class="product__item__text">
                            <h6><%=p.getPname()%></h6>
                            <a href="customer-single-product.jsp?pid=<%=p.getPid()%>" class="add-cart">+ Add To Cart</a>
                           
                            <h5><%=p.getPprice()%></h5>
                            <div class="product__color__select">
                                <label for="pc-4">
                                    <input type="radio" id="pc-4">
                                </label>
                                <label class="active black" for="pc-5">
                                    <input type="radio" id="pc-5">
                                </label>
                                <label class="grey" for="pc-6">
                                    <input type="radio" id="pc-6">
                                </label>
                            </div>
                            
                        </div>
                           
                    </div>
                </div>
                <%} %>
            </div>
			
		</div>
	</section>
	
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