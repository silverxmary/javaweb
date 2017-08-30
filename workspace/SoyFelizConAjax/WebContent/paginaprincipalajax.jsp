<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"   src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"   src="js/jquery.blockUI.js"></script>
<script type="text/javascript"> 
/* 	$(document).ready(function(){
		$('#buttonAjax').on('click', function (){
			$('#buttonAjax').prop('disabled',true);
			$.blockUI({ message: '<h1><img src="ajax-loader.gif" /> Just a moment...</h1>' });

			//$('#gif-animado').show();
			
			$.post('ajax1.jsp', $('#formDatos').serialize() , function(respuesta){
				$('#divContenedor').html(respuesta);
				$('#buttonAjax').prop('disabled',false);
				//$('#gif-animado').hide();
				$.unblockUI();
				
			});
			//$('#divContenedor').load('ajax1.jsp');
			
		});
	}); */
	//pagina de json webservice placeholder

/*  	$(document).ready(function(){
	$('#buttonAjax').on('click', function (){
		var personas=[ {nombre : 'juan' , edad: 34, tieneHijos: true},
		               {nombre : 'maria' , edad: 40, tieneHijos: true},
		               {nombre : 'pedro' , edad: 45, tieneHijos: true},
		              ];
	
		$('#divContenedor').append('Nombre: '+ persona.nombre + ' Edad: '+ persona.edad +'<br>');
		
		$.each(personas,function(index, p){
			$('#divContenedor').append('Nombre: '+ persona.nombre + ' Edad: '+ persona.edad +'<br>');
		});

		//$('#gif-animado').show();
		
	
			
		});
		//$('#divContenedor').load('ajax1.jsp');
		
	}); */
 
	
 	$(document).ready(function(){
 		$('#buttonAjax').on('click', function (){
 			$.getJSON('https://jsonplaceholder.typicode.com/photos', function(fotos){
 				
 			
 			$.each(fotos,function(index, foto){
 				$('#divContenedor').append('titulo: '+ foto.title + ' <img src="'+ foto.thumbnailUrl +'"' + '<br>');
 			});

 			//$('#gif-animado').show();
 			
 			});
 				
 			});
 			//$('#divContenedor').load('ajax1.jsp');
 			
 		});
	
</script>
</head>
<body>
<form id="formDatos">
Nombre <input type="text" id="campoNombre" name="nombre">
</form>

<!-- <image src="ajax-loader.gif" id="gif-animado" style="display: none;"> </image> -->


<div id="divContenedor"></div>
<input type="button" id="buttonAjax" value="Llamar Ajax!!">


</body>
</html>