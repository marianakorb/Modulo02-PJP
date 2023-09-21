<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List, java.util.ArrayList, model.Funcionario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%List<String> funcionarios = (List<String>) request.getAttribute("funcionarios");%>

<%-- <table border=1>
	<tr> 
		<th>Nome</tr>
		<th>Setor</tr>
		<th>Função</tr>
	</tr>
 	<% for (Funcionario funcionario : funcionarios) { %>
	<tr> 
		<th><%=funcionario.getNome() %></tr>
		<th><%=funcionario.getSetor() %></tr>
		<th><%=funcionario.getFuncao() %></tr>
	</tr>
	<%} %> --%>
</table>
</body>
</html>