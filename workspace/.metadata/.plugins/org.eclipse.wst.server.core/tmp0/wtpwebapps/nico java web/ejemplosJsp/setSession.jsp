<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
//SET
	String nombre = "juan";
	int numero = 33;
	Date fechaInicio = new Date();
	
	session.setAttribute("nombre", nombre);
	session.setAttribute("numero", numero);
	session.setAttribute("fechaInicio", fechaInicio);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Pagina para set session</h1>
<h2>ID: <%= session.getId() %></h2>
<h2>Id new:<%= session.isNew() %></h2>
<h2>Last accessed time: <%=new Date(session.getLastAccessedTime()) %></h2>
</body>
</html>