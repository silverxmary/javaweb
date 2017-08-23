<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% 
	String nombre = (String) session.getAttribute("nombre");
    int numero = (Integer) session.getAttribute("numero");
    Date fechaInicio = (Date) session.getAttribute("fechaInicio");
	String nombreA = (String) session.getAttribute("nombre");
    int numeroA = (Integer) session.getAttribute("numero");
    Date fechaInicioA = (Date) session.getAttribute("fechaInicio");
    
    
%>
    
<body>
<h1>Pagina para Get Session</h1>
<h2> nombre: <%=nombre%></h2>
<h2> numero: <%=numero %></h2>
<h2> fechaInicio: <%=fechaInicio %></h2>
Application
<h2> nombre: <%=nombreA%></h2>
<h2> numero: <%=numeroA %></h2>
<h2> fechaInicio: <%=fechaInicioA %></h2>
</body>
</html>