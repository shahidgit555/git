<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%@ include file="navbar.jsp" %>
<body>

<%@ include file="All_js_css.jsp" %>
<br><br><br>
<h1 style="text-align: center">ONLINE VOTING SYSTEM</h1>


<div class="container" style="width: 20%; border: 2px solid black; margin:0 auto; padding: 20px; background: cyan">
<div class=row>
<br>
<form action="profile.jsp" method="post">

<div class="form-group">
<label>Voter Id: </label>
<input type="text" 
 name="userid"
 placeholder="Enter your voter Id" 
 class="form-control" 
 required="required">
<br>

<div class="form-group" style="text-align: center"  >
<button type="submit" class="btn btn-success" >Login</button>
</div>
</div>

</form>



</div>

</div>

</body>
</html>