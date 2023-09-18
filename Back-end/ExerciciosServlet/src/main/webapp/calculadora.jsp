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

	<label for="num1">N�mero 1: </label>
	<input type="text" id="num1" name="num1"><br><br>
	
	<label for="num2">N�mero 2: </label>
	<input type="text" id="num2" name="num2"><br><br>
	
	<label for="operacao">Opera��o: </label>
	<select id="operacao" name="operacao">
		<option value="soma">Soma</option>
		<option value="subtracao">Subtra��o</option>
		<option value="multiplicacao">Multiplica��o</option>
		<option value="divisao">Divis�o</option>
	</select><br>
	<br>
	<button type="submit">Calcular</button>
</form>
<%Double resultado = (Double) request.getAttribute("resultado");
Double num1 = (Double) request.getAttribute("num1");
Double num2 = (Double) request.getAttribute("num2");
String operacao = (String) request.getAttribute("operacao");
%>
	<%if(resultado != null) { %>
	<p>A <%=operacao %> de <%=num1 %> e <%=num2 %> �:</p>
	<h3><%=resultado %></h3>
	<%} %>
</body>
</html>