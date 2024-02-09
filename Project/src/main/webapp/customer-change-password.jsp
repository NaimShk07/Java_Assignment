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
							<h3 class="checkout__title">Change Customer Password</h3>
							 <%
								String msg=(String)request.getAttribute("msg");
								if(msg!=null){
							  %>
								<h5 class="checkout__title border-0 mt-2 mb-2"><%out.print(msg); %></h5>
							  <%
								}
							  %>
							<div class="checkout__input">

								<input type="hidden" name="id" value="<%=u.getId()%>">
							</div>

							<div class="checkout__input">

								<input type="password" name="op" placeholder="Enter old password">
							</div>
							<div class="checkout__input">

								<input type="password" name="np" placeholder="Enter new password">
							</div>
							<div class="checkout__input" >
									
								<input  type="password" name="cnp" placeholder="Confirm new password">
							</div>
	


							<div class="checkout__input">
								<input type="submit" name="action"
									class="site-btn col-4 text-light" value="change password">
							</div>


						</div>

					</div>
				</form>
			</div>
		</div>
	</section>

</body>
</html>