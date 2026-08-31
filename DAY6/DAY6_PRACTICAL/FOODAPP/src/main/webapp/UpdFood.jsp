<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Nav.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE FOOD</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
	<h2 class="text-success" style="text-align: center;">UPDATE FOOD FORM</h2>
	<form action="" method="post" >
		<input type="text" name="fid" class="form-control" placeholder="ENTER THE FOOD ID "/>
		<input type="text" name="fname" class="form-control" placeholder="ENTER THE FOOD NAME "/>
		<input type="text" name="price" class="form-control" placeholder="ENTER THE PRICE "/>
	 	<input type="submit" class="btn btn-outline-primary" value="UPDATE"/>
	</form>
</div>
</body>
</html>