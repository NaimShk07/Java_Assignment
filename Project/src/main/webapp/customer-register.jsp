<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="header.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
            <div class="checkout__form">
                <form action="CustomerController" method="post">
                    <div class="row">
                        <div class="col-lg-8 col-md-6">
                           <h3 class="checkout__title">Customer Register</h3>
                           <%
								String msg=(String)request.getAttribute("msg");
								if(msg!=null){
								%>
								<h5 class="checkout__title border-0 mt-2 mb-2"><%out.print(msg); %></h5>
								<%
								}
								%>
                           
                            <div class="checkout__input">
                                <p>Name<span>*</span></p>
                                <input type="text" name="name">
                            </div>
                             <div class="checkout__input">
                                <p>Contact<span>*</span></p>
                                <input type="text" name="contact">
                            </div>
                             <div class="checkout__input">
                                <p>Address<span>*</span></p>
                                <input type="text" name="address">
                            </div>
                             <div class="checkout__input">
                                <p>Email<span>*</span></p>
                                <input type="email" name="email">
                            </div>
                            <div class="checkout__input">
                                <p>Password<span>*</span></p>
                                <input type="password" name="password">
                            </div>
                           
                            	<div class="checkout__input">
									<input type="submit" name="action" class="site-btn col-4 text-light" value="register">
								</div>
								
                           
                        </div>
                        
                    </div>
                </form>
            </div>
        </div>
    </section>
    <!-- Checkout Section End -->

</body>
</html>