<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <b>Hola mundo feliz ajax  <%= new Date() %> </b>
    <br>
    valor de nombre <%=request.getParameter("nombre") %>
    <%
    Thread.sleep(2000);
    %>