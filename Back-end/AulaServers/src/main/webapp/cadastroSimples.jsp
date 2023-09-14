<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Simples</title>
</head>
<body>


<form action="CadastroUsuarioServlet" method="post">
	<label for=nome>Digite seu nome: </label>
	<input type="text" id="nome" name="nome">
	
	<label for=nota>Digite sua nota: </label>
	<input type="text" id="nota" name="nota">
	
	<button type="submit">Enviar</button>
</form>

</body>
</html>