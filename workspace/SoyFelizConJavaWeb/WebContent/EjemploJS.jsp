<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src = "js/jquery-3.2.1.js"></script>

<script type="text/javascript">
		var texto="Hola mundo javaScript";
		
		$(document).ready(function(){
			$('#calcula').on('click' , function (){
				//var textoSaludo='<b>hola a todos</b>';
				//$('#miDiv').html(textoSaludo+' '+$('#miInput').val());
				var operacion=$('#operacion').val();
				/*if (operacion == 'sumar'){
					$('#miTotal').val(parseInt($('#miInput1').val())+parseInt($('#miInput2').val()));
				}
				if (operacion == 'restar'){
					$('#miTotal').val(parseInt($('#miInput1').val())-parseInt($('#miInput2').val()));
				}
				if (operacion == 'multiplica'){
					$('#miTotal').val(parseInt($('#miInput1').val())*parseInt($('#miInput2').val()));
				}
				if (operacion == 'divide'){
					$('#miTotal').val(parseInt($('#miInput1').val())/parseInt($('#miInput2').val()));
				}*/
				
				operacion =='sumar' ? $('#miTotal').val(parseInt($('#miInput1').val())+parseInt($('#miInput2').val())) :
					operacion == 'restar' ?  $('#miTotal').val(parseInt($('#miInput1').val())-parseInt($('#miInput2').val())) :
						operacion == 'multiplica' ? $('#miTotal').val(parseInt($('#miInput1').val())*parseInt($('#miInput2').val())) :
							operacion == 'divide' ? $('#miTotal').val(parseInt($('#miInput1').val())/parseInt($('#miInput2').val())) : 
								$('#miTotal').val("seems we have an error");
				
				
			});
			
			
		});
			
		//function saludar(nomb){
			//var textoSaludo='<b>hola a todos</b>';
			//$('#miDiv').html(textoSaludo+' '+$('#miInput').val());
			/*var miInput =document.getElementById('miInput');
			var miDiv =document.getElementById('miDiv');
			var contenidoMiInput = miInput.value;
			var textoFinal = textoSaludo+ ' '+contenidoMiInput;
			miDiv.innerHTML = textoFinal;*/
			/*var edad =10;
			console.log(texto+" info "+ edad + ' nom '+ nomb);
			alert(texto);*/

		//}
		
		
</script>
</head>
<body>

Num1: <input type="number" id="miInput1"><br>
Num2: <input type="number" id="miInput2"><br>
Total: <input type ="number" id="miTotal" readonly><br>
<select name="operacion" id="operacion">
  <option value="sumar">Sumar</option>
  <option value="restar">Restar</option>
  <option value="multiplica">Multiplica</option>
  <option value="divide">Divide</option>
</select>
<button id="calcula">Calcular</button>
<div id="miDiv">cualquiercosa</div>
</body>
</html>