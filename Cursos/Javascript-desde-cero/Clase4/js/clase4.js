/*var productos = [
    { 'nombre': 'mouse', 'precio': 250, 'marca': 'logitech'},
    { 'nombre': 'monitor', 'precio': 500, 'marca': 'philips'},
    { 'nombre': 'teclado', 'precio': 250, 'marca': 'logitech'},
    { 'nombre': 'microfono', 'precio': 50, 'marca': 'blue'}

];

function mostrarTabla() {
    var info = "<tr><th>Nombre</th><th>Precio</th><th>Marca</th></tr>";
    for(var i = 0; i < productos.length; i++){
        info +="<tr><td>" + productos[i].nombre + "</td><td>" + productos[i].precio + "</td><td>" + productos[i].marca + "</td></tr>";
    }
    var tabla = document.getElementById("tabla");
    tabla.innerHTML = info;
}

mostrarTabla();
function agregarDato(){
    var nombre = document.getElementById("nombre").value;
    //console.log(nombre.id);
    var precio = document.getElementById("precio").value;
    var marca = document.getElementById("marca").value;
    productos.push({ 'nombre': nombre, 'precio': precio, 'marca': marca });
    mostrarTabla();
}
let boton = document.querySelector("button");//como no le puse id lo traigo por el nombre de la etiqueta
boton.onclick = agregarDato;
*/

//EJERCICIO BOMBILLA

function encender(){
    document.getElementById('imagen').src = 'img/on.gif';
}

function apagar(){
    document.getElementById('imagen').src = 'img/off.gif';
}

var botonE = document.querySelector('#be');
botonE.onclick = encender;



var botonA = document.querySelector('#ba');
botonA.onclick = apagar;


/*
function cambiarColor(){
    let cajita = document.getElementById("caja");
    cajita.style.backgroundColor = color;

}
*/

//CREAR ELEMENTOS EN EL DOM
/*
let div = document.createElement('div');//paso 1 crear elemento
div.innerHTML = '<p>Soy un elemento nuevo</p>';//paso 2 opcional
document.body.appendChild(div);//paso 3 confirmar el lugar

const menu = document.querySelector("#menu");
let li = document.createElement('li');
li.innerText = 'empanadas';
menu.appendChild(li);
li = document.createElement('li');
li.innerText = 'asado';
menu.appendChild(li); 


function mostrarInfo(){
    var par = document.createElement("p");
    par.innerHTML = "El martes es el segundo o tercer dia de la semana, segun el pais o cultura. Sigue al lunes y precede al miercoles."
    document.body.appendChild(par);
}
*/

/*
let a = document.createElement("a");
a.innerText = "Visitar web";
let p = document.querySelector("#p");
p.appendChild(a);
a.href = "https://www.educacionit.com/"
a.target = "blank";
*/

/*
crear una fila con 3 columnas con texto dentro de una tabla existente

let tabla = document.querySelector("#tabla");
let fila = document.createElement("tr");
tabla.appendChild(fila)
let columna = document.createElement("td");
columna.innerText = "Azul";
fila.appendChild(columna);
*/


/*//con un bucle
let tabla = document.querySelector("#tabla");
let fila = document.createElement("tr");
tabla.appendChild(fila)
let textos = ['Azul', 'Verde', 'Rosado'];
for (var i = 0; i < textos.length; i++){
    columna = document.createElement("td");
    columna.innerText = textos[i];
    fila.appendChild(columna);
}
*/