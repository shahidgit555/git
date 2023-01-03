<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="profilenavbar.jsp" %>
</head>
<body>



<%@ include file="All_js_css.jsp" %>
<br>
<br>
<div class="container" style="width: 20%; padding:20px; border :2px solid black; margin: auto; background: yellow;">
<div class="row">

<div>

<form action="profile" method="post">

<div class="form-group">
<label>Enter your voter ID :</label>
<input type="text" name="voterid" placeholder="Enter your voter ID " class="form-control" required="required">

<br>
<table>
<tr>
<td> Select courses :</td>
<td> 
<select   name="party" >
<option value="select option">select option</option>
<option value="congress party">congress party</option>
<option value="Aap party">Aap party</option>
<option value ="cycle party">cycle party</option>
<option value="others">others</option>
</select>
</td>
</tr>
</table>


<button type="submit" style="text-align: center">Vote</button>

</div>
</form>
</div>

</div>

</div>




</body>
</html>