<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
.card {
	display: inline-block;
	margin-top: 5px;
}

label {
	color: green;
}

.product_image {
	height: 25%;
	width: 100%;
}

.box {
height:700px;
	overflow: scroll;
}
nav
{
width: 100%;
height: 50px;
background-color: black;

}
body{
height: 100%;
background-color: gray;
}
</style>

<div>
<nav></nav>
	<div class="box">
		<c:forEach items="${products}" var="product">

			<div class="card col-sm-2">

				<div class="text-center">
					<div class="col-sm">
						<span>${product.prod_name}</span>

					</div>


					<img class="card-img-top product_image"
						src="/images/background.jfif" alt="Card image">
					<div class="card-body">
						<a href="/shop/product/description/${product.prod_id}" class="btn btn-success col-sm">BUY NOW</a>
					</div>
				</div>
			</div>

		</c:forEach>
	</div>
</div>
