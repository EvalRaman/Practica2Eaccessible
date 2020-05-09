<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Caracteristica</title>
</head>

<body>
<%
String codiCaracteristica = (String) session.getAttribute("eAccessible.codiCaracteristica");
String nomCaracteristicaCA = (String) session.getAttribute("eAccessible.nomCaracteristicaCA");
String nomCaracteristicaES = (String) session.getAttribute("eAccessible.nomCaracteristicaES");
String nomCaracteristicaEN = (String) session.getAttribute("eAccessible.nomCaracteristicaEN");
String tipo = (String) session.getAttribute("eAccessible.tipo");
String codiNivell = (String) session.getAttribute("eAccessible.codiNivell");
%>

Caracteristica <%=codiCaracteristica%> creada!

<%String sStatus = (String) session.getAttribute("eAccessible.Status"); %>

<br>
The result of the insert is: <%=sStatus %>


</body>

</html>