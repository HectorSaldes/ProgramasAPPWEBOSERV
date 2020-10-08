<%-- 
    Document   : Operaciones
    Created on : 8/10/2020, 09:17:14 AM
    Author     : Hector Saldaña
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Operaciones</title>
    </head>
    <body>
        <br><br>
        <div class="jumbotron container"> 
            <h1 class="display-4">Calculadora Básica</h1>
            <p class="lead">Podra realizar cualquier operación solo con presionar el botón respecto a la operación</p>
            <hr class="my-4">
            <form action="calcular" method="GET">
                <div class="form-group row">
                    <label for="numero1" class="col-sm-3 col-form-label text-center">Número 1:</label>
                    <div class="col-sm">
                        <input type="number" class="form-control" name="numero1" id="numero1" placeholder="#" autofocus step="any" > 
                    </div>
                </div>
                <div class="form-group row">
                    <label for="numero2" class="col-sm-3 col-form-label text-center">Número 2:</label>
                    <div class="col-sm">
                        <input type="number" class="form-control" name="numero2" id="numero2" placeholder="#" step="any">
                    </div>
                </div>

                <hr class="my-4">
                <div class="row">                
                     <div class="col">
                         <input type="submit" class="btn btn-success btn-block font-weight-bold" name="operacion" value="Suma"/>
                     </div>
                     <div class="col">
                         <input type="submit" class="btn btn-danger btn-block font-weight-bold" name="operacion" value="Resta"/>
                     </div>
                     <div class="col">
                         <input type="submit" class="btn btn-primary btn-block font-weight-bold" name="operacion" value="Multiplicación"/>
                     </div>
                     <div class="col">
                         <input type="submit" class="btn btn-warning btn-block font-weight-bold" name="operacion" value="Divición"/>
                     </div>
                                     
                </div>
            </form>
        </div>

        <div class="row">
            <div class="col">
                <p class="font-weight-light text-center">Hector Saldaña Espinoza - 4C- DSM -UTEZ</p>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
