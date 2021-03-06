
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.container {
	background-color: black;
	padding: 20px;
	border-radius: 20px;
}

label {
	color: white;
}
</style>

<div>
	<div class="container">
		<form action="/admin/product/update">
			<div>
				<label class="col sol-sm-1">ID</label> <input name="prod_id"
					value="${product.prod_id}" type="number"
					class="form-control col sol-sm-2" required="required">
			</div>
			<div class="row">

				<div class="col sol-sm-6">
					<label class="col sol-sm-1">NAME</label> <input name="prod_name"
						value="${product.prod_name}" type="text"
						class="form-control col sol-sm-2" required="required"> <label
						class="col sol-sm-1">MFG DATE</label><input
						value="${product.prod_mfg_date}" name="prod_mfg_date" type="date"
						class="form-control col sol-sm-2" required="required"> <label
						class="col sol-sm-1">EXP DATE</label><input
						value="${product.prod_exp_date}" name="prod_exp_date" type="date"
						class="form-control col sol-sm-2" required="required"> <label
						class="col sol-sm-1">UNIT PRICE</label><input
						value="${product.prod_unit_price}" name="prod_unit_price"
						type="number" class="form-control col sol-sm-2"
						required="required"> <label class="col sol-sm-1">WEIGHT</label><input
						value="${product.prod_weight}" name="prod_weight" type="number"
						class="form-control col sol-sm-2" required="required">

				</div>

				<div class="col sol-sm-6">



					<label class="col sol-sm-1">SELECT COMPANY</label> <select
						name="companyid" class="form-control col sol-sm-2">
						<option>--SLECT COMPANY--</option>
						<c:forEach items="${companies}" var="com">
							<c:choose>
								<c:when test="${product.prod_company.name==com.name}">
									<option value="${com.id }" selected="selected">${com.name}</option>
								</c:when>
								<c:otherwise>
									<option value="${com.id }">${ company.name}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</select> <label class="col sol-sm-1">SELECT CATEGORY</label> <select
						name="categoryid" class="form-control col sol-sm-2">
						<option>--SLECT CATEGORY--</option>
						<c:forEach items="${categories}" var="category">
							<c:choose>
								<c:when test="${product.prod_category.name==category.name}">
									<option value="${category.id }" selected="selected">${ category.name}</option>
								</c:when>
								<c:otherwise>
									<option value="${category.id }">${ category.name}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</select> <label class="col sol-sm-1">SELCT SUB CATEGORY</label> <select
						name="subcategoryid" class="form-control col sol-sm-2">
						<option>--SLECT SUB CATEGORY--</option>

						<c:forEach items="${subcategories}" var="subcategory">
							<c:choose>
								<c:when
									test="${product.prod_subcategory.name==subcategory.name }">
									<option value="${subcategory.id }" selected="selected">${ subcategory.name}</option>
								</c:when>
								<c:otherwise>
									<option value="${subcategory.id }">${ subcategory.name}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</select> <label class="col sol-sm-1">WEIGHT UNIT</label> <select
						name="prod_weight_unit" class="form-control col sol-sm-2">
						<option>--SLECT COMPANY</option>
						<option value="K.G">KILO GRAM</option>
						<option value="G">GRAM</option>
						<option value="lTR">LTR</option>
						<option value="ML">ML</option>
					</select> <label class="col sol-sm-1">QUANTITY</label><input
						value="${product.prod_qty}" name="prod_qty" type="number"
						class="form-control col sol-sm-2" required="required">

				</div>


			</div>
			<div>
				<label class="col sol-sm-1">BROWSE PICTURE</label><input
					name="prod_pic" type="file" class="form-control col sol-sm-2"
					required="required">
			</div>
			<div>
				<input type="submit" class="btn btn-danger col-sm-12 mt-2">
			</div>
		</form>
	</div>
</div>