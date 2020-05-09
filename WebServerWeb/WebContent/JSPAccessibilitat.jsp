<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Accessibilitat</title>
</head>

<body>
<%
String codiAccessibilitat = (String) session.getAttribute("eAccessible.codiAccessibilitat");
String codiLocal = (String) session.getAttribute("eAccessible.codiLocal");
String codiCaracteristica = (String) session.getAttribute("eAccessible.codiCaracteristica");
String valor = (String) session.getAttribute("eAccessible.valor");
String verificat = (String) session.getAttribute("eAccessible.verificat");
%>

Accessibilitat <%=codiAccessibilitat%> creada!

<%String sStatus = (String) session.getAttribute("eAccessible.Status"); %>

<br>
The result of the insert is: <%=sStatus %>


</body>

</html>