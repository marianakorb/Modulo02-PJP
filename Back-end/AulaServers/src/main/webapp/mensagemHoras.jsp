<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
   
    <%@ page import="java.time.LocalDateTime" %>  <!-- COMO IMPORTAR BIBLIOTECA   -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hora</title>
</head>
<body>

<% LocalDateTime agora = LocalDateTime.now();
	int horas = agora.getHour();
	String mensagem = "São " + horas + " horas. ";
	
	if((horas >= 5) && (horas < 13) ) {
		mensagem += "Bom dia!";
	} else if ((horas >= 13) && (horas < 19) ) {
		mensagem += "Boa Tarde!";
	} else {
		mensagem += "Boa Noite!";
	}
%>

<h2> <%=mensagem %> </h2>

</body>
</html>