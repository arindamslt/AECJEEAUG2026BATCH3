<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="NavClient.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ORDER FOOD</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
	<h2 class="text-primary" style="text-align: center;">ORDER FOOD FORM</h2>
	<form action="OrderServe" method="post" >
		<input type="text" name="fid" class="form-control" placeholder="ENTER THE FOOD ID "/>
		<input type="text" name="qty" class="form-control" placeholder="ENTER THE QUANTITY "/>
		<input type="text" name="uname" class="form-control" placeholder="ENTER YOUR USERNAME "/>
	 	<input type="submit" class="btn btn-outline-primary" value="ORDER"/>
	</form>
</div>
</body>
</html>