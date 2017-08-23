<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% String campoText = request.getParameter("campoText");
String campoEmail = request.getParameter("campoEmail");
String campoNumber = request.getParameter("campoNumber");
String sexo = request.getParameter("sexo");
String campoEsCasado = request.getParameter("campoEsCasado");
String[] campoGusto = request.getParameterValues("campoGusto");

%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<b><%= campoText %></b><br>
	<b><%= campoNumber %></b><br>
	<b><%= sexo %></b><br>
	<b><%= campoEsCasado %></b><br>
	<ul>
		<% for (int i=0; i<campoGusto.length; i++) { %>
		<li> <%= campoGusto[i] %></li>
	<% } %>
	</ul>
	


</body>
</html>