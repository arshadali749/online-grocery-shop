<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
.card {
	margin-left: 200px;
	margin-top: 10px;
	border: solid 5px black;
}

label {
	color: green;
}

.product_image {
	margin-top: 5px;
	width: 100%;
	height: 250px;
	width: 100%;
}
</style>

<div class="card col-sm-8">
	<div class="row text-center">
		<div class="col-sm">
			<h1>${product.prod_name}</h1>
		</div>
	</div>
	<img class="card-img-top product_image" src="/images/background.jfif"
		alt="Card image">
	<div class="card-body">
		<div class="row">

			<div class="col-sm">
				<label>COMPANY</label> <br> <span>${orderitem.product.prod_name}</span>
			</div>
			<div class="col-sm">
				<label>PRICE</label> <br> <span>${orderitem.product.prod_unit_price}</span>
			</div>
			<div class="col-sm">
				<label>WEIGHT</label> <br> <span>${orderitem.product.prod_weight}${orderitem.product.prod_weight_unit}</span>
			</div>

		</div>
		<form action="/orderitem/update/${orderitem.order.id}">

			<div class="row form-group">
				<div class="col-sm">
					<input class="form-control" type="hidden" name="prod_id"
						value="${orderitem.id}">

				</div>
			</div>
			<div class="row form-group">
				<div class="col-sm">
					<label>QUANTITY</label> <select name="item_qty"
						class="form-control">
						<option>--select quantity--</option>
						<c:forEach var="i" begin="1" end="${product.prod_qty }">
							<option value="${i}">${i}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<input type="submit" value="UPDATE ITEM IN CART"
				class="btn btn-success col-sm">
		</form>
	</div>
</div>

