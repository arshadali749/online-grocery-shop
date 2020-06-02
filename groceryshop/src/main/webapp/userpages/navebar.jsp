<style>

.menuitem
{

border-radius: 20px;
height: 30px;
margin-left: 10px;
border:solid 2px  black;
}
nav
{
background-color: blue;
padding-left: 15px;
}
.menuitem span 
{
border-radius:100%;
border: solid black 2px;

}

#logoutbtn{

float: right;
}
</style>



<div id="navebardiv mt-0">
	<nav class="row">

		<img alt="profile pic " src="/images/background.jfif"
			style="width: 30px; height: 30px; border-radius: 20px;"> 
			
			
			<a
			href="/order/" class="btn btn-success col-sm-1 menuitem"> ORDERS<span class="badge">5</span></a>

 


		   <a class="btn btn-danger col-sm-1 menuitem" href="/cartitem/">YOUR CART<span
			class="badge">5</span></a>



		   <a  class="btn btn-primary col-sm-1 menuitem " href="/user/logout" id="logoutbtn">LOG OUT<span
				class="badge">5</span></a>



	</nav>
</div>