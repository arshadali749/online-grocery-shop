<div class="text-left">

	<button type="button" class="btn btn-danger btn-sm col-sm-4"
		data-toggle="modal" data-target="#addsubcategory">CLICK TO
		ADD SUB CATEGORY</button>


</div>
<div id="categoriestablediv">
	<div>
		<h1>SUB CATEGORIES LIST</h1>
	</div>
	<div>

		<table class="table table-sm table-dark table-bordered ">

			<thead>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>DESCRIPTION</th>
					<th>CATEGORY</th>
					<th>EDIT</th>
					<th>DLETE</th>
				</tr>
			</thead>
			<c:forEach items="${subcategories}" var="subcat">

				<tr>
					<td>${subcat.id}</td>
					<td>${subcat.name}</td>
					<td>${subcat.description}</td>
					<td>${subcat.category.name}</td>
					<td><a href="edit_subcategory/${subcat.id}"
						class="btn btn-success btn-sm ">EDIT</a></td>
					<td><a href="delete_subcategory/${subcat.id}"
						class="btn btn-danger btn-sm ">DELETE</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</div>




<!-- add new sub category model starts here  -->
<div class="modal fade" id="addsubcategory" data-backdrop="static"
	tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel"
	aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header  theme text-center">
				<h2 class="modal-title ">ADD NEW SUBCATEGORY MODAL</h2>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>


			<div class="modal-body">
				<form action="/admin/add_subcategory">

					<div class="form-group row ">
						<label for="name">Name</label> <input class="form-control"
							type="text" placeholder="enter the name of the category here"
							name="name">
					</div>


					<div class="form-group row ">
						<label for="description">DESCRIPTION</label> <input
							class="form-control" type="text"
							placeholder="enter the Description  of the category here"
							name="description">
					</div>
					<select name="categoryid"class="form-control">
						<option>--Select Category--</option>

						<c:forEach items="${categories}" var="cat">

							<option value="${cat.id}">${cat.name}</option>
						</c:forEach>


					</select>

					<div class="form-group row ">
						<input class="btn btn-success" type="submit">
					</div>

				</form>


			</div>

		</div>
	</div>
</div>

<!-- add new sub category model ends here   -->