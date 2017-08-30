<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="<%= request.getContextPath() %>/pepe">
		texto:<input type="text" name="campoText"> <br>
		<button type="submit">Envialo m3n</button>
	</form>
	<form method="post" action="ejemploDestinoFormulario.jsp">
		texto:<input type="text" name="campoText"> <br> email:<input
			type="email" name="campoEmail"> <br> numero:<input
			type="number" name="campoNumber"> <select name="campoSexo">
			<option>Masculino</option>
			<option>Femenino</option>
		</select><br> es casada: <input type="checkbox" value="si,es casada"
			name="campoEsCasada" checked><br>
		<button type="submit">Envialo m3n</button>
	</form>
</body>
</html>