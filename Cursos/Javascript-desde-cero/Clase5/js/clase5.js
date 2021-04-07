//var titulo = $(".titulo").text();
//alert(titulo);
/*
$("h1").text('Hola Jquery');
$('#aparece').click(aparecer);
$('#desaparece').click(desaparecer);
function aparecer(){
    //$('div').show();
    $('div').fadeIn();

}
function desaparecer(){
    //$('div').hide();
    $('div').fadeOut();
}
*/
/*
(function(){
    $("#boton").click(function(){
        $("#panel").slideToggle("slow");
    });
});

$(function(){
    $("button").click(function(){
        $("#cajitaAnimada").animate({ left: '250px' });
    });
});

var fun = () =>{
    console.log("Soy la funcion flecha");
}

var fun = (nombre) =>{
    return "Soy " + nombre;
}

var fun3 = edad => "Mi edad es " + edad;
fun();
console.log(fun2("Sofia"));    
*/

//SETINTERVAL
/*
setInterval(function(){
    alert("hello");
}, 3000);
*/
/*
function activar() {
    var barra = document.getElementById("caja2");
    var ancho = 1;
    setInterval(rellenar, 500)
    function rellenar(){
        if (ancho != 100){
            ancho++;
            barra.style.width = ancho + '%';
        }
    }
}

let abc = "A B C D E F G H I J K L M N Ñ O P Q R S T U V W X Y Z"
let parrafo = document.createElement("p");
parrafo.innerText = "Abecedario: ";
let header = document.querySelector("header");
header.appendChild(parrafo);
let x = 0;
setInterval(()=>{
    if (x < abc.length) {
        parrafo.innerText += abc[x];
        x++;
    }else{
        parrafo.innerText = "";
        x = 0;
    }
},50)
*/


var nro1 = 10 - 8 / 2 - 6;
var nro2 = nro1 + 1;
console.log(nro1/nro2)
