<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="template_superior.jsp"></jsp:include>

	<h1>Ejemplo general de pagina</h1>
	<h2>Sub title....</h2>
	
	<div class="row">
		<div class="col-md-6">
			<a href="http://www.google.com">Ir a google</a>
		</div>
		<div class="col-md-6">
			<a href="http://www.google.com" class="btn btn-primary">Ir a google boton</a>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<table class="table table-bordered">
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Acciones</th>
				</tr>
				<tr>
					<td>1</td>
					<td>Juan</td>
					<td>Perez</td>
					<td><a href="#" class="btn btn-default">Ver</a></td>
				</tr>
			</table>
		</div>
	</div>
	
	
	
<jsp:include page="template_inferior.jsp"></jsp:include>