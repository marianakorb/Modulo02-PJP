<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="CoresServelet" method="post">
	<label for=cores>Selecione suas cores favoritas: </label>
	
	<label><br> <input type="checkbox" name="cores" value="amarelo">Amarelo </label>
	<label><br> <input type="checkbox" name="cores" value="vermelho">Vermelho </label>
	<label><br> <input type="checkbox" name="cores" value="azul">Azul </label>
	<label><br> <input type="checkbox" name="cores" value="cinza">Cinza </label>
	<label><br> <input type="checkbox" name="cores" value="laranja">Laranja </label>
	<label><br> <input type="checkbox" name="cores" value="verde">Verde </label>
	
	<input type="text" id="nome" name="nome">
	
	<button type="submit">Enviar</button>
</form>

</body>
</html>