(function () {
    var etiquetaOp = document.getElementById("opCalculadora");
    var op = etiquetaOp.outerText;   
    var etiquetaResul = document.getElementById("resul");
    var resul = etiquetaResul.outerText;    
    if (op.startsWith("S"))
        etiquetaOp.style = "color:#28A745";
    if (op.startsWith("R"))
        etiquetaOp.style = "color:#DC3545";
    if (op.startsWith("M"))
        etiquetaOp.style = "color:#007BFF";
    if (op.startsWith("D"))
        etiquetaOp.style = "color:#FFC107";
   
    if(resul.length > 14)     
        etiquetaResul.style = "font-size: 10 em";
   
})();


