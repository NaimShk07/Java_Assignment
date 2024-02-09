<%@page import="dao.CartDao"%>
<%@page import="model.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="customer-header.jsp" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Male_Fashion Template">
    <meta name="keywords" content="Male_Fashion, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Male-Fashion | Template</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
    rel="stylesheet">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    
   
   </head>

<body>
    <!-- Page Preloder    <div id="preloder">
        <div class="loader"></div>
    </div>
     -->
    <%List<Cart> list=CartDao.getCartItemByCusid(u.getId()); %>

    

    <!-- Shopping Cart Section Begin -->
    <section class="shopping-cart spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-8">
                    <div class="shopping__cart__table">
                        <table>
                            <thead>
                                <tr>
                                    <th>Product</th>
                                    <th>Quantity</th>
                                    <th>Total</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                            <%int netprice=0; %>
                            <%
                            for(Cart c:list){	
                            %>
                            <% netprice = netprice + c.getTotalamt(); %>
                                <tr>
                                    <td class="product__cart__item">
                                        <div class="product__cart__item__pic">
                                            <img src="image/<%=c.getImage() %>" style="width:100px" alt="">
                                        </div>
                                        <div class="product__cart__item__text">
                                            <h6><%=c.getPname() %></h6>
                                            <h5>Rs. <%=c.getPprice() %></h5>
                                        </div>
                                    </td>
                                    <td class="quantity__item">
                                        <div class="quantity">
                                            <div class="pro-qty-2">
                                            	<form action="CartController" method="post" name="form">
												    <i class="fa-solid fa-angle-left" id="<%=c.getCartid()%>" onclick="decrement(this)"  style="cursor:pointer"></i>
												    <input type="text" name="qty" value="<%=c.getQty() %>" id="cartid<%=c.getCartid()%>" >
												    <input type="hidden" name="cartid" value="<%=c.getCartid()%>">
												    <input type="hidden" name="pprice" value="<%=c.getPprice()%>">
												    <i class="fa-solid fa-angle-right" id="<%=c.getCartid()%>" onclick="increment(this)" style="cursor:pointer"></i>
												</form>

                                            </div>
                                        </div>
                                    </td>
                                    <td class="cart__price">Rs. <%=c.getTotalamt() %></td>
                                    <td class="cart__close"><a href="delete-cart.jsp?cartid=<%=c.getCartid()%>"><i class="fa fa-close"></i></a>
                                    </td>
                                </tr>
                               <%} %> 
                            </tbody>
                        </table>
                    </div>
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="continue__btn">
                                <a href="customer-home.jsp">Continue Shopping</a>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6">
                      
                            <div class="continue__btn update__btn">
                                <a href=""><i class="fa fa-spinner"></i> Update cart</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    
                    <div class="cart__total">
                        <h6>Cart total</h6>
                        <form method="post" action="payment.jsp?amount=<%=netprice %>&cusid=<%=u.getId() %>">
                        <ul>
                        	<li>Subtotal <span>Rs. <%=netprice %></span></li>
                            <li>Total <span>Rs. <%=netprice %></span></li>
                        </ul>
                        <button class="primary-btn">Proceed to checkout</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Shopping Cart Section End -->

    <!-- Footer Section Begin -->
    <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="footer__about">
                        <div class="footer__logo">
                            <a href="#"><img src="img/footer-logo.png" alt=""></a>
                        </div>
                        <p>The customer is at the heart of our unique business model, which includes design.</p>
                        <a href="#"><img src="img/payment.png" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-2 offset-lg-1 col-md-3 col-sm-6">
                    <div class="footer__widget">
                        <h6>Shopping</h6>
                        <ul>
                            <li><a href="#">Clothing Store</a></li>
                            <li><a href="#">Trending Shoes</a></li>
                            <li><a href="#">Accessories</a></li>
                            <li><a href="#">Sale</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-2 col-md-3 col-sm-6">
                    <div class="footer__widget">
                        <h6>Shopping</h6>
                        <ul>
                            <li><a href="#">Contact Us</a></li>
                            <li><a href="#">Payment Methods</a></li>
                            <li><a href="#">Delivary</a></li>
                            <li><a href="#">Return & Exchanges</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 offset-lg-1 col-md-6 col-sm-6">
                    <div class="footer__widget">
                        <h6>NewLetter</h6>
                        <div class="footer__newslatter">
                            <p>Be the first to know about new arrivals, look books, sales & promos!</p>
                            <form action="#">
                                <input type="text" placeholder="Your email">
                                <button type="submit"><span class="icon_mail_alt"></span></button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12 text-center">
                    <div class="footer__copyright__text">
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        <p>Copyright ©
                            <script>
                                document.write(new Date().getFullYear());
                            </script>
                            All rights reserved | This template is made with <i class="fa fa-heart-o"
                            aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                        </p>
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- Footer Section End -->

    <!-- Search Begin -->
    <div class="search-model">
        <div class="h-100 d-flex align-items-center justify-content-center">
            <div class="search-close-switch">+</div>
            <form class="search-model-form">
                <input type="text" id="search-input" placeholder="Search here.....">
            </form>
        </div>
    </div>
    <!-- Search End -->
    <script>
    
    
    
    function increment(elem){
    	let input=document.getElementById("cartid"+elem.id);
    	input.value =+ input.value + 1;
    	input.form.submit();
    }
    function decrement(elem){
    	let input=document.getElementById("cartid"+elem.id);
    	input.value > 1 ? input.value =+ input.value - 1:"";
    	input.form.submit();
    }
  

    </script>


</body>

</html>