<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
#categoriesmaincontainerdiv {
	border: solid black 5px;
}

.productimage {
	width: 100px;
	height: 30px;
}

#productstablediv {
	height: 500px;
	overflow: scroll;
}

h1 {
	margin-bottom: 0px;
	border-bottom: solid black 2px;
}
</style>


<div id="categoriesmaincontainerdiv">
	<div class="text-center ">

		<h1>YOUR SHOPPING LIST</h1>

		<div class=" container-fluid row">

			<a class="btn btn-success col-sm" href="/shop/">CLICK TO BUY MORE
				PRODUCTS</a> <a class="btn btn-danger col col-sm" href="#">CHECK OUT</a>

			<a href="/user/logout" class="btn btn-primary"><b>LOG OUT</b></a>

		</div>
	</div>
	<div id="productstablediv">

		<table class="table table-sm table-dark table-bordered">
			<thead>
				<tr>
					<th>PICTURE</th>
					<th>ID</th>
					<th>NAME</th>
					<th>PRICE</th>
					<th>QUANTIY</th>
					<th>SUB TOTAL</th>
					<th>SUB TOTAL</th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>
			</thead>
			<c:forEach items="${cartitems}" var="item">

				<tr>
					<td><img class="productimage" alt="image here"
						src="/images/background.jfif"></td>

					<td>${item.item_id}</td>
					<td>${item.product.prod_name}</td>
					<td>${item.product.prod_unit_price}</td>
					<td>${item.item_quantity}</td>
					<td>${item.subtotal}</td>
					<td>${item.total}</td>


					<td><a href="/admin/product/edit/${item.item_id}"
						class="btn btn-success btn-sm ">EDIT</a></td>
					<td><a href="/admin/product/delete/${item.item_id}"
						class="btn btn-danger btn-sm ">DELETE</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</div>


<!-- new category model starts here  -->
<div class="modal fade" id="addnewcategory" data-backdrop="static"
	tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel"
	aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header  theme text-center">
				<h2 class="modal-title ">ADD NEW CATEGORY MODAL</h2>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>


			<div class="modal-body">
				<form action="/admin/add_category">

					<div class="form-group  col-sm-12 row ">
						<label for="name">COMPANY</label> <input
							class="form-control col-sm-6" type="text"
							placeholder="enter the name of the category here"
							name="prod_name"> <label for="name">NAME</label> <input
							class="form-control" type="text"
							placeholder="enter the name of the category here"
							name="prod_name">
					</div>


					<div class="form-group row ">
						<label for="description">DESCRIPTION</label> <input
							class="form-control" type="text"
							placeholder="enter the Description  of the category here"
							name="description">
					</div>
					<div class="form-group row ">
						<input class="btn btn-success" type="submit">
					</div>

				</form>


			</div>

		</div>
	</div>
</div>

<!-- new category model endds here   -->