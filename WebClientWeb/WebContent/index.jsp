<%@page import="webservice.WebServiceLocal"%>
<%@page import="webservice.Local"%>
<%@page import="classes.InfoLocal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    
    
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
</head>
<body>

<div class="header">
  <a href="#default" class="logo">eAccessible</a>
  <div class="header-right">
    <a href="#create">Crear Local</a>
    <a href="#contact">Cerca</a>
  </div>
</div>

<div style="padding-left:20px">		
	
	<% 	
		InfoLocal[] locals = (InfoLocal[]) session.getAttribute("Locals"); 
			if (locals == null) { 
	%>
			<h3>No s'ha trobat cap local!</h3>	
	<% 		}
			else { 
	%>
			<h1>Locals:</h1>
	<%		
				for (int i = 0; i < locals.length; i++) {%>
				
				<li><a href="cerca.jsp"><%=locals[i].getNomLocal()%>, <%=locals[i].getNomTipoLocalCA()%>, <%=locals[i].getNomVia()%>, <%=locals[i].getNomCarrer()%>, nº<%=locals[i].getNumero()%></a></li>
	<%			}
			}
	%>
	
</div>

</body>
</html>
