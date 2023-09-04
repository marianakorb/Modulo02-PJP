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
	<label for=cores>Digite suas cores favoritas: </label>
	
	<select name="cores" multiple>
		<option value="Vermelho">Vermelho</option>
		<option value="Azul">Azul</option>
		<option value="Amarelo">Amarelo</option>
		<option value="Verde">Verde</option>
		<option value="Cinza">Cinza</option>
		<option value="Laranja">Laranja</option>
	</select>
	<input type="text" id="nome" name="nome">
	
	<button type="submit">Enviar</button>
</form>

</body>
</html>