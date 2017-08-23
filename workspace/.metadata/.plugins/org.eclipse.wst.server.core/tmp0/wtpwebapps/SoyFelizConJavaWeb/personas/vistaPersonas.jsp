<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <jsp:include page="template_superior.jsp"></jsp:include>
 
<h2>Vista Personas</h2>
<h2>Titulo 2 </h2>

  <div class="form-group">
    <label for="nombreS">Nombre: </label>${persona.nombre}
  </div>
  <div class="form-group">
    <label for="apellidoS">Apellido: </label>${persona.apellido}
  </div>
  <div class="form-group">
    <label for="apellidoS">Email: </label>${persona.email}
  </div>
  <div class="form-group">
    <label for="apellidoS">sexo: </label>${persona.sexo}
  </div>
  <div class="form-group">
    <label for="apellidoS">Notas: </label>${persona.notas}
  </div>
  <div class="form-group">
    <label for="apellidoS">Es Casado: </label>${persona.campoEsCasado}
  </div>
  <div class="form-group">
    <label for="apellidoS">Localidad: </label>${persona.localidad}
  </div>

   <jsp:include page="template_inferior.jsp"></jsp:include>
