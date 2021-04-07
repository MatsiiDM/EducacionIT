// tenemos 3 numeros, determinar el mayor
/*
var num1 = 20;
var num2 = 10;
var num3 = 5;
if(num1 > num2 && num1 > num3){
    document.write("El numero mayor es " + num1);
}else if(num2 > num1 && num2 > num3){
    document.write("El numero mayor es " + num2);
}else if(num3 > num1 && num3 > num2){
    document.write("El numero mayor es " + num3);
}
*/

//boliche entre 18 y 25, 21 tienen bebida gratis
//debemos decir porque no puede pasar
/*var edad = parseInt(window.prompt('Edad para entrar al boliche'));
if(edad >= 18 && edad <= 25){
    document.write('Bienvenido, puede pasar ;)');
    if(edad == 21){15
        document.write('<br>Tienes una bebida gratis!!');
    }
}else{;
    document.write('Ups! no puedes pasar :(');
    if(edad < 18){
        document.write('<br>por bebito');
    }else{
        document.write('<br>por viejito');
    }
}
*/

/*
var nombre = window.prompt('Introduce tu nombre');
var horasTrabajadas = parseInt(window.prompt('Cuantas horas trabajaste?'));
var salario;
if(horasTrabajadas <= 40){
    salario = horasTrabajadas * 16;
    document.write(nombre + ' tu salario es: ' + salario);
}else{
    salario = 640;
    salario = salario + ((horasTrabajadas-40) * 20);
    document.write(nombre + ' tu salario es: ' + salario);
}
*/


//Proyecto Integrador
//LABORATORIO
/*var rol = window.prompt('Cual es su rol');
if(rol == 'admin' || rol == 'recursos'){
    var clave = window.prompt('Cual es su clave?');
    if(clave == 1234){
        var usuario = window.prompt('Cual es su usuario?');

    }


}
*/

/*

switch(variable){
    case valor:
        ...instrucciones;
        break;
    case valor2:
        ...instrucciones;
        break;
    case valor3:
        ...instrucciones;
        break;
    default:
        ...instrucciones;
        break;
}

*/
/*
var dia = 'miercoles';
switch(dia){
        case 'lunes':
            document.write('Hoy es lunes de inicio');
            break;
        case 'martes':
            document.write('Hoy es martes de helado');
            break;
        case 'miercoles':
            document.write('Hoy es miercoles, mitad de semana');
            break;
        case 'jueves':
            document.write('Hoy es jueves de asado');
            break;
        case 'viernes':
            document.write('Hoy es viernes de fiesta');
            break;
        default:
            document.write('Llego el fin de semana, a bailar!');
            break;
}
*/


//MANEJO DEL DOM
var titulo = document.querySelector("h1");
//var titulo = document.querySelector("#titulo");
//var titulo = document.getElementById("titulo");
//var titulo = document.querySelector(".titu");
//var titulo = document.getElementsByClassName("titu")[0];
//alert(titulo.innerHTML);

/*
console.log(titulo);
titulo.innerHTML = "Hola soy Javascript";
titulo.style.color = "red";
titulo.style.backgroundColor = "lightpink";
titulo.style.border = "1px solid blue";
titulo.style.padding = "10px";
*/

//FECHAS
/*
var fecha = new Date();
var hoy = fecha.getDay();
var hoy = fecha.getFullYear();
var hoy = fecha.getDate();

var dia = fecha.getDate();
var mes = fecha.getMonth() + 1;
var anio = fecha.getFullYear();
console.log(`hoy es ${dia} / ${mes} / ${anio}`);
*/


//WHILE

/*
while(condicion){
    ...instrucciones
    ajuste
}
*/
var num = 1;
while (num<=10){
    document.write("Ganaste");
    num++;//num = num + 1;
}
//num = 1 
//impre Ganaste
//num = 2
//.... asi sucesivamente hasta num igual a 10







/*
Realizar un sistema de caja para una farmacia
(juntar las estructuras)
*/