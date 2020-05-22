


<div class="container col-sm-6">
	<form action="/admin/update_category">

		<div class="form-group row ">
			<input class="form-control" type="hidden"
				placeholder="enter the id of the category here" name="id"
				value="${category.id}">
		</div>
-



		<div class="form-group row ">
			<label for="name">Name</label> <input class="form-control"
				type="text" placeholder="enter the name of the category here"
				name="name" value="${category.name}">
		</div>



		<div class="form-group row ">
			<label for="description">DESCRIPTION</label> <input
				class="form-control" type="text"
				placeholder="enter the Description  of the category here"
				name="description" value="${category.description}">
		</div>

		<div class="form-group row ">
			<input class="btn btn-success" type="submit">
		</div>

	</form>
</div>