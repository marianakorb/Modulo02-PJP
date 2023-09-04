<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String mensagem = (String) request.getAttribute("mensagem"); 
	List<String> nomes = (List<String>) request.getAttribute("ListaNomes");
%>

<h1>Nomes da lista: <%=nomes%></h1>
<h2>Mensagem enviada: </h2>
<p><%=mensagem%></p>
</body>
</html>