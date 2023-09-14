<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String mensagem = (String) request.getParameter("mensagem"); 
String mensagem2 = (String) request.getParameter("mensagem2");
String mensagem3 = (String) request.getParameter("mensagem3");%>

<% if (mensagem3 == null) {
	response.sendRedirect("pagina1.jsp?error=1");%>
<%} else { %>
<h1>Página 2</h1>

<p> Mensagem da página 1:<%=mensagem %> </p>
<p> Mensagem da página 1:<%=mensagem2%> </p>
<p> Mensagem da página 1:<%=mensagem3%> </p>

<%} %>
</body>
</html>