package clase03;
import java.util.Scanner;

public class JuevesClase3 {
    
    
    public static void main(String[] args) {
        
/*
        int num = 1;
        while(num<=10){
            System.out.println(num);
            num++;// num = num + 1;
        }
        //num = 11
        //pantalla = 1 2 3
       
        
        //imprimir los numeros del 500 al 400
        //de 5 en 5
        int num2 = 500;
        while (num2 >= 400){
            
            if(num2 != 465 && num2 !=420){
               System.out.println(num2); 
            }
            num2 -= 5;
        }
*/
        
/*
        do{
            instrucciones
            ajuste
        }while(condiciones);
*/
    	
/*
        int num3 = 2;
        do {
            System.out.println(num3);
            num3 += 2;
        } while (num3 <= 20);
*/
    	
/*		
        for(inicio;condicion;ajuste){
            intrucciones
        }
 */
/*
        for (int i = 5; i < 11; i++){
            System.out.println(i);
        }
*/      
/*
        solicitar al usuario desde el teclado dos numeros,
        realizar un for con esos datos,
        mostra las suma de todos esos numeros
*/
/*
    	Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingresa otro numero mayor");
        int num2 = teclado.nextInt();
        int menor, mayor, suma = 0;
        if (num1 < num2){
            menor = num1;
            mayor = num2;
        }else{
            mayor = num1;
            menor = num2;
        }
        for (int i = menor; i < mayor; i++){
            System.out.println(i);
            suma += i; 
        }
        System.out.println("La suma es: " + suma);
*/        
/*    	
    	for(int i = 1; i < 8; i++) {
            if(i % 2 == 0) {
                System.out.println("@@");
            } else {
                System.out.println("@");
            }
    	}
*/    	
/*
        String arroba = "";
        for(int i = 1; i < 7; i++){
            arroba +="@"; 
            System.out.println(arroba);
        }
*/

/*
        mostrar las tabls de multiplicar
        1 x 1 = 1
        1 x 2 = 2
*/
/*
        for(int i = 1;i <= 10;i++ ){
            for(int x = 1;x <= 10;x++){
                System.out.println(i + " x " + x + " = " + (i*x));
                
            }
            System.out.println("****************");
        }
*/

/*
        el usuario escribe los puntos que acumula, dar un premio
        de  acuerdo a la cantidad de puntos, tenga 3 oportunidades
*/


//LABORATORIO:
/*
        Scanner teclado = new Scanner(System.in);
        int i = 1, numero = 0,  mayor = 0, menor = 1000;
        while (i <= 5){
            System.out.println("Escribe un numero");
            numero = teclado.nextInt();
            if (numero < menor){
                menor = numero;
            }
            if(numero>mayor){
                mayor = numero;
                
            }
            i++;
        }
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
*/
/*
programa de un supermercado
1 arroz 2 harina 3 azucar 4 galletas 5 saltas
*/
        Scanner teclado = new Scanner(System.in);
        int arroz = 50, harina = 40, azucar = 10;
        int opc = 0, x = 1;
        double suma = 0;
        int cArroz = 0, cHarina = 0, cAzucar = 0;
        int sArroz = 0, sHarina = 0, sAzucar = 0;
        do {
            System.out.println("AUTOMERCADO LOS JAVA\n" 
                    + "Seleccione el producto para el carrito\n" 
                    + "\t1-arroz\n\t2-harina\n\t3-azucar\n"
                    + "\t6-finalizar compra");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Escribe la cantidad de arroz");
                    cArroz = teclado.nextInt();
                    cArroz += cArroz;
                    sArroz = arroz * cArroz;
                    break;
                case 2:
                    System.out.println("Escribe la cantidad de harina");
                    cHarina = teclado.nextInt();
                    cHarina += cHarina;
                    sHarina = harina * cHarina;
                    break;
                case 3:
                    System.out.println("Escribe la cantidad de azucar");
                    cAzucar = teclado.nextInt();
                    cAzucar += cAzucar;
                    sAzucar = azucar * cAzucar;
                    break;
                default:
                    System.out.println("No existe el codigo del producto");
                    break;
            }
            System.out.println("Desea seguir comprado? 1-si 2-no" );
            x = teclado.nextInt();
        } while (x == 1);
          suma=suma + sArroz + sHarina + sAzucar;
          System.out.println("Factura:\n" 
                  + "Arroz, " + cArroz + " subtotal " + sArroz 
                  + "\nHarina, " + cHarina + " subtotal " + sHarina
                  + "\nAzucar, " + cAzucar + " subtotal " + sAzucar
          );
          if (suma > 200){
              suma = suma * 1.05;
          }
          System.out.println("El total de la suma: " + suma);









    }
}
