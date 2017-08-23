<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <jsp:include page="template_superior.jsp"></jsp:include>
 
<h2>Ejemplo TB....</h2>
<h2>Titulo 2 </h2>
<form method="post" action="<%=request.getContextPath()%>/altaPersonas">
  <div class="form-group">
    <label for="nombre">Nombre</label>
    <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Nombre">
  </div>
  <div class="form-group">
    <label for="apellido">Apellido</label>
    <input type="text" class="form-control" name="apellido" id="apellido" placeholder="Apellido">
  </div>
  <div class="form-group">
    <label for="email">Email address</label>
    <input type="email" class="form-control" name="email" id="email" placeholder="Email">
  </div>
 <div class="form-group">
    <label for="sexo">Sexo:</label>  
	<label class="radio-inline">
	  <input type="radio" name="optionSexo" id="fem" value="f"> F
	</label>
	<label class="radio-inline">
	 <input type="radio" name="optionSexo" id="masc" value="m"> M
	</label>
</div>

<div class="form-group">
    <label for="localidad">Localidad:</label>
	 <select class="form-control" name="localidad" >
	  <option>1</option>
	  <option>2</option>
	  <option>3</option>
	  <option>4</option>
	  <option>5</option>
	</select>
</div>

<div class="form-group">
    <label for="notas">Notas</label>
   <textarea name="notas" id="notas" class="form-control" rows="3"></textarea>
</div>
<div class="form-group">
  <div class="checkbox">
    <label>
      <input type="checkbox" id="esCasado" name="esCasado"> Es Casado
    </label>
  </div>
 </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>


   <jsp:include page="template_inferior.jsp"></jsp:include>
