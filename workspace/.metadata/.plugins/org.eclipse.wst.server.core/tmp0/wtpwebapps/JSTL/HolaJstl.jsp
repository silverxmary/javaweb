<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<% 
request.setAttribute("texto", "Hola Mundo JSTL"); 
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${texto}<br>
<c:out value="${texto}"></c:out> <br>
<c:out value="${sindefinir}" default="sin datos"></c:out> <br>


</body>
</html>