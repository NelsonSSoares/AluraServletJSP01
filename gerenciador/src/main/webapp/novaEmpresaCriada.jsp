<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String nomeEmpresa = (String) request.getAttribute("empresa");
	%>
	
	<h3>Empresa: <% out.println(nomeEmpresa); // %= nomeEmpresa %> cadastrada com sucesso!!</h3>


</body>
</html>