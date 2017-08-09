<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% 
    	String nombre ="juan";
    	int edad = 10;
    	Date fechaActual = new Date();
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<b><%= nombre %></b><br>
	<b><%= edad %></b><br>
	<b><%= fechaActual %></b><br>
	<ul>
		<% for (int x=0; x<10; x++) { %>
		<li> <%= x %></li>
	<% } %>
	</ul>
	
	QueryString: <%= request.getQueryString() %><br>
	Nombre: <%= request.getParameter("nombre") %><br>
	
	<form method="post" action="ejemplo1.jsp">
	CampoNombre: <input type="text" name ="nombre"><br>
	<button type="submit">Enviar Datos</button>
	
	</form>
</body>
</html>