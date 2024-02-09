<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="customer-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
<%
List<Product> list=ProductDao.getAllProduct();
%>

	<!-- Hero Section Starts-->
	<section class="hero">
		<div class="hero__slider owl-carousel">
			<div class="hero__items set-bg" data-setbg="img/hero/hero-1.jpg">
				<div class="container">
					<div class="row">
						<div class="col-xl-5 col-lg-7 col-md-8">
							<div class="hero__text">
								<h6>Summer Collection</h6>
								<h2>Fall - Winter Collections 2030</h2>
								<p>A specialist label creating luxury essentials. Ethically
									crafted with an unwavering commitment to exceptional quality.</p>
								<a href="#" class="primary-btn">Shop now <span
									class="arrow_right"></span></a>
								<div class="hero__social">
									<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
										class="fa fa-twitter"></i></a> <a href="#"><i
										class="fa fa-pinterest"></i></a> <a href="#"><i
										class="fa fa-instagram"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="hero__items set-bg" data-setbg="img/hero/hero-2.jpg">
				<div class="container">
					<div class="row">
						<div class="col-xl-5 col-lg-7 col-md-8">
							<div class="hero__text">
								<h6>Summer Collection</h6>
								<h2>Fall - Winter Collections 2030</h2>
								<p>A specialist label creating luxury essentials. Ethically
									crafted with an unwavering commitment to exceptional quality.</p>
								<a href="#" class="primary-btn">Shop now <span
									class="arrow_right"></span></a>
								<div class="hero__social">
									<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
										class="fa fa-twitter"></i></a> <a href="#"><i
										class="fa fa-pinterest"></i></a> <a href="#"><i
										class="fa fa-instagram"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Hero Section End -->

	<!-- Product Section Begin -->
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
                <%for(Product p:list){ %>
                <div class="col-lg-3 col-md-6 col-sm-6 col-md-6 col-sm-6 mix hot-sales">
                    <div class="product__item">
                        <div class="product__item__pic set-bg" data-setbg="image/<%=p.getImage()%>">
                            <ul class="product__hover">
                                <li><a href="customer-single-product.jsp?pid=<%=p.getPid()%>"><img src="img/icon/heart.png" alt=""></a></li>
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
	<!-- Product Section End -->

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