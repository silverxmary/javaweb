<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
//GET
	String nombre =(String) session.getAttribute("nombre");
	int numero = (Integer) session.getAttribute("numero");
	Date fechaInicio =(Date) session.getAttribute("fecha");
	
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
<h2>nombre:<%= nombre %></h2>
<h2>numero:<%= numero%></h2>
<h2>fecha:<%= fechaInicio %></h2>

</body>
</html>