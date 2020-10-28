<%--
  Created by IntelliJ IDEA.
  User: Hector-Saldes
  Date: 28/10/2020
  Time: 08:28 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path =request.getContextPath();%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	      integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

	<title>SUBES | CURP</title>
</head>
<body>

<div class="container jumbotron">
	<h1 class="display-4">SUBES</h1>
	<p class="lead">Consulta tu CURP en el formulario de abajo.</p>
	<hr class="my-4">

	<form action="<%=path%>/consultarCurpForm" method="post">

		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="nombre">Nombre</label>
				<input type="text" class="form-control" id="nombre" name="nombre">
			</div>

			<div class="form-group col-md-4">
				<label for="primerApellido">Primer Apellido</label>
				<input type="text" class="form-control" id="primerApellido" name="primerApellido">
			</div>

			<div class="form-group col-md-4">
				<label for="segundoApellido">Segundo Apellido</label>
				<input type="text" class="form-control" id="segundoApellido" name="segundoApellido">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="estado">Estado</label>
				<select name="estado" id="estado" class="form-control">
					<option value="Morelos">Morelos</option>
					<option value="Guerrero">Guerreo</option>
					<option value="Monterrey">Monterrey</option>
				</select>
			</div>
			<div class="form-group col-md-6">
				<label for="edad">Edad</label>
				<input type="number" min="0" max="99" class="form-control" id="edad" name="edad">
			</div>
		</div>

		<div class="form-row col-md-3">
			<button type="submit" class="btn btn-primary btn-lg btn-block">Envíar datos</button>
		</div>

	</form>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
        crossorigin="anonymous"></script>
</body>
</html>