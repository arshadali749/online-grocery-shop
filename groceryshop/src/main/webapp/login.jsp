<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>




<style>
label {
	color: white;
}

.loginformdiv {
	background-color: #660000;
	margin-left: 35%;
	padding: 50px;
	border-radius: 30px;
	margin-top: 20px;
}

.loginwindowtitle {
	font-size: 25px;
	font-family: sans-serif;
	font-weight: bold;
	color: white;
}

body {
	background-image: url("/images/background.jfif");
	background-size: cover;
	padding-left: 10px;
	padding-right: 10px;
}
</style>

<body>
	<div class="text-center">
		<div class="col col-sm-4 loginformdiv">
			<span class="loginwindowtitle">LOGIN WINDOW</span>
			<form action="/user/login">

				<div class="form-group row">

					<label for="name">CNIC</label> <input class="form-control"
						type="text" name="cnic">

				</div>


				<div class="form-group row ">
					<label for="description">Password</label> <input
						class="form-control" type="text" name="password">
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
							<input class="btn btn-success" type="submit" value="LOGIN">
						</div>
						<div>
							<a href="/user/sign_up">NOT REGISTERED ??REGISTER NOW</a>
						</div>
					</div>
				</div>

			</form>
		</div>

	</div>
</body>