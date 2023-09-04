<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabuada</title>
</head>
<body>

<h2>Tabuada</h2>
<%
int numero = 3; %>
<h3>Tabuada do <%=numero%></h3>
<ul>
<% for(int i = 1; i <=10; i++) {
		int resultado = numero * i;%>
		<li> <%=numero %>  X  <%=i %> = <%=resultado %> </li>
	<%} %>
</ul>
</body>
</html>