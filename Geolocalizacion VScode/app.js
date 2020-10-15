let map;

function mostrarMapa() {
    //PINTA EL MAPA DEL API QUE USAMOS  
    document.getElementById('btnMostrarUbicacion').style.display = 'block';
    document.getElementById('slcMostrarLugares').style.display = 'block';
    map = L.map('divMapa').fitWorld();
    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(map);
}

function mostrarUbicacionActual(latitud, longitud) { //
    //let latitud = "19.447463", longitud = "-99.125766"; COORDENADAS DE TEPITO

    

    var cadenaUbicacion = latitud + "," + longitud;
    let coords = cadenaUbicacion.split(",");
    L.marker(coords).addTo(map);
    map.flyTo(coords, 18);
    var popup = L.popup().setLatLng([latitud, longitud]).setContent("¡Aquí te encuentras!").openOn  (map);  //SE TIENE QUE ENVIAR UN ARREGLO
}

function obtenerUbicacionActual() {
    let latitud, longitud ;
    function obtenerCoordenadas(poscicion) {
        latitud = poscicion.coords.latitude;
        longitud = poscicion.coords.longitude;
        mostrarUbicacionActual(latitud, longitud);
    }

    function error() {
        alert("Hubo un error, al obtener la ubicación actual.");
    }

    navigator.geolocation.getCurrentPosition(obtenerCoordenadas, error);
}


