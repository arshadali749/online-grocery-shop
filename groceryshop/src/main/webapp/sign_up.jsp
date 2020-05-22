<style>
label {
	color: white;
}

.loginformdiv {
	background-color: #660000;
	margin-left: 30%;
	padding: 50px;
	border-radius: 30px;
}

.loginwindowtitle {
	font-size: 25px;
	font-family: sans-serif;
	font-weight: bold;
	color: white;
}
</style>


<div class="text-center">
	<div class="col col-sm-4 loginformdiv">
		<span class="loginwindowtitle">LOGIN WINDOW</span>
		<form action="/user/insert">

			<div class="form-group row">

				<label for="cnic">CNIC</label> <input class="form-control"
					type="number" name="cnic">

			</div>


			<div class="form-group row ">
				<label for="password">Password</label> <input class="form-control"
					type="text" name="password">
			</div>

			<div class="form-group row ">
				<label>Type</label> <select name="type" class="form-control">
					<option>--SELECT TYPE--</option>
					<option value="admin">ADMIN</option>
					<option value="user">USER</option>

				</select>
			</div>
			<div class="form-group row">
				<div class="container text-center">
					<div>
						<input class="btn btn-success" type="submit" value="SIGN UP">
					</div>

				</div>
			</div>

		</form>
	</div>

</div>

