<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="webservice.*"%>
<%@page import="classes.*"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Detall del Local</title>
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

table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>

<body>		
	<div style="padding-left: 20px">
		<h1 style="display: inline">Local:</h1>	
		<%InfoLocal local = (InfoLocal) session.getAttribute("Local");%>
		<form method="post" action="SvlVerify">
        	<input type="hidden" name="codiLocal" value="<%=local.getCodiLocal()%>">
        	<input type="hidden" name="nomLocal" value="<%=local.getNomLocal()%>">
            <input class="button button1" type="submit" value="Verificar">		
		</form>
			<table style="width:50%">
				<tr>
					<td style="font-weight: bold">NOM</td><td><%=local.getNomLocal()%></td>
				</tr>
				<tr>
					<td style="font-weight: bold">TIPO DE LOCAL</td><td><%=local.getNomTipoLocalCA()%></td>
				</tr>
				<tr>
					<td style="font-weight: bold">VIA</td><td><%=local.getNomVia()%></td>
				</tr>
				<tr>
					<td style="font-weight: bold">CARRER</td><td><%=local.getNomCarrer()%></td>
				</tr>
				<tr>
					<td style="font-weight: bold">NUMERO</td><td><%=local.getNumero()%></td>
				</tr>
				<tr>
					<td style="font-weight: bold">VERIFICAT</td><td><%=local.getVerificat()%></td>
				</tr>			
			</table>
	
	<%	
		InfoCaracteristica[] infoCaracteristiques = (InfoCaracteristica[]) session.getAttribute("caracteristiques"); 
			if (infoCaracteristiques == null) { 
	%>
			<h3>No hi ha caracteristiques</h3>
							
	<% 		}
			else { 
	%>
			<h2>Caracteristiques:</h2>
			<table>
			<%for(int i = 0; i < infoCaracteristiques.length; i++) { 
				if(infoCaracteristiques[i] != null) {%>
					<tr><td><%=infoCaracteristiques[i].getNomCaracteristicaCA()%><td></tr>
		<%		}
		%>			    	 
		<%	}%>
			</table>	
		<%}
		%>
	</div>
</body>
</html>