//arreglos

/*
var nombres = new Array ('Jeremias', 'Luciano', 'Ale', 'Cesar');
console.log(nombres[1]);
var edad = [20, 5, 4, 10, 8, 2, 12, 21, 1];
console.log(edad[3]);
var datos = ['Juan', 10, 80.2, true];
console.log(datos.length);
var tam = edad.length;
for(var i=0; i<tam; i++){
    console.log(edad[i]);
}
*/

/*
carrera: solicitar nombres de los atletas, tiempo. El atleta cn menos


var atletas = ["Ale", "Cinthia", "Erica", "Ignacio", "Julian"];
var tiempo = [20, 15, 8, 12, 11];
var menor = tiempo[0];
var ind = 0


for(var i = 0; i < tiempo.length; i++){
    if(tiempo[i] < menor ){
        menor = tiempo[i];
        ind = i;
    }
}
document.write("El ganador es: " + atletas[ind] + " con un tiempo de: " + menor)
*/

//funciones utiles para trabajar con arreglos
//var x = [20, 5 ,4];
//x.push(100);//agregar al final el arreglo
//x.unshift(100);//agregar al principio
//x.pop();//elimina al final
//x.shift();
//x[1] = 1;
//x.splice(1, 0, 1);//indice, cantidad a borrar, el nuevo dato
//console.log(x);//elimina al principio

/*/
var persona1 = ['leer', 'programar', 'comer', 'bailar'];
var persona2 = ['dormir', 'escribir', 'comer', 'programar'];
var actividades = [];
for(var i = 0; i < persona1.length; i++){
    for(var j = 0; j < persona2.length; j++){
        if(persona1[i] == persona2[j]){
            actividades.push(persona2[j]);
        }
    }
}
console.log(actividades);
*/

/*
solicitar al usuario el inicio y el limite,
crear el arreglo
mostrar el promedio de esos numero


var ini = parseInt(window.prompt('Escribe un numero para iniciar'));
var fin = parseInt(window.prompt('Escribe un numero para finalizar'));
var suma = 0;

if(fin < ini){5
    alert("ERROR el numero fin debe ser mayor");
}else{
    var num = [];
    for(var i = ini; i<= fin; i++){
        num.push(i);
        suma += i;
    }
}
console.log(num);
console.log(suma);5
console.log(num.length);
console.log("El promedio es " + suma/num.length);

*/

/*
//objetos -> clave:valor
let client = {'nombre':'Pedro','apellido':'Casanovas','edad':20};
console.log(cliente.nombre);
let clientes = [
    { 'nombre': 'Pedro', 'apellido': 'Casanovas','edad': 20 },
    { 'nombre': 'Ana', 'apellido': 'Perez','edad': 20 },
    { 'nombre': 'Juan', 'apellido': 'Castillo','edad': 20 },
    { 'nombre': 'Fulanito', 'apellido': 'De tal','edad': 500 }
];
console.log(clientes[1].apellido);
document.write(clientes[1].nombre + " " + clientes[1].apellido);
*/

//funciones 
//funciones sin parametros


/*
var nombre, contrasena;

function usuario(){
    var usuario = window.prompt("Por favor, ingrese el usuario");
    return usuario;
}
function clave(){
    var pass = parseInt(window.prompt("Por favor, ingrese la clave"));
    return pass;
}
function validar(nombre, contrasena){
    if((nombre == "Luciano") && (contrasena == 1234)){
        window.location.href = 'ingreso.html';
    }else{
        alert("Usuario o clave incorrecta");
    }
}
nombre = usuario();
contrasena = clave();
validar(nombre, contrasena);
*/