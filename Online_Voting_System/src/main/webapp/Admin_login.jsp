<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin login</title>

<%@ include file="profilenavbar.jsp" %>

</head>
<body>
<br>
<br>

<%@ include file="All_js_css.jsp" %>

<div class="container" style="width:18%; padding: 20px ; border: 2px solid black; margin:auto;">
<div class="row">

<div>
<form action="result.jsp" method="post">

<div class="form-group">

<h2>Admin Login</h2>
</div>

<div class="form-group">
<label>Admin Name</label>
<input type="text" name="adminname" placeholder="Admin user Name" class="form-control" required="required">

</div>

<div class="form-group">
<label>Admin password</label>
<input type="password" name="adminpassword" placeholder="admin password" class="form-control" required="required">

</div>

<div class="form-group" style="text-align: center">
<button type="submit" class="btn btn-dark">Login</button>

</div>


</form>



</div>

</div>

</div>

</body>
</html>