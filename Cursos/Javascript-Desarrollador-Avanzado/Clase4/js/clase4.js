//Asincronia: AJAX javascript asincrono y xml --> Objeto XHR(XMLHttpRequest)
/*
setTimeout(()=>{
    console.log("codigo asincrono");
},4000);
console.log("codigo sincrono");
*/
/*
Podemos trabajar con:
-XML extensible de html
-JSON formato notacion de objeto
-HTML

paso 1: crear el objeto
paso 2: abril el archivo
paso 3: cargar
paso 4: ejecutar
opci paso 5: verificar el status
paso 6: mostrar
*/
//Ejemplo 1
/*
var conten = document.querySelector("#conten");
conten.innerText = "Cargando...";
setTimeout(()=>{
    //AJAX
    var ajax = new XMLHttpRequest();//1
    //Metodos: get (leer), post (enviar), delete (borrar),put (actualizar)
    ajax.open("get","archivo.txt");//2
    ajax.onload = cargarDatos;//3
    ajax.send();//4
    function cargarDatos(){
    if (ajax.status == 200){
        console.log(ajax.responseText);
        conten.innerText = ajax.responseText
    }else {
        conten.innerText = "contenido no disponible :("
    }

}
},4000)
*/
//Ejemplo 2
/*
var ajax = new XMLHttpRequest;//1
ajax.open("get","archivo.json");//2
ajax.onload = ()=>{
    if (ajax.status == 200){
        console.log("Antes:");
        console.log(ajax.responseText);

        var productos = JSON.parse(ajax.responseText);
        console.log("Ahora:");
        console.log(productos);
        for(var i = 0; i < productos.length; i++){
            var lista = document.createElement("ul");
            var item = "<li>Nombre: " + productos[i].nombre + "</li><li>Apellido: " + productos[i].apellido + "</li><li>Edad: " + productos[i].edad + "</li><li>Salario: " + productos[i].salario + "</li>" ;
            lista.innerHTML = item;
            document.body.appendChild(lista)
        }
    }
}
ajax.send();
*/

//Ejemplo 3
let btn = document.querySelector("button");
btn.addEventListener("click",()=>{
    let xhr = new XMLHttpRequest();
    xhr.open("get","plantilla.html");
    xhr.addEventListener("load",()=>{
        if (xhr.status == 200){
            let plantilla = xhr.response;
            console.log(plantilla);
            let div = document.createElement("div");
            div.innerHTML = plantilla;
            document.body.appendChild(div);
        }
    })
    xhr.send()
})