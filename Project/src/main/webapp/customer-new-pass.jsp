<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp"%>
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
							<h3 class="checkout__title">Change Password</h3>
							<% String email=(String)request.getAttribute("email"); %>
							<input type="hidden" name="email" value="<%=email%>">
			

		
							<div class="checkout__input">

								<input type="password" name="np" placeholder="Enter new password">
							</div>
							<div class="checkout__input" >
									
								<input  type="password" name="cnp" placeholder="Confirm new password">
							</div>
	


							<div class="checkout__input">
								<input type="submit" name="action"
									class="site-btn col-4 text-light" value="new password">
							</div>


						</div>

					</div>
				</form>
			</div>
		</div>
	</section>

</body>
</html>