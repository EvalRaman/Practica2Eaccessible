<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Codi Nivell</title>
</head>

<body>
<%
String codiNivell = (String) session.getAttribute("eAccessible.codiNivell");
String nomNivellCA = (String) session.getAttribute("eAccessible.nomNivellCA");
String nomNivellES = (String) session.getAttribute("eAccessible.nomNivellES");
String nomNivellEN = (String) session.getAttribute("eAccessible.nomNivellEN");
%>

Codi Nivell <%=codiNivell%> creat!

<%String sStatus = (String) session.getAttribute("eAccessible.Status"); %>

<br>
The result of the insert is: <%=sStatus %>


</body>

</html>