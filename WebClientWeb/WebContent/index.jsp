<%@page import="webservice.WebServiceLocal"%>
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
	<h1>Locals</h1>
	<br>
  
  	<table style="width:100%">
		<tr>
			<th>Codi Carrer</th>
		    <th>Codi Local</th> 
		    <th>Tipo Local</th>
		    <th>Carrer</th>
		    <th>Via</th>
		    <th>Numero</th>
		    <th>Verificat</th>
		</tr>
		<%
		webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
		webservice.WebServiceLocal port = service.getWebServiceLocalPort();
		
		for(int i = 1; i < port.codiLocalLliure() - 1; i++) {
	  	%>
	  	<tr>  	
			<td>
				<%port.localPerCodiLocal(i).getNomLocal();%>
			</td>
		<%
		}
		%>
		</tr>	
	</table>
</div>

</body>
</html>
