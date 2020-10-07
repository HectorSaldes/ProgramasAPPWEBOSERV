<%-- 
    Document   : Index
    Created on : 7/10/2020, 09:08:35 AM
    Author     : Hector Saldaña
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Mundo</h1>
        <!--Struts esta basado en actions y se gestionan en el struts.xml para que estos actions sean reconocidos-->
        <form action="saludar" method="GET">
            <input type="text" placeholder="Nombre" name="nombre"/>
            <br>
            <input type="submit" value="Saludar"/>
        </form>
        <br><br>
        <label>
            <s:property value="saludo" />
        </label>
    </body>
</html>
