<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.min.css"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">

<style>
h1 {
	background-color: green;
	color: white;
}

thead {
	background-color: maroon;
	color: white;
}

table {
	height: 100px;
}

body {
	background-image: url("../images/background.jfif");
	background-size: cover;
	padding: 5px;
	
}

ul li {
	list-style-type: none;
	margin: 0;
	padding: 0;
	display: inline;
}

.btn :hover {
	background-color: maroon;
}

tr:hover {
	background-color: maroon;
}

#navebardiv {
	margin-top: 10px;
	background-color: maroon;
}
</style>
</head>
<body>

	<div>




		<c:choose>
			<c:when test='${view=="products_list"}'>
				<div>
					<%@ include file="/userpages/shop.jsp"%>
				</div>
			</c:when>
			<c:when test='${view=="cartview"}'>
				<div>
					<%@ include file="/userpages/cartview.jsp"%>
				</div>
			</c:when>


			<c:when test='${view=="products_list_with_pics"}'>
				<div>
					<%@ include file="/userpages/cartview_with_pics.jsp"%>
				</div>
			</c:when>


			<c:when test='${view=="product_description_view"}'>
				<div>
					<%@ include file="/userpages/single_product_description.jsp"%>
				</div>
			</c:when>


			<c:when test='${view=="orders"}'>
				<div>
					<%@ include file="/userpages/orders.jsp"%>
				</div>
			</c:when>

			<c:when test='${view=="order_detail"}'>
				<div>
					<%@ include file="/userpages/order_detail.jsp"%>
				</div>
			</c:when>

			<c:when test='${view=="edit_order_item"}'>
				<div>
					<%@ include file="/userpages/edit_order_item.jsp"%>
				</div>
			</c:when>

			<c:when test='${view=="edit_cart_item"}'>
				<div>
					<%@ include file="/userpages/edit_cart_item.jsp"%>
				</div>
			</c:when>
		</c:choose>
	</div>




	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>
</html>