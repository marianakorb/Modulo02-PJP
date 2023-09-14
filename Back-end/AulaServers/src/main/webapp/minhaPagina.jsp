<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List, java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Lista de itens</h2>

<% List<String> minhaLista = (List<String>) request.getAttribute("listaitens");%>

<ul>
<% for (String item : minhaLista) { %>
	<li><%=item %> </li>
	<%} %>
</ul>
</body>
</html>