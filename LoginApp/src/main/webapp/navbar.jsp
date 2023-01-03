<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-success">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    
    <li class="nav-item active">
        <a class="nav-link" href="#"> <%= session.getAttribute("username") %><span class="sr-only">(current)</span></a>
      </li>
      
       </li>
      <li class="nav-item active">
        <a class="nav-link" href="logout_servlet"> Logout<span class="sr-only">(current)</span></a>
      </li>
      
      
    </ul>  
      
      
      
   
    
     
    
  </div>
</nav>



</body>
</html>