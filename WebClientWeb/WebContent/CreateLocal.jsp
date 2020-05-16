<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Local</title>
</head>

<body>

	<form method="post" action="SvlLocal">
	
		<label>Codi tipus de local :</label>
		<input name="codiTipoLocal" placeholder="Codi del local" type="number">
		<br>
		
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
		
		<label>Verificat:</label>
		<input name="verificat" placeholder="S/N" type="text">
		<br><br>
		
		<input type="submit" value="Accepta">
	</form>
	
</body>
</html>