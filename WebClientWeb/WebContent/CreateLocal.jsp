<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<style>
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

input {
  width: 50%%;
}
</style>
	<meta charset="UTF-8">
	<title>Local</title>
</head>

<body>
	
	<h1 style="margin-left: 1%">Crear Local</h1>
	
	<form method="post" action="SvlCreateLocal" style="margin-left:1%">
	
	<%
	String codiTipoLocal = (String) session.getAttribute("codiTipoLocal");
	webservice.Caracteristica[] caracteristiques = (webservice.Caracteristica[]) session.getAttribute("caracteristiques");
	%>
	
		<input type="hidden" value=<%=codiTipoLocal%> name="codiTipoLocal">
			
		<h3 style="margin-block-end:0">Codi del carrer:</h3>
		<input name="codiCarrer" placeholder="Codi del carrer" type="number">
		<br>
		
		<h3 style="margin-block-end:0">Nom del carrer:</h3>
		<input name="nomCarrer" placeholder="Nom del carrer" type="text">
		<br>
		
		<h3 style="margin-block-end:0">Nom de la via:</h3>
		<input name="nomVia" placeholder="Nom de la via" type="text">
		<br>
		
		<h3 style="margin-block-end:0">Número:</h3>
		<input name="numero" placeholder="0" type="number">
		<br>
		
		<h3 style="margin-block-end:0">Nom del local:</h3>
		<input name="nomLocal" placeholder="Nom del local" type="text">
		<br>
		
		<h3 style="margin-block-end:0">Observacions:</h3>
		<textarea name="observacions" placeholder="Observacions"></textarea>
		<br>
		
		<h3 style="margin-block-end:0">Accessibilitat:</h3>
		<h4 style="margin-block-start:0; color:#747474">Puntua les seguents caracteristiques on 0 és la puntuació més baixa i 5 la més alta</h4>
		
		<input type="hidden" name="caracteristiquesLength" value="<%=caracteristiques.length%>">
		
		<table>
			<%for(int i = 0; i < caracteristiques.length; i++) { %>
			 	<tr>
				    <input type="hidden" name="codiCaracteristica<%=i%>" value="<%=caracteristiques[i].getCodiCaracteristica()%>">
				    <td><%=caracteristiques[i].getNomCaracteristicaCA() %></td>
				    <td><select type="text" name="valor<%=i%>">
				    	<option value="0">0</option>
				    	<option value="1">1</option>
				    	<option value="2">2</option>
				    	<option value="3">3</option>
				    	<option value="4">4</option>
				    	<option value="5">5</option>
				    </select></td>
			    </tr>
			<%}%>
		</table>
		<input type="submit" value="Accepta" class="button button1" style="margin:1%">
	</form>
	
</body>
</html>