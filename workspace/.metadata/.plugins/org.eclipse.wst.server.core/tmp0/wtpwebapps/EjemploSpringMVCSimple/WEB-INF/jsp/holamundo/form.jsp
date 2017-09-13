<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Persona</title>
</head>
<body>

<form:form method="POST" action="guardarform.html" commandName="personaForm">

<table>
	<tr>
		<td>Nombre</td>
		<td><form:input path='nombre'/><form:errors path="nombre" /></td>
	</tr>
	<tr>
		<td>Apellido</td>
		<td><form:input path='apellido'/><form:errors path="apellido" /></td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit" value="guardar" > </td>
	</tr>
</table>
</form:form>

</body>
</html>