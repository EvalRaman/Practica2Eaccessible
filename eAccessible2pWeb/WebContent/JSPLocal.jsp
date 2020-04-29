<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Creació Local</title>
</head>

<body>
<%
String codiTipoLocal = (String) session.getAttribute("eAccessible.codiTipoLocal");
String codiCarrer = (String) session.getAttribute("eAccessible.codiCarrer");
String nomCarrer = (String) session.getAttribute("eAccessible.nomCarrer");
String nomVia = (String) session.getAttribute("eAccessible.nomVia");
String numero = (String) session.getAttribute("eAccessible.numero");
String nomLocal = (String) session.getAttribute("eAccessible.nomLocal");
String observacions = (String) session.getAttribute("eAccessible.observacions");
String verificat = (String) session.getAttribute("eAccessible.verificat");
%>

Local <%=nomLocal%> creat!

<%String sStatus = (String) session.getAttribute("eAccessible.Status"); %>

<br>
The result of the insert is: <%=sStatus %>


</body>

</html>