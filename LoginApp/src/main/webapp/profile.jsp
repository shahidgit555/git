


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%@ include file="All_js_css.jsp" %>

<body>

<div class="container-fluid">

		<%@include file="navbar.jsp"%>
	</div>
<% 
 if(session.getAttribute("username")==null)
 {
	 response.sendRedirect("login.jsp");
 }
%>
<br><br>

<h2 style="text-align:center">this is profile page <%= session.getAttribute("username")%></h2>
<br>
<h1 style="text-align:center " > THANK YOU </h1>

</body>
</html>