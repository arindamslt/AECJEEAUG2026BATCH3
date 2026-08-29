<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DEMO JSP PAGE</title>
</head>
<body>
<%!
public int add(int a,int b)
{
	return(a+b);
}
%>
<h2>JSP TESTING</h2>
<%
int x=10;
int y=15;
%>
RESULT:<%=x+y %>
<br/>
<h3>OUTPUT:<% out.println(x+y); %></h3>

<%= add(20,40) %>
</body>
</html>