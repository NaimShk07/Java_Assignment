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

	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<form action="CustomerController" method="post">
					<div class="row">
						<div class="col-lg-8 col-md-6">
							<h3 class="checkout__title">Customer Profile</h3>
							<div class="checkout__input">

								<input type="hidden" name="id" value="<%=u.getId()%>">
							</div>

							<div class="checkout__input">

								<input type="text" name="name" value="<%=u.getName()%>">
							</div>
							<div class="checkout__input">

								<input type="text" name="contact" value="<%=u.getContact()%>">
							</div>
							<div class="checkout__input">

								<input type="text" name="address" value="<%=u.getAddress()%>">
							</div>
							<div class="checkout__input">

								<input type="email" name="email" value="<%=u.getEmail() %>">
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