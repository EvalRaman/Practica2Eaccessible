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

.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 8px 16px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 1px;
  transition-duration: 0.4s;
  cursor: pointer;
}
  
  .button1 {
  background-color: #f1f1f1;
  color: black;
  border: 2px solid #555555;
}

.button1:hover {
  background-color: #555555;
  color: white;
}
</style>
</head>
<body>

<div class="header">
  <a href="#default" class="logo">eAccessible</a>
  
  <div class="header-right">
	    <a href="BeforeCreate.jsp" style="padding: 5px"><button class="button button1">Crear Local</button></a>
	    <a href="cerca.jsp" style="padding: 5px"><button class="button button1">Cerca</button></a>
  </div>
  
</div>

<div style="padding-left:20px">		
	<%
		webservice.TipoLocal[] tipoLocal = null;
		try {
			webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
			webservice.WebServiceLocal port = service.getWebServiceLocalPort();
			tipoLocal = port.cercaTipoLocal();
		}
		catch (Exception e) { 
			e.printStackTrace();
		}
	%>
		<br>
		<form method="post" action="SvlDisplay">
		
			<h3 style="display: inline">Nom del Local:</h3>
			<input type="text" name="nomLocal">
			
			<h3 style="display: inline; margin-left:1%">Tipus de Local:</h3>
			<select name="codiTipoLocal"> 
			
			<option value="">  </option>
	<%		
			for (int i = 0; i < tipoLocal.length; i++){%>
				<option value="<%=tipoLocal[i].getCodiTipoLocal()%>"> <%=tipoLocal[i].getNomTipoLocalCA()%> </option>
	<%		
			}
	%>	
			</select>
			<input type="hidden"  name="codiTipoLocal" value="">
		
			<br>
			<input class="button button1" type="submit" value="Filtra" style="margin-top:1%">
		</form>
		
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
