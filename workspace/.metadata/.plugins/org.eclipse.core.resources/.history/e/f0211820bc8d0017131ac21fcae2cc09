<%@page import="edu.curso.java.servlets.Persona"%>
<%@page import="java.util.ArrayList"%>
	<jsp:include page="../template_superior.jsp"></jsp:include>
	<%
		ArrayList<Persona> personas = (ArrayList<Persona>) request.getAttribute("personas");
	%>
	<form method="get" action="ListadoDePersonas">
		<input type="text" name="textoBuscar" placeholder="texto para buscar">
		<button type="submit">Buscar</button>
	</form>
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
	<jsp:include page="../template_inferior.jsp"></jsp:include>