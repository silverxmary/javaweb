<%@page language="java" import="java.util.*"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%
   request.setAttribute("fechaActual", new Date());
   double numeroActual = 598.56;
   request.setAttribute("numeroActal", new Double(numeroActual));
   request.setAttribute("nombre", "juan");
   
   
   
   
   %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fmt:formatDate value="${fechaActual}" dateStyle="default"/><br>
<fmt:formatDate value="${fechaActual}" dateStyle="short"/><br>
<fmt:formatDate value="${fechaActual}" dateStyle="medium"/><br>
<fmt:formatDate value="${fechaActual}" dateStyle="long"/><br>
<fmt:formatDate value="${fechaActual}" dateStyle="full"/><br>
<fmt:formatDate pattern="dd-MM-yyyy" value="${fechaActual}" /><br>






</body>
</html>