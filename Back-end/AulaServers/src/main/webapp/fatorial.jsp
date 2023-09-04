<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	public int fatorial(int n) {
	
	return (n<1) ? 1 : n * fatorial(n-1);
}
%>
<% for (int i = 1; i <= 5; i++) { %>
	<p> O fatorial de <%=i %> é <%=fatorial(i) %> </p>
<%} %>
</body>
</html>