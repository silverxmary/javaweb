<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String nombre = "Juan";
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
	<b><%=nombre%></b>
	<br>
	<b><%=edad%></b>
	<br>
	<b><%=fechaActual%></b>
	<br>
	<ul>
		<%
			for (int x = 0; x < 10; x++) {
		%>
		<li><%=x%></li>

		<%
			}
		%>
	</ul>
	queryString: <%= request.getQueryString() %><br>
	nombre: <%= request.getParameter("nombre") %><br>
	
	<form action="ejemplo1.jsp" method="post">
		nombre: <input type="text" name="nombre"><br>
		<button type="submit">enviar datos</button>
	</form>
</body>
</html>