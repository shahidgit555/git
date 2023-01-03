<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html> -->
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION PAGE</title>
</head>


<%@ include file="All_js_css.jsp" %>


<body>
	<div class="container">
		<div class="row">

			<div>

				<form action="Registration_servlet" method="post"
					style="width: 140%; height: 100%; border: 2px solid black; margin: 0 auto; padding: 20px; background: yellow;">

					<div class="form-group" style="">
						<h2>Registration Form</h2>
						
					</div>

					<div class="form-group">
						<label>User Name</label> <input type="text" name="username"
							placeholder="Enter Your Name" class="form-control"
							required="required">
					</div>

					<div class="form-group">
						<label>Password</label> <input type="password" name="userpassword"
							class="form-control" placeholder="Enter your Password"
							required="required">
					</div>

					<div class="form-group">
						<label>Email</label> <input type="email" name="useremail"
							class="form-control" placeholder="Enter Your Email"
							required="required">
					</div>

					<div class="form-group">
						<label>Phone</label> <input type="number" name="userphone"
							class="form-control" placeholder="Enter Your Number"
							required="required">
					</div>

					<div class="form-group">
						<input type="checkbox" name="check-term"> <label>Agree
							for All the Details</label>
					</div>


					<div class="form-group text-center">

						<button type="submit" class="btn btn-success">Register</button>

					</div>
					
					<div class="form-group text-center">
					
					<h6><a href="login.jsp">Already have Account?</a></h6>
					
					</div>



				</form>
				

			</div>

		</div>

	</div>
	
	

</body>
</html>