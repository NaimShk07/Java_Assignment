<%@page import="java.util.List"%>
<%@page import="dao.CartDao"%>
<%@page import="model.Cart"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
 <link rel="stylesheet" href="css/style.css" type="text/css">
<style type="text/css">
	.bttnStyle
	{
		background-color: lightblue;
		border-radius: 0.50rem;
		border:1px solid transperent;
	}
</style>
<script type="text/javascript">
	var xhttp=new XMLHttpRequest();
	var RazorpayOrderId;
	function CreateOrderID()
	{
		/*  alert("1");  */
		var number=document.getElementById("amount").value;
		var cid=document.getElementById("cid").value;
		xhttp.open("GET","http://localhost:8080/Project/OrderCreation?amount="+number+"&id="+cid,false);
		/* alert("2"); */
		xhttp.send();
		RazorpayOrderId=xhttp.responseText;
		  
		alert(number);  
		OpenCheckOut(number); 
		OpenCheckOut();
	}
</script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
	function OpenCheckOut()
	{
		/* alert("3");  */
		var number=document.getElementById("amount").value;
		/* alert(number); */
		var options={
				"key":"rzp_test_n2y122JmPDQv2g",
				"amount":number,
				"currency":"INR",
				"name":"Naim shaikh",	
				"description":"Test",
				"order_id":RazorpayOrderId,
				
				"callback_url":"http://localhost:8080/Project/customer-home.jsp",
				"prefill":{
					"name":"Naim shaikh",
					"email":"nayemuddinshaikh@gmail.com",
					"contact":"7485956725"
				},
				"notes":{
					"address":"Ahmedabad"
				},
				"theme":{
					"color":"#3399cc"
				}
				
				
		};
		var rzp1=new Razorpay(options);
		rzp1.on('payment.failed',function (response){
			alert(response.error.code);
	        alert(response.error.description);
	        alert(response.error.source);
	        alert(response.error.step);
	        alert(response.error.reason);
	        alert(response.error.metadata.order_id);
	        alert(response.error.metadata.payment_id);
		});
		rzp1.open();
	    /* e.preventDefault(); */
	}
</script>
</head>
<body>

<div id="order_id">
	
</div>
<%int amt = Integer.parseInt(request.getParameter("amount")); %>
<%int cusid = Integer.parseInt(request.getParameter("cusid")); %>
<%Cart c=CartDao.getSingleCartByCusId(cusid);// single cart %>
<%List<Cart> allcartItem=CartDao.getCartItemByCusid(cusid);// list of cart %>
<% for(Cart cart:allcartItem){
	out.println(cart);%><br><%
} %>
<% %>
<%int cartid = c.getCartid(); %> 
<h3>Total amount:<%=amt %></h3>
<div style="padding:20px;" > 
	<input type="hidden" id="amount" value="<%=amt%>">
	 <input type="hidden" id="cid" value="<%=cartid%>"> 
	<button id="payButton" onclick="CreateOrderID()" class="primary-btn">Pay Now</button>
</div>

</body>
</html>