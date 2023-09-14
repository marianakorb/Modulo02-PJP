<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String mensagem = "Olá da página 1";
String mensagem2 = "Olá página 1 - segunda versão";
%>

<a href="pagina2.jsp?mensagem=<%=mensagem%>&mensagem2=<%=mensagem2%>">Ir para página 2</a>

<%String erro = request.getParameter("error"); %>

<% if (erro != null) { %>
	<% if (erro.equals("1")) { %>
		<p>A mensagem3 não foi enviada como parametro </p>
		<%} %>
<%} %>		
</body>
</html>