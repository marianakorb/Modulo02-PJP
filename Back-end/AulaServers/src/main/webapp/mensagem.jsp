<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Olá</title>
</head>
<body>

<h2>Olá mundo com JSP</h2>

<%
String mensagem = "Olá mundo, tudo bem com vocês?";
out.println(mensagem);
%>
<br>
<h2> <%=mensagem%> </h2>


</body>
</html>