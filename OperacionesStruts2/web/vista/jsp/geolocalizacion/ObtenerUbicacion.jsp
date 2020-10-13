<%-- 
    Document   : ObtenerUbicacion
    Created on : 13/10/2020, 07:27:19 AM
    Author     : Hector Saldaña
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>Geolocalización</title>       
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">     
        <script charset="utf-8" type="text/javascript" src="<%=path%>/vista/js/Geolocalizacion.js" charset="utf-8"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA9o6UZf4j1MnKBZU3vcsVb1TrZbN2tlWg"></script>

    </head>
    <body>
        <br>
        <div class="container">
            <div class="jumbotron">
                <h1 class="display-4">¡Obtener mi ubicación!</h1>
                <p class="lead">Práctica con el uso de la API de Google Maps</p>
                <hr class="my-4">
                <button type="button" onclick="obtenerUbicacion()" class="btn btn-dark font-weight-bold">Obtener mi ubicación</button>
            </div>

            <hr class="my-4">
            <br> 
            <div id="contenedorMaps">

            </div>
        </div>



        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
