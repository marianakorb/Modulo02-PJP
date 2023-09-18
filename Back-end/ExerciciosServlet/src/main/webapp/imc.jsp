<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Calcule seu IMC</h1>
	<form action="CalculaIMCServlet" method="post">
	<label for=peso>Digite seu peso: </label>
	<input type="text" id="peso" name="peso">
	
	<label for=altura>Digite sua altura: </label>
	<input type="text" id="altura" name="altura">
	
	<button type="submit">Calcular</button>
	
	<%Double imc = (Double) request.getAttribute("imc"); 
	String resultado = (String) request.getAttribute("resultado");%>
	
	<br><br>
	<%if(imc != null && resultado != null) { %>
	
	<p>Seu imc é <%=imc %></p>
	<p>Você está <%=resultado %></p>
	<%} %>
</form>
</body>
</html>