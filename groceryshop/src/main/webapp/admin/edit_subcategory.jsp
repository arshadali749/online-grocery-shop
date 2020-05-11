


<div>
	<form action="/admin/update_subcategory">

		<div class="form-group row ">
			<label for="id">ID</label> <input class="form-control" type="number"
				name="id"
				value="${subcat.id}">
		</div>




		<div class="form-group row ">
			<label for="name">Name</label> <input class="form-control"
				type="text" placeholder="enter the name of the category here"
				name="name" value="${subcat.name}">
		</div>



		<div class="form-group row ">
			<label for="description">DESCRIPTION</label> <input
				class="form-control" type="text"
				placeholder="enter the Description  of the category here"
				name="description" value="${subcat.description}">
		</div>
		<div class="form-group row ">
			<select name="categoryid" class="form-control">
				<option>--Select Category--</option>

				<c:forEach items="${categories}" var="cat">

					<option value="${cat.id}" selected="selected">${cat.name}</option>
				</c:forEach>


			</select>
		</div>
		<div class="form-group row ">
			<input class="btn btn-success" type="submit">
		</div>

	</form>
</div>