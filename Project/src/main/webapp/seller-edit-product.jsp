<%@page import="model.Product"%>
<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="seller-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//this is coming from url
	%>
	<%
	int pid = Integer.parseInt(request.getParameter("id"));
	%>
	<%
	Product p = ProductDao.getProductByPid(pid);
	%>
	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<form action="ProductController" method="post"
					enctype="multipart/form-data">
					<h3 class="checkout__title">Product Detail</h3>
					<div class="row d-flex">
					
						<div class="col-lg-6 col-md-6">
							<img src="image/<%=p.getImage()%>" style="width: 500px" alt="">

						</div>
						<div class="col-lg-6 col-md-6">
							

							
							<div class="checkout__input">

								<input type="hidden" name="pid" value="<%=pid%>">
							</div>

							
							<div class="checkout__input">

								<input type="text" name="pname" value="<%=p.getPname()%>">
							</div>
							<div class="checkout__input">

								<input type="text" name="pprice" value="<%=p.getPprice()%>">
							</div>
							<div class="checkout__input">

								<input type="text" name="pcategory"
									value="<%=p.getPcategory()%>">
							</div>
							<div class="checkout__input">

								<input type="text" name="pdesc" value="<%=p.getPdesc()%>">
							</div>



							<div class="checkout__input">
								<input type="submit" name="action"
									class="site-btn col-4 text-light" value="update">
							</div>


						</div>

					</div>
				</form>
			</div>
		</div>
	</section>

</body>
</html>