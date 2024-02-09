<%@page import="model.Product"%>
<%@page import="dao.ProductDao"%>
<%@page import="java.util.List"%>
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
	<!-- Shopping Cart Section Begin -->
	<section class="shopping-cart spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="shopping__cart__table">
						<table>
							<thead>
								<tr>
									<th>Product</th>
									<th>Name</th>
									<th>Category</th>
									<th>Description</th>
									<th>Price</th>
									<th>Edit</th>
									<th>Delete</th>
								</tr>
							</thead>
							<tbody>
								<%List<Product> list=ProductDao.getProductListBySid(u.getId()); %>
								<%for(Product p:list){ %>
								<tr>

									<td class="">
										<div class="product__cart__item__pic">
											<img src="image/<%=p.getImage() %>" style="width:100px" alt="">
										</div>
									</td>
									<td class=""><h4><%=p.getPname() %></h4></td>
									<td class=""><%=p.getPcategory() %></td>
									<td class=""><%=p.getPdesc() %></td>
									<td class="cart__price">Rs.<%=p.getPprice() %></td>
									<td class=""><a href="seller-edit-product.jsp?id=<%=p.getPid() %>" class="btn btn-success">Edit</a></td>
									<td class=""><a href="seller-delete-product.jsp?id=<%=p.getPid() %>" class="btn btn-danger"><i class="fa fa-close"></a></i></td>

								</tr>
								<%} %>

							</tbody>
						</table>
					</div>

				</div>

			</div>
		</div>
	</section>
	<!-- Shopping Cart Section End -->

</body>
</html>