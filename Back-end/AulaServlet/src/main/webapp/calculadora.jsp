<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="CalculadoraServlet" method="post">

	<label for="num1">Número 1: </label>
	<input type="text" id="num1" name="num1"><br><br>
	
	<label for="num2">Número 2: </label>
	<input type="text" id="num2" name="num2"><br><br>
	
	<label for="operacao">Operação: </label>
	<select id="operacao" name="operacao">
		<option value="soma">Soma</option>
		<option value="subtracao">Subtração</option>
		<option value="multiplicacao">Multiplicação</option>
		<option value="divisao">Divisão</option>
	</select><br>
	
	<button type="submit">Calcular</button>
</form>
</body>
</html>