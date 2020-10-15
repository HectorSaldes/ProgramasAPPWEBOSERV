let map;
var latitud = "0";
var longitud = "0";
var mensaje = "";

function mostrarMapa() {
    //PINTA EL MAPA DEL API QUE USAMOS  
    document.getElementById('btnMostrarUbicacion').style.display = 'block';
    document.getElementById('lugar').style.display = 'block';
    map = L.map('divMapa').fitWorld();
    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(map);
}

function obtenerUbicacion() {
    var lugar = document.getElementById('lugar').value;
    console.log(lugar);
    switch (lugar) {
        case "mexico":
            latitud = "19.4642264"; longitud = "-99.1384055"; mensaje = "¡Estás en México";
            break;
        case "francia":
            latitud = "48.8589507"; longitud = "2.2770203"; mensaje = "¡Estás en Francia!";
            break;
        case "espania":
            latitud = "40.4381311"; longitud = "-3.8196205"; mensaje = "¡Estás en España!";
            break;
        default: alert("SELECCIONA UN LUGAR");
    }
    if (lugar == "mexico" || lugar == "francia" || lugar == "espania")
        mostrarUbicacion(latitud, longitud, mensaje);
}

function mostrarUbicacion() {
    var cadenaUbicacion = latitud + "," + longitud;
    let coords = cadenaUbicacion.split(",");
    L.marker(coords).addTo(map);
    map.flyTo(coords, 18);
    var popup = L.popup().setLatLng([latitud, longitud]).setContent(mensaje).openOn(map);
}


