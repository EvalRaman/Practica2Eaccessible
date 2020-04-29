<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Creació Usuari</title>
</head>

<body>
<%
String dni = (String) session.getAttribute("incidencia.dni");
String nom = (String) session.getAttribute("incidencia.nom");
String cognoms = (String) session.getAttribute("incidencia.cognoms");
String telefon = (String) session.getAttribute("incidencia.telefon");
String codiCarrer = (String) session.getAttribute("incidencia.codiCarrer");
String nomCarrer = (String) session.getAttribute("incidencia.nomCarrer");
String nomVia = (String) session.getAttribute("incidencia.nomVia");
String numero = (String) session.getAttribute("incidencia.numero");
%>

Usuari <%=nom%> creat!

<%String sStatus = (String) session.getAttribute("incidencia.Status"); %>

<br>
The result of the insert is: <%=sStatus %>


</body>

</html>