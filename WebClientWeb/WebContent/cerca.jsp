<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cerca Local</title>
</head>
<body>

	<div data-role="navbar" id="navbar-1">
		<ul>
			<li><a style="background-color:#addffc" href="#">Cerca</a></li>
			<li><a href="CreateLocal.jsp">Alta d'un local</a></li>
		</ul>
	</div>
		
	
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
	
	Nom del Local:
	<input type="text" name="nomLocal">
	
	Tipus de Local:
	<select name="codiTipoLocal"> 
	<option value="">  </option>
	<%for (int i = 0; i < tipoLocal.length; i++){%>
		<option value="<%=tipoLocal[i].getCodiTipoLocal()%>"> <%=tipoLocal[i].getNomTipoLocalCA()%> </option>
	<%} %>	
	</select>
	
	<input type="hidden"  name="codiTipoLocal" value="">
	
	<br>
	<input type="submit" value="Cercar">
	</form>
</body>
</html>