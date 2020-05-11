<style>
#categoriesmaincontainerdiv {
	border: solid black 5px;
}

#categoriestablediv {
	height: 500px;
	overflow: scroll;
	
}

</style>


<div id="categoriesmaincontainerdiv">
	<div class="text-center ">
		<button type="button" class="btn btn-danger btn-sm col-sm-12"
			data-toggle="modal" data-target="#addnewcategory">CLICK TO
			ADD NEW CATEGORY</button>
		<h1>CATEGORIES LIST</h1>
	</div>
	<div id="categoriestablediv">

		<table class="table table-sm table-dark table-bordered ">

			<thead>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>DESCRIPTION</th>
					<th>EDIT</th>
					<th>DLETE</th>
				</tr>
			</thead>
			<c:forEach items="${categories}" var="cat">

				<tr>
					<td>${cat.id}</td>
					<td>${cat.name}</td>
					<td>${cat.description}</td>
					<td><a href="edit_category/${cat.id}"
						class="btn btn-success btn-sm ">EDIT</a></td>
					<td><a href="delete_category/${cat.id}"
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
					<div class="form-group row ">
						<input class="btn btn-success" type="submit">
					</div>

				</form>


			</div>

		</div>
	</div>
</div>

<!-- new category model endds here   -->