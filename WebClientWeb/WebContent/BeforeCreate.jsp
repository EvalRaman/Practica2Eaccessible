<%@ page isELIgnored="false" %>
<%@ page import="webservice.Caracteristica"%>
<%@ page import="webservice.TipoLocal"%>
<%@ page import="webservice.CaracteristicaTipoLocal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<style>
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
	<meta charset="UTF-8">    
    <title> eAccessible </title>
</head>

<body>
	
	<%
	webservice.TipoLocal[] tipoLocal = null;
	
	try{
		webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
		webservice.WebServiceLocal port = service.getWebServiceLocalPort();
		tipoLocal = port.cercaTipoLocal();
	}
	catch (Exception e) { e.printStackTrace();}
	%>
	<br>
	<form method="post" action="SvlBeforeCreate">
	<h2>Tipus de local a crear:</h2>
	
	<select name="codiTipoLocal" style="margin-left: 1%"> 
	<%for (int i=0; i<tipoLocal.length; i++){%>
		<option value="<%=tipoLocal[i].getCodiTipoLocal()%>"> <%=tipoLocal[i].getNomTipoLocalCA()%> </option>
	<%} %>	
	</select>

	<br>
	<input type="submit" value="Seguir" class="button button1" style="margin: 1%">
	</form>

</body>
</html>