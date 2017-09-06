<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
   
   <%
   request.setAttribute("textoRequest", "hola Mundo JSTL (Request)");
   session.setAttribute("textoSession", "hola Mundo JSTL (Session)");
   application.setAttribute("textoAplication", "hola Mundo JSTL (Aplication)");


   ArrayList<String> nombres = new ArrayList<String>();
   nombres.add("Pepe");
   nombres.add("Juan");
   nombres.add("Maria");
   request.setAttribute("nombres", nombres);
   
   
   %>
   
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border = '1'>
<tr>
	<td valing="top"><b>out:</b></td>
	<td>
		<c:out value="${textoRequest}"/> <br>
		<c:out value="${textoSession}"/><br>
		<c:out value="${textoAplication}"/><br>
		<c:out default="no hay nada en la var xyz" value="${xyz}"/><br>
	</td>
</tr>
<tr>
<td valing="top"><b>url:</b></td>
	<td>
		<a href='<c:url value="/core.jsp"/>'>ir al core</a>
		<br>
		<a href='<c:url value="/core.jsp"><c:param name="texto" value="textoRequest"/></c:url>'>urlCon Parametros</a>
		<c:out value="${param['texto']}" default=""></c:out> <br>
		
	</td>
</tr>
<tr>
<td valing="top"><b>if:</b></td>
	<td>
		<a href='<c:url value="/core.jsp"/>'>ir al core</a>
		<c:if test="${textoRequest=='HolaMundo JSTL (Request)'}">La var TextoReq contiene el texto HolaMundo JSTL (Request) <br></c:if> 
		<c:if test="${not empty textoSession}">La var textoSession no es null <br></c:if> 
		
		<c:choose>
		<c:when test="${textoApplication== 'hola'}">El texto es hola</c:when>
		<c:when test="${textoApplication== 'chau'}">El texto es chau</c:when>
		
		<c:otherwise>El texto no es hola ni chao</c:otherwise>
		
		</c:choose>
		
		
	</td>
</tr>
<tr>
<td valing="top"><b>foreach:</b></td>
	<td>
	<c:forEach items="${nombres}" var="nombre"> 
	Nombre: <c:out value="${nombre}" /> <br>
	</c:forEach>		
	</td>
</tr>
<tr>
<td valing="top"><b>forTokens:</b></td>
	<td>
	<c:forTokens items="1:2:3:4" delims=":" var="numero"> 
	Numero: <c:out value="${numero}" /> <br>
	</c:forTokens>		
	</td>
</tr>
</table>
</body>
</html>