<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="LoginServlet" method="post">

<label>Nome: </label>
<input type="text" name="usuario" required> <br><br>
<label>Senha: </label>
<input type="password" name="senha" required> <br> <br>
<input type="submit" value="Acessar">
</form>

<%String erro = request.getParameter("error");  %>
	<%if(erro != null) { %>
		<% if (erro.equals("1")) { %>
			<p>Usuario ou senha inv�lida </p>
		
		<%} %>
			<%if(erro.equals("1")) { %>
			<p>Sess�o encerrada, fa�a login</p>
			
			
			<%} %>
		
	<%} %>
	
</body>
</html>