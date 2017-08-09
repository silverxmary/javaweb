<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="<%=request.getContextPath() %>/pepe">
<!-- 		<form action="ejemplodestinoformulario.jsp"> -->
	Nombre: <input type="text" name="campoText"><br>
	Email: <input type="email" name="campoEmail"><br>
	Saldo: <input type="number" name="campoNumber"><br>
	Sexo: 
	<select name="sexo">
		<option value="f">Femenino</option>
		<option value="m">Masculino</option>
	</select><br>
	Es casado:
	<input type="checkbox" value="si es casado" name="campoEsCasado" checked><br> 
	<select name="campoGusto" multiple>
		<option value="arroz">Arroz</option>
		<option value="pollo">Pollo</option>
		<option value="pescado">Pescado</option>
	</select><br>
	<button type="submit">Enviar Datos</button>
	
	</form>

</body>
</html>