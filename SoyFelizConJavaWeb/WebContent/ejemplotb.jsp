<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <jsp:include page="template_superior.jsp"></jsp:include>
 
<h1>Ejemplo general....</h1>
<h2>Titulo 2 </h2>
<div class="row">
	<div class="col-md-6"><a href="http://www.google.com">Ir a google</a></div>
	<div class="col-md-6"><a href="http://www.google.com" class="btn btn-primary">Ir a google</a></div>
</div>


<table class="table table-striped">
 <tr>
 	<td>id</td>
 	<td>nombre</td>
 	<td>apellido</td>
 	<td>accion</td>
 </tr>
 <tr>
 	<td>1</td>
 	<td>Mary</td>
 	<td>Soto</td>
 	<td><a href="#" class="btn btn-default">ver</a></td>
 </tr>
</table>

   <jsp:include page="template_inferior.jsp"></jsp:include>
