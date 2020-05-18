<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Local</title>
</head>

<body>

	<form method="post" action="SvlCreateLocal">
	
	<%
	String codiTipoLocal = (String) session.getAttribute("codiTipoLocal");
	webservice.Caracteristica[] caracteristiques = (webservice.Caracteristica[]) session.getAttribute("caracteristiques");
	%>
	
		<input type="hidden" value=<%=codiTipoLocal%> name="codiTipoLocal">
			
		<label>Codi del carrer :</label>
		<input name="codiCarrer" placeholder="Codi del carrer" type="number">
		<br>
		
		<label>Nom del carrer :</label>
		<input name="nomCarrer" placeholder="Nom del carrer" type="text">
		<br>
		
		<label>Nom de la via :</label>
		<input name="nomVia" placeholder="Nom de la via" type="text">
		<br>
		
		<label>Número :</label><br>
		<input name="numero" placeholder="0" type="number">
		<br>
		
		<label>Nom del local :</label>
		<input name="nomLocal" placeholder="Nom del local" type="text">
		<br>
		
		<label>Observacions :</label>
		<textarea name="observacions" placeholder="Observacions"></textarea>
		<br>
		
		<label>Accessibilitat</label>
		Puntua les seguents caracteristiques on 0 és la puntuació més baixa i 5 la més alta
		<br>
		<input type="hidden" name="caracteristiquesLength" value="<%=caracteristiques.length%>">
		<br>
		<%for(int i = 0; i < caracteristiques.length; i++) { %>
		    <input type="hidden" name="codiCaracteristica<%=i%>" value="<%=caracteristiques[i].getCodiCaracteristica()%>">
		    <%=caracteristiques[i].getNomCaracteristicaCA() %>: 
		    <select type="text" name="valor<%=i%>">
		    <option value="0">0</option>
		    <option value="1">1</option>
		    <option value="2">2</option>
		    <option value="3">3</option>
		    <option value="4">4</option>
		    <option value="5">5</option>
		    </select>
		    <br>
		<%}%>
		
		<input type="submit" value="Accepta">
	</form>
	
</body>
</html>