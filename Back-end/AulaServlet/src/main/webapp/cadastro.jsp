<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="PessoaServlet" method="post">
	<label>Nome: </label>
	<input type="text" name="nome" required> <br><br>
	<label>Email: </label>
	<input type="text" name="email" required> <br><br>
	<input type="submit" value="Cadastrar">
</form>

</body>
</html>