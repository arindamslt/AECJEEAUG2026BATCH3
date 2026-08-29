<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div>
<h2 class="text-dark">LIST OF ORDER DETAILS</h2>
<%
String orderid=request.getParameter("orderid");
String pid=request.getParameter("pid");
String pname=request.getParameter("pname");
double pqty=Double.parseDouble(request.getParameter("pqty"));
double price=Double.parseDouble(request.getParameter("price"));
%>
ORDER ID:<h3 class="text-primary"><%=orderid %></h3>
PRODUCT ID:<h3 class="text-secondary"><%=pid %></h3>
PRODUCT NAME:<h3 class="text-success"><%=pname %></h3>
QUANTITY PURCHASE:<h3 class="text-warning"><%=pqty %></h3>
PRODUCT PRICE:<h3 class="text-danger"><%=price %></h3>
TOTAL PRICE:<h3 class="text-dark"><%=price*pqty %></h3>
</div>
</body>
</html>