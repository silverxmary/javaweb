<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags"  prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details Page</title>
</head>
<body>
Usuario: <s:property value="userName" /><br>
Sexo: <s:property value="gender" /><br>
Pais: <s:property value="country" /><br>
Notas: <s:property value="about" /><br>
Comunidad: <s:property value="community" /><br>
Mailing List: <s:property value="mailingList" />
</body>
</html>