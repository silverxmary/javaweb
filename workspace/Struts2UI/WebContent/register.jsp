<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>

<s:actionerror />
<s:actionmessage />

<s:form action="saveRegister">
	<s:textfield name="userName" label="Usuario" />
	<s:password name="password" label="Password" />
	<s:radio name="gender" label="Sexo" list="{'Masculino','Femenino'}" />
	<s:select name="country" list="countryList" listKey="countryId"
		listValue="countryName" headerKey="0" headerValue="Country"
		label="Pais?" />
	<s:textarea name="about" label="Notas" />
	<s:checkboxlist list="communityList" name="community" label="Comunidad" />
	<s:checkbox name="mailingList"
		label="Mailing list?" />
	<s:submit />
</s:form>
</body>
</html>