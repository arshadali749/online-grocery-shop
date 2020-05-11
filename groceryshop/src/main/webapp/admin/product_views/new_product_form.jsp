

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
		<form action="/admin/product/insert">
			<div class="row">

				<div class="col sol-sm-6">
					<label class="col sol-sm-1">NAME</label> <input name="prod_name"
						type="text" class="form-control col sol-sm-2" required="required">



					<label class="col sol-sm-1">MFG DATE</label><input
						name="prod_mfg_date" type="date" class="form-control col sol-sm-2"
						required="required"> 
						
						
						
					<label class="col sol-sm-1">EXP
						DATE</label><input name="prod_exp_date"type="date" class="form-control col sol-sm-2"
						required="required">
						
						
					
					
					 <label class="col sol-sm-1">UNIT
						PRICE</label><input name="prod_unit_price"type="number" class="form-control col sol-sm-2"
						required="required"> 
						
						
						
					<label class="col sol-sm-1">WEIGHT</label><input
						name="prod_weight"type="number" class="form-control col sol-sm-2" required="required">

				</div>

				<div class="col sol-sm-6">
				
				
				
					<label class="col sol-sm-1">SELECT COMPANY</label>
					 <select
						
						name="companyid"class="form-control col sol-sm-2">
						<option>--SLECT COMPANY--</option>
						<c:forEach items="${companies}" var="company">
							<option value="${company.id }">${ company.name}</option>
						</c:forEach>
					</select> 
					
					
					
					<label class="col sol-sm-1">SELECT CATEGORY</label> 
					<select
						 name="categoryid"class="form-control col sol-sm-2">
						<option>--SLECT CATEGORY--</option>
						<c:forEach items="${categories}" var="category">
							<option value="${category.id }">${ category.name}</option>
						</c:forEach>
					</select>
					
					
					
					 <label class="col sol-sm-1">SELCT SUB CATEGORY</label> <select
						name="subcategoryid"class="form-control col sol-sm-2">
						<option>--SLECT SUB CATEGORY--</option>
						<c:forEach items="${subcategories}" var="subcategory">
							<option value="${subcategory.id }">${ subcategory.name}</option>
						</c:forEach>
					</select> 
					
					
					
					<label class="col sol-sm-1">WEIGHT UNIT</label> <select
						name="prod_weight_unit"class="form-control col sol-sm-2">
						<option>--SLECT COMPANY</option>
						<option value="K.G">KILO GRAM</option>
						<option value="G">GRAM</option>
						<option value="lTR">LTR</option>
						<option value="ML">ML</option>
					</select>



					<label class="col sol-sm-1">QUANTITY</label><input
						name="prod_qty" type="number" class="form-control col sol-sm-2"
						required="required"> 

				</div>
				

			</div>
			<div> <label class="col sol-sm-1">BROWSE PICTURE</label><input
						name="prod_pic" type="file" class="form-control col sol-sm-2"
						required="required"> 
			</div>
           <div ><input type="submit" class="btn btn-danger col-sm-12 mt-2"></div>
		</form>
	</div>
</div>