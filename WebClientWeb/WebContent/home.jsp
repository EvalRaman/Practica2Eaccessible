<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojo.Local"%>
<%@page import="classes.InfoLocal"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Locals eAccessible</title>
</head>

<body>
	<div data-role="navbar" id="navbar-1">
		<ul>
			<li><a href="Cerca.jsp"> Cerca </a></li>
			<li><a href="CreateLocal.jsp"> Crear Local </a></li>
		</ul>
	</div>
	
	
	<% InfoLocal[] locals = (InfoLocal[]) session.getAttribute("Locals");%> 
	<%if (locals == null){ %>
		<h3>No s'ha trobat cap local!</h3>	
	<%} else {%>
		<h1>Locals:</h1>
		<%for (int i=0; i<locals.length; i++){%>
				<li>
					<a  href="Cerca.jsp" ><%=locals[i].getNomLocal()%>, <%=locals[i].getNomTipoLocalCA()%>, <%=locals[i].getNomVia()%>, <%=locals[i].getNomCarrer()%>, nº<%=locals[i].getNumero()%></a>
				</li>
		<%}%>
	 <%}%>	
	
</body>
</html>