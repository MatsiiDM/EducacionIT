/*
var p = document.getElementById("p1");
let a = document.createElement("a");
a.innerText = "Visitar al sitio web de ...";
p.appendChild(a);
a.href="https://www.educacionit.com/";
a.target="blank";
*/

//crear dentro de una etiqueta existente, varios item con contenido
/*
<ol>
    <li>item</li>
</ol>
*/

/*
const ul = document.querySelector("ul");
var items = ["uno","dos","tres","cuatro"]

for (var i = 0;i < items.length; i++){
    let li = document.createElement("li");
    li.innerHTML = items[i];
    ul.appendChild(li)
}
*/

/*
let li = document.createElement("li");
li.innerText = "uno";
ul.appendChild(li);

let li = document.createElement("li");
li.innerText = "dos";
ul.appendChild(li);

let li = document.createElement("li");
li.innerText = "tres";
ul.appendChild(li);

let li = document.createElement("li");
li.innerText = "cuatro";
ul.appendChild(li);
*/

//crear una tabla con contenido. 4 columnas
/*
let tabla = document.createElement("table");
var tab = document.querySelector("#table1");
let tr = document.createElement("tr");
var num = ["uno","dos","tres","cuatro"]
num.forEach(element => {
    let td = document.createElement("td");
    td.innerText = element;
    tr.appendChild(td);
    
});
tab.appendChild(tr);

//dos parametros (la accion, tiempo del bucle(milisegundo))
setInterval(function(){
    //alert("Hello");
}, 3000);
*/

// -> listener(oyente, pendiente de que pase un evento)

/*
function activar(){
    var barra = document.getElementById("caja2");
    var width = 0;
    setInterval(rellenar,100);
    function rellenar(){
        if (width<100){
            width++;
            barra.style.width = width + "%";
        }
        
    }
}

function mostrarMas(){
    var div = document.getElementById("mas");
    var p = document.createElement("p");
    p.innerText = " Lorem ipsum dolor sit, amet consectetur adipisicing elit. Nihil, vel optio beatae quae dolore obcaecati veniam est aspernatur reiciendis quasi itaque. In esse voluptatem, ab doloremque enim magnam cum soluta.";
    div.appendChild(p);
}

var btn = document.querySelector("#mostrar");
btn.onclick = mostrarMas;
*/

/*
var btn = document.querySelector("#mostrar");
btn.addEventListener("click", function(){
    var div = document.getElementById("mas");
    var p = document.createElement("p");
    p.innerText = "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Nihil, vel optio beatae quae dolore obcaecati veniam est aspernatur reiciendis quasi itaque. In esse voluptatem, ab doloremque enim magnam cum soluta."
    div.appendChild(p);
});
*/

/*
Propagacion
bubbling: false -> tocar primer al tag mas especifico
capturing: true -> tocar primero al tag menos especifico
*/

/*
var padre = document.getElementById("padre");
var hijo = document.getElementById("hijo");
var nieto = document.getElementById("nieto");
nieto.addEventListener("click", function (e) {
    e.stopPropagation();//evita la propagacion
    console.log("soy el nieto");
}, false);
padre.addEventListener("click", function(){
    console.log("soy el padre");
}, false); 
*/

/*
window.addEventListener("resize", function(){
    console.log(window.outerWidth);
    if (window.outerWidth > 400) {
        document.body.style.backgroundColor = "red";
    }else{
        document.body.style.backgroundColor = "green";

    }
});
*/

var es = document.getElementById("es");
es.addEventListener("click", () => {
    var din = document.createElement("button");
    din.innerText = "dinamico"
    document.body.appendChild(din)
});
document.addEventListener("click", (e)=>{
    console.log(e.target.id);
    if(e.target.id=="din"){
        console.log("Soy el boton dinamico");
    }
});