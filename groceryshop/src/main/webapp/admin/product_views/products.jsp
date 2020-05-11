<style>
#categoriesmaincontainerdiv {
	border: solid black 5px;
}

#productstablediv {
	height: 500px;
	overflow: scroll;
}
</style>


<div id="categoriesmaincontainerdiv">
	<div class="text-center ">
		<a class="btn btn-success col-sm-12" href="/admin/new/product/form">CLICK TO ADD NEW PRODUCT</a>
		<h1>PRODUCTS LIST</h1>
	</div>
	<div id="productstablediv">

		<table class="table table-sm table-dark table-bordered ">

			<thead>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>PRICE</th>
					<th>QUANTIY</th>

					<th>CATEGORY</th>
					<th>SUB CATEGORY</th>
					<th>COMPANY</th>
					<th>MFG</th>
					<th>EXP</th>
					<th>WEIGHT</th>
					<th>UNIT</th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>
			</thead>
			<c:forEach items="${products}" var="product">

				<tr>
					<td>${product.prod_id}</td>
					<td>${product.prod_name}</td>
					<td>${product.prod_unit_price}</td>
					<td>${product.prod_qty}</td>
					<td>${product.prod_category.name}</td>
					<td>${product.prod_subcategory.name}</td>
					<td>${product.prod_company.name}</td>
					<td>${product.prod_mfg_date}</td>
					<td>${product.prod_exp_date}</td>
					<td>${product.prod_weight}</td>
					<td>${product.prod_weight_unit}</td>
					<td><a href="/admin/product/edit/${product.prod_id}"
						class="btn btn-success btn-sm ">EDIT</a></td>
					<td><a href="/admin/product/delete/${product.prod_id}"
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