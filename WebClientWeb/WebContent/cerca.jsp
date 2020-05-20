<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cerca Local</title>
</head>
<body>
	
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
	
	<h1>Cerca avançada</h1>
	
	<br>
	<form method="post" action="SvlDisplay" style="margin-left:20px">
	<!-- 
	Nom del Local:
	<input type="text" name="nomLocal">
	-->
	
	<h3>Tipus de Local:</h3>
	<select name="codiTipoLocal"> 
	
	<option value="">  </option>
	<%for (int i = 0; i < tipoLocal.length; i++){%>
		<option value="<%=tipoLocal[i].getCodiTipoLocal()%>"> <%=tipoLocal[i].getNomTipoLocalCA()%> </option>
	<%} %>	
	</select>
	
	<h3>Via:</h3>
	<input type="text" name="nomVia">
	
	<h3>Carrer:</h3>
	<input type="text" name="nomLocal">
	
	<input type="hidden"  name="codiTipoLocal" value="">
	
	<br>
	<input type="submit" value="Cercar">
	</form>
</body>
</html>