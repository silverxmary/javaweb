<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HolaMundo</title>
    </head>
    <body>
       <s:form action="Calculadora" >
                   <s:textfield name="n1" label="Numero 1" />
                   <s:radio name="operacion" label="Operacion"
                   list="{'sumar', 'restar', 'multiplicar', 'dividir'}" />
                    <s:textfield name="n2" label="Numero 2" />
   			<s:submit value = "Enviar datos"/>
        </s:form>
        
   
        
        
        
        
    </body>
</html>
