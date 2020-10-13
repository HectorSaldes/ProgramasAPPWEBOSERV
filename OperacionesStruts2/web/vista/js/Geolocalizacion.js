
function obtenerUbicacion() {
    //console.log("Jala a la petición");
    var resultado = document.getElementById("contenedorMaps");
    if (navigator.geolocation) {
        alert("Tu navegador SÍ soporta Geolocalización :)");
    } else {
        alert("Tu navegador NO soporta Geolocalización :(");
    }

    function localizacion(poscicion) {
        var latitud = poscicion.coords.latitude;
        var longitud = poscicion.coords.longitude;
        alert("Latitud: " + latitud + " | Longitud: " + longitud + "");
        var imgUbicacion  = "https://maps.googleapis.com/maps/api/staticmap?center="+latitud+","+longitud+"&size=700x400&markers=color:red%7C"+latitud+","+longitude+"";
    }
    
    function error(){
        resultado.innerHTML = "<p> No se pude obtener tu ubicacion actual :(</p>";
    }
    
    navigator.geolocation.getCurrentPosition(localizacion,error);
}
