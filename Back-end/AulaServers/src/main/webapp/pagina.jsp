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

<h3>Dados do Funcionário</h3>
<form action="ListaFuncionarios">
	<label for="nome">Nome: </label>
	<input  type="text" id="nome" name="nome"><br>
	<label for=idade>Idade: </label>
	<input type="text" id="idade" name="idade"><br>
	<label for="funcao">Função: </label>
	<input  type="text" id="funcao" name="funcao">
	
	<% List<String> funcionarios = new ArrayList<>();%>
</form>
</body>
</html>