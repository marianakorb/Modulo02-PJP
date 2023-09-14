<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
</head>
<body>

<%String nome = (String) request.getAttribute("nome"); 
	String email = (String) request.getAttribute("email");
	
%>

<h2>Nome: <%=nome %> </h2>
<br>
<h2>Email: <%=email %></h2>

<%-- <% String mensagem = (String) request.getAttribute("mensagem"); 
	List<String> nomes = (List<String>) request.getAttribute("ListaNomes");
%>

<h1>Nomes da lista: <%=nomes%></h1>
<h2>Mensagem enviada: </h2>
<p><%=mensagem%></p> --%>

</body>
</html>