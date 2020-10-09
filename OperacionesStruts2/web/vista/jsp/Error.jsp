<%-- 
    Document   : Error
    Created on : 8/10/2020, 09:39:06 AM
    Author     : Hector Saldaña
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
            <h1 class="display-4"><s:property value="resultado"/> </h1>         
            <hr class="my-4">            
            <h1 class="text-center text-danger" style="font-size: 10em">>_<</h1>
            <hr class="my-4"> 
            <a class="text-center" href="javascript: history.go(-1)"><button type="button" class="btn btn-dark text-center btn-block font-weight-bold">Regresar</button></a>
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
