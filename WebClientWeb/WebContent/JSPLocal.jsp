<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Creacio Local</title>
</head>

<body>

	<%
	String nomLocal 	 = (String) session.getAttribute("nomLocal");
	%>
	
	Local <%=nomLocal%> creat "correctament"!

</body>

</html>