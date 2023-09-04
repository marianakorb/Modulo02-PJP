<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contador</title>
</head>
<body>

<%!
// Declaração de método e variável de classe

	private String saudacao(String nome) {
	return "Olá " + nome + "!";
}

	private int contador =0;
%>

<p> <%=saudacao("Mariana") %> </p>

<%contador++; %>
<p>Está página foi visitada <%=contador %> vezes.</p>

</body>
</html>