<%@page import="edu.curso.java.servlets.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%
		ArrayList<Persona> personas = (ArrayList<Persona>) request.getAttribute("personas");
	%>
    <table>
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th></th>
		</tr>

		<%
			for(Persona p : personas) {
		%>

		<tr>
			<td><%=p.getId()%></td>
			<td><%=p.getNombre()%></td>
			<td><%=p.getApellido()%></td>
			<td><a href="BorrarPersonaServlet?id= <%=p.getId()%>"
				class="btn btn-danger">Borrar</a></td>
		</tr>
		<%
			}
		%>
	</table>