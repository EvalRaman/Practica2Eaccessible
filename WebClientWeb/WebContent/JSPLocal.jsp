<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<style>
h1 {
  colour: white;
  background: limegreen;
  width: 40%;
  margin-left: 30%;
  margin-right: 40%;
  margin-top: 10%;
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

<head>
	<meta charset="UTF-8">
	<title>Creacio Local</title>
</head>

<body>

	<div>
		<%
		String nomLocal = (String) session.getAttribute("nomLocal");
		%>
		
		<h1>   Local <%=nomLocal%> creat correctament!   </h1>
		<a href="index.jsp"><input class="button button1" type="submit" value="Accepta" style="margin-top: 1%; width: 8%; margin-left: 46%; margin-right: 46%"></a>
	</div>
</body>

</html>