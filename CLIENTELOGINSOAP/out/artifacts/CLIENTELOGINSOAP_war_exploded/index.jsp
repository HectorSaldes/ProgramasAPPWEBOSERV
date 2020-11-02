<%--
  Created by IntelliJ IDEA.
  User: Hector-Saldes
  Date: 02/11/2020
  Time: 11:06 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!doctype html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

  <title>SOAP | LOGIN</title>
</head>
<body>

<div class="container">
  <div class="row">
    <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
      <div class="card card-signin my-5">
        <div class="card-body">
          <h5 class="card-title text-center">Login</h5>
          <form action="<%= path%>/loginForm" method="post" class="form-signin">
            <div class="form-label-group">
              <input type="text" name="usuario" id="usuario" class="form-control"  required autofocus>
              <label for="usuario">Usuario</label>
            </div>
            <div class="form-label-group">
              <input type="password" name="contrasena" id="contrasena" class="form-control" required>
              <label for="contrasena">Contraseña</label>
            </div>
            <input class="btn btn-lg btn-primary btn-block text-uppercase" type="submit" value="Iniciar sesión">
            <hr class="my-4">
          </form>
          <p><s:property value="resultado"/></p>
        </div>
      </div>
    </div>
  </div>
</div>




<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>