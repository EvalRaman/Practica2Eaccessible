<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Caractetristica Tipo Local</title>
</head>

<body>
<%
String codicaracteristicatipolocal = (String) session.getAttribute("eAccessible.codicaracteristicatipolocal");
String codicaracteristica = (String) session.getAttribute("eAccessible.codicaracteristica");
String coditipolocal = (String) session.getAttribute("eAccessible.coditipolocal");
%>

Caractetristica Tipo Local <%=codicaracteristicatipolocal%> creada!

<%String sStatus = (String) session.getAttribute("eAccessible.Status"); %>

<br>
The result of the insert is: <%=sStatus %>


</body>

</html>