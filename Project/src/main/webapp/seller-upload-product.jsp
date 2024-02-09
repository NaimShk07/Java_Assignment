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

	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<form action="ProductController" method="post" enctype="multipart/form-data">
					<div class="row">
						<div class="col-lg-8 col-md-6">
							<h3 class="checkout__title">Seller Profile</h3>
							<div class="checkout__input">

								<input type="hidden" name="sid" value="<%=u.getId()%>">
							</div>

							<div class="checkout__input">

								<input type="file" name="image">
							</div>
							<div class="checkout__input">

								<input type="text" name="pname" placeholder="Product Name">
							</div>
							<div class="checkout__input">

								<input type="text" name="pprice" placeholder="Product Price">
							</div>
							<div class="checkout__input">

								<input type="text" name="pcategory"
									placeholder="Product Category">
							</div>
							<div class="checkout__input">

								<input type="text" name="pdesc"
									placeholder="Product Description">
							</div>



							<div class="checkout__input">
								<input type="submit" name="action"
									class="site-btn col-4 text-light" value="upload">
							</div>


						</div>

					</div>
				</form>
			</div>
		</div>
	</section>

</body>
</html>