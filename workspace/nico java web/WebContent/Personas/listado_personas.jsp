<%@page import="edu.curso.java.servlets.Persona"%>
<%@page import="java.util.ArrayList"%>
	<jsp:include page="../template_superior.jsp"></jsp:include>
	<%
		ArrayList<Persona> personas = (ArrayList<Persona>) request.getAttribute("personas");
	%>


	
<!-- 	<form method="get" action="ListadoDePersonas"> -->
<!-- 		<input type="text" name="textoBuscar" placeholder="texto para buscar"> -->
<!-- 		<button type="submit">Buscar</button> -->
<!-- 	</form> -->
<input type="text" name="textoBuscar" placeholder="texto para buscar"> 
<input type="button" id="buttonAjax" value="Buscar">
	
	<div id="divContenedor"></div>
	
	<jsp:include page="../template_inferior.jsp"></jsp:include>
	
	
	<script type="text/javascript"> 
	$(document).ready(function(){
		$('#buttonAjax').on('click', function (){
			//$('#buttonAjax').prop('disabled',true);
			//$.blockUI({ message: '<h1><img src="ajax-loader.gif" /> Just a moment...</h1>' });
			//$('#gif-animado').show();
			
			$.get('Personas/tablapersonas.jsp', $('#textoBuscar').val(), function(respuesta){
				$('#divContenedor').html(respuesta);
				//$('#buttonAjax').prop('disabled',false);
				//$('#gif-animado').hide();
				//$.unblockUI();
				
			});
			//$('#divContenedor').load('ajax1.jsp');
			
		});
	});

</script>