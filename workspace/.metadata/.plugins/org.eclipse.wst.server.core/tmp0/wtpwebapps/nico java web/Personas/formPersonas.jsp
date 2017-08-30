
<jsp:include page="../template_superior.jsp"></jsp:include>


<form class="form-inline" method="post" action="<%=request.getContextPath() %>/AltaPersona">
	<div class="row">
		<div class="col-xs-3">
			<div class="form-group">
				<label for="nombre">Nombre: </label> <input type="text"
					class="form-control" name="nombre" placeholder="Nombre">
			</div>
			<div class="form-group">
				<label for="apellido">Apellido: </label> <input type="text"
					class="form-control" name="apellido" placeholder="Apellido">
			</div>
			<div class="form-group">
				<label for="email">Email: </label> <input type="email"
					class="form-control" name="email"
					placeholder="tuemail@educationit.com">
			</div>
			<div class="radio">
				<label for="sexo"> Sexo:  <input type="radio" name="sexo"
					 value="Masculino" checked> Masculino
				</label>
			</div>
			<div class="radio">
				<label for="sexo"> <input type="radio" name="sexo"
					 value="Femenino"> Femenino
				</label>
			</div>
			<label for="ciudad"> Ciudad: <select class="form-control" name="ciudad">
					<option>Buenos Aires</option>
					<option>Capital</option>
					<option>Claypole</option>
			</select>
			</label> <label for="notas" > Notas: <textarea class="form-control" name="notas" rows="3"></textarea>
			</label>
			<div class="checkbox">
				<label for="esCasado"> <input type="checkbox" name="esCasado" value="S">
					¿Es casado?
				</label>
			</div>
			<button type="submit" class="btn btn-default">Enviar</button>
		</div>
	</div>
</form>




<jsp:include page="../template_inferior.jsp"></jsp:include>