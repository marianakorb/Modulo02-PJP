<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
ul li {
	list-style-type: none;
}
</style>
<body>
<h1>Tabuada</h1>
	<form action="TabuadaServlet" method="post">

	<label for="num1">Número 1: </label>
	<input type="number" id="num1" name="num1" min="1" max="10"><br><br>
	
	<label for="num2">Número 2: </label>
	<input type="number" id="num2" name="num2" min="1" max="10"><br><br>
	<button type="submit">Gerar tabuada</button>
	</form>
	
	<%List<String> tabuada = (List<String>) request.getAttribute("tabuada"); %>
	
	<%if(tabuada != null) { %>
	<ul>
		<%for(int i = 0; i < tabuada.size(); i++) {%>
			<li><%=tabuada.get(i) %> </li>
		<%} %>
		</ul>
		
	<%} %>
</body>
</html>