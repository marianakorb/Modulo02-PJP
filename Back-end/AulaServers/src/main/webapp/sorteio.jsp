<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sorteio</title>
</head>
<body>

<h2>Testando sorteio...</h2>

<%int umNumero;
out.println("Vou sortear um número");
umNumero = (int) (Math.random()*100);
out.println("Meu número é: " + umNumero);%>

</body>
</html>