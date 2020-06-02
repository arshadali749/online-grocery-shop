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
	border: solid black 5px;
}

h1 {
	margin-bottom: 0px;
	border-bottom: solid black 2px;
}

nav {
	background-color: gray;
	height: 50px;
}

span {
	background-color: white;
	color: red;
}
#heading{
background-color: gray;
color: white;
border: solid black 5px;
}
</style>

<div id="categoriesmaincontainerdiv">

	<div id="heading" class="text-center">
	<h1>YOUR ORDERS</h1>
	</div>

	<div id="productstablediv">
	

		<table class="table table-sm table-dark table-bordered">
			<thead>
				<tr>
					<th>ORDER ID</th>
					<th>USER CNIC</th>
					<th>ORDER STATUS</th>
					<th>DETAILS</th>
					<th>CANCEL</th>
				</tr>
			</thead>
			<c:forEach items="${orders}" var="order">

				<tr>
					<td>${order.id}</td>
					<td>${order.user.cnic}</td>
					<td>${order.status}</td>


					<td><a href="/order/detail/${order.id}"
						class="btn btn-success btn-sm ">DETAILS</a></td>
					<td><a href="/order/cancel/${order.id}"
						class="btn btn-danger btn-sm ">CANCEL</a></td>
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