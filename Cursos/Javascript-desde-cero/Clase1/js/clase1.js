//alert('Hola externo');
document.write('Hola document');
console.log('Hola consola');
/*
VARIABLES
number(int,float,double), string, boolean(true,false), 
undefined, array, object
var - let - const
sintaxis:
var identificador; //declarando
identificador = valor; //inicializando
o tambien
var identificador = valor; //dos paso en uno
identificador = valor2;
identificador = valor3;
*/

/*var nombre = 'Maxi';
console.log(nombre);
var edad = 26;
console.log(edad);
edad = 22;
console.log(edad);
var precio = 25.6;
console.log(precio);
var resultado = true;
console.log(resultado);
var X;
alert('Hola ' + nombre + ' tu edad es ' + edad);//concatenar
console.log(2 + 5);
console.log('5' + 2);
//operadores aritmeticos: + - * / %(modulo trae el resto)
var num1 = 10;
var num2 = 20;
console.log(num1 * num2);
var suma = num1 + num2;
console.log(suma);
console.log(5 % 2);
num1 += 50;// num1 = num1 + 50; *= /= %=
num2++;// num2 = num2 + 1; --
//operadores relaciones < > <= >= == !=
document.write(num1 < num2);
//operadores logicos && (and) || (or)
/*
TRUE && TRUE = TRUE
TRUE && FALSE = FALSE
FALSE && TRUE = FALSE
FALSE && FALSE = FALSE

FALSE || FALSE = FALSE
FALSE || TRUE = TRUE
TRUE || FALSE = TRUE
TRUE || TRUE = TRUE
*/

var a = true, b = false;
console.log(a || b);
console.log(a && b);
var correo = window.prompt('Escribe tu correo');
document.write('tu email es ' + correo);
var num1 = window.prompt('Escribe un numero');
var num2 = window.prompt('Escribe otro numero');
var result = num1 + num2;
alert(result);
var novela = window.confirm('Che seguro que quieres?');
document.write(novela)




var num = 20;
//si mi numero es menos que 100
if (num < 100){
    document.write("si es menor");
}else {
    document.write("no es menor ");
}

//solicitar un numero al usuario y decir si es par o impar
var x = parseInt(window.prompt)