<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Verificació local</title>
</head>

<body>

<h3>Verificació</h3>
	
	<%String nomLocal = (String) session.getAttribute("nomLocal");%>
	
	Local verificat "correctament"!<br />
	<a href="index.jsp"><button>Retornar a inici</button></a>

</body>

</html>