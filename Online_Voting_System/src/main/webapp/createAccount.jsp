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

<div class="container" style="width:25%; border:2px solid black; padding:20px; height: 100%; background: cyan; ">
<div class="row">

<div>

<form action="registration" method="post">

<div >
<h2>Registration Form</h2>

<div class="form-group">
<label>First Name</label>
<input type="text"
 name="userfirstname" 
 placeholder="Enter your First Name"
 class="form-control"
 required="required">

</div>

<div class="form-group">
<label>Last Name</label>
<input type="text" 
 name="userlastname"
 placeholder="Enter your Last Name"
 class="form-control"
 required="required">

</div>

<div class="form-group">
<label>Phone</label>
<input type="number" 
 name="phone"
 placeholder="Enter your phone number"
 class="form-control"
 required="required">

</div>


<div class="form-group">
<label>Voter Card Number</label>
<input type="text"
 name="votercardnumber"
 placeholder="Enter your card number"
 class="form-control"
 required="required">

</div>

<div class="form-group">
<label>Date Of Birth</label>
<input type="date"
 name="dateofbirth"
 placeholder="Enter your Date Of Birth "
 class="form-control"
 required="required">
</div>


<div class="form-group">
<label>Address</label>
<input type="text"
 name="address"
 placeholder="Enter your Address"
 class="form-control"
 required="required">
</div>

<div class="form-group" style="text-align: center">
<button type="submit" class="btn btn-success">Register</button>

</div>



</div>
</form>


</div>

</div>


</div>


</body>
</html>