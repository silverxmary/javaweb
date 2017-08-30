<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#buttonCalcular').on('click', function() {
				var inputNum1 = parseInt($('#inputNum1').val());
				var inputNum2 = parseInt($('#inputNum2').val());
				var total = 0;
				var operacion = $('#selectOperacion').val();
				
				if(operacion == 'sumar') {					
					total = inputNum1 + inputNum2;
				} else if(operacion == 'restar') {
					total = inputNum1 - inputNum2;
				}
				
				$('#inputTotal').val(total);
			});
		});
	</script>
</head>
<body>
	Num1: <input type="number" id="inputNum1"><br>
	Num2: <input type="number" id="inputNum2"><br>
	Total: <input type="number" id="inputTotal" readonly><br>
	<select id="selectOperacion">
		<option value="sumar">Sumar</option>
		<option value="restar">Restar</option>
	</select>
	<button type="button" id="buttonCalcular">Calcular</button>
</body>
</html>