
<style>
#categoriesmaincontainerdiv {
	border: solid black 5px;
}

img {
	width: 30%;
	height: 20%;
}

#productstablediv {
	height: 500px;
	overflow: scroll;
}

#addproductbtn {
	background-color: maroon;
	color: white;
	font-size: 20px;
	font-weight: bold;
	border-bottom: solid black 2px;
}

h1 {
	margin-bottom: 0px;
	border-bottom: solid black 2px;
}
</style>

<a href="/shop/" class="btn btn-success">TABLE VIEW</a>
<a href="/shop/view/pictorial" class="btn btn-success">PICTORIAL
	VIEW</a>
<div id="categoriesmaincontainerdiv">
	<div class="text-center ">

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
						<th>BUY NOW</th>

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
						<td colspan="2"><a
							href="/shop/product/description/${product.prod_id}"
							class="btn btn-success btn-sm ">BUY NOW</a></td>

					</tr>
				</c:forEach>

			</table>
		</div>
	</div>