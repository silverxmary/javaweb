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
    	<s:actionerror />
		<s:actionmessage />
    
        <h1><s:property value="message" /></h1>      
        <h1>mesaje anotation ${message}</h1>
        
    </body>
</html>
