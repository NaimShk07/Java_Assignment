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
                           <h3 class="checkout__title">Verify OTP</h3>
                            <%
								String msg=(String)request.getAttribute("msg");
								if(msg!=null){
								%>
								<h5 class="checkout__title border-0 mt-2 mb-2"><%out.print(msg); %></h5>
								<%
								}
								%>
                           
                           <% String email=(String)request.getAttribute("email"); %>
							<% int otp=(Integer)(request.getAttribute("otp")); %>
							
							<input type="hidden" name="email" value="<%=email%>" >
							<input type="hidden" name="otp1" value="<%=otp%>" >
                             <div class="checkout__input">
                        
                                <input type="text" name="otp2" placeholder="Enter otp">
                            </div>
                            
                           
                            	<div class="checkout__input">
									<input type="submit" name="action" class="site-btn col-4 text-light" value="verify">
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