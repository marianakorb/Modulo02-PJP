<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String nome = (String) session.getAttribute("nome"); %>

<h2> O nome capturado na sess�o � <%=nome %> </h2>



</body>
</html>