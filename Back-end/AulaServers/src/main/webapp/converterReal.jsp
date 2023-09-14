<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Real Para Dolar</title>
</head>
<body>

<form action="RealParaDolarServlet" method="post"> 

	<label for="valorDolar">Digite o valor em dolar</label>
	<input type="number" id="valorDolar" step="0.1" name="valorDolar" required>
	<button type="submit">Converter</button>
</form>
<p> 
	<%
	Double real = (Double) request.getAttribute("real");%>
	
	<%if(real != null) {
	%>
	Valor em Real: R$<%=real%>
	</p>
	<%} %>
</body>
</html>