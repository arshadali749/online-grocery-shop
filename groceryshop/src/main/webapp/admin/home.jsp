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
	padding-left: 10px;
	padding-right: 10px;
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
		<%@ include file="navebar.jsp"%>
	</div>
	<div>




		<c:choose>
			<c:when test='${view=="categories"}'>
				<div>
					<%@ include file="/admin/categories.jsp"%>
				</div>

			</c:when>



			<c:when test='${view=="edit_category"}'>

				<%@ include file="/admin/edit_category.jsp"%>
			</c:when>




			<c:when test='${view=="subcategories"}'>

				<%@ include file="/admin/subcategories.jsp"%>
			</c:when>

			<c:when test='${view=="edit_subcategory"}'>

				<%@ include file="/admin/edit_subcategory.jsp"%>
			</c:when>


			<c:when test='${view=="companies"}'>

				<%@ include file="/admin/companies.jsp"%>
			</c:when>
			
			
			<c:when test='${view=="products"}'>

				<%@ include file="/admin/product_views/products.jsp"%>
			</c:when>
			
			<c:when test='${view=="new_product_form"}'>

				<%@ include file="/admin/product_views/new_product_form.jsp"%>
			</c:when>
			
			
			<c:when test='${view=="edit_product"}'>

				<%@ include file="/admin/product_views/edit_product_form.jsp"%>
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