<%@ page isELIgnored="false" %>
<%@ page import="webservice.Caracteristica"%>
<%@ page import="webservice.TipoLocal"%>
<%@ page import="webservice.CaracteristicaTipoLocal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
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
	<h2>Tipus de local a donar d'alta:</h2>
	
	<select name="codiTipoLocal"> 
	<%for (int i=0; i<tipoLocal.length; i++){%>
		<option value="<%=tipoLocal[i].getCodiTipoLocal()%>"> <%=tipoLocal[i].getNomTipoLocalCA()%> </option>
	<%} %>	
	</select>

	<br>
	<input type="submit" value="Seguir">
	</form>

</body>
</html>