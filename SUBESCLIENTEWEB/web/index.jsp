<%--
  Created by IntelliJ IDEA.
  User: Hector Saldaña
  Date: 30/09/2020
  Time: 08:36 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
  <head>
    <title>SUBES CLIENTE</title>
    <meta charset="UTF-8">

  </head>

  <body>
  <h1>CONSULTAR CURP</h1> <br>

  <form action="<%=path%>/CurpAction" method="POST">


    <input type="text" name="nombre" placeholder="Nombre"/>
    <br>

    <input type="text" name="primerApellido" placeholder="Primer Apellido"/>
    <br>

    <input type="text" name="segundoApellido" placeholder="Segundo Apellido"/>
    <br>

    <input type="number" name="edad" placeholder="Edad"/>
    <br>

    <select name="estado" id="">
      <option value="0">Seleccione...</option>
      <option value="Monterrey">Monterrey</option>
      <option value="Morelos">Morelos</option>
      <option value="Guerrero">Guerrero</option>
      <option value="Puebla">Puebla</option>
      <option value="Tlaxcala">Tlaxcala</option>
    </select>
    <br>

    <input type="submit" value="Consultar CURP"/>


  </form>


  </body>
</html>
