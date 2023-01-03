<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>

     
   <%@ include file="All_js_css.jsp"  %>
</head>
<body>

<div class="container" style="width:20%;border:2px solid black; margin: 0 auto;  padding:20px; fon-size:20px; background-color: pink;" >
<div class="row">
<div>
<form action="login_servlet" method="post" >

<div class="form-group" style="text-align:center;">
<h2>Sign in</h2>
</div>

<div class="form-group">
<label>User Name</label>
<input type="text"
 name="username"
 placeholder="Enter Your Name"
 class="form-control"
 required="required">
</div>


<div class="form-group">
<label>Password</label>
<input type="password"
 name="userpassword"
 class="form-control"
 placeholder="Enter your Password"
 required="required">
</div>

<div class="form-group text-center">
<button type="submit" class="btn btn-success ">Login</button>

</div>
</form>


<div class="form-group text-center">

<h6><a href="Registration.jsp">Create an Account?</a></h6>

</div>


</div>

</div>

</div>

</div>


</div>

</body>
</html>