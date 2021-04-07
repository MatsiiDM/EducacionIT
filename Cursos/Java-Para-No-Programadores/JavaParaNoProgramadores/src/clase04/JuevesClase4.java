package clase04;

import java.util.Scanner;

public class JuevesClase4 {

    public static void main(String[] args) {
        /*
        DECLARAR:
            tipo_dato [] identificador;
            tipo_dato identificador [];
        INICIALIZAR:
            identificador = new tipo_dato [tamano];
        DECLARAR E INICIALIZAR:
            tipo_dato [] identificador = new tipo_dato [tamano];
        OTRA FORMA:
            tipo [] identificador = {valor,valor,valor}
         */
 /*
        int[] numeros = new int[5];
        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 10;
        numeros[3] = 5;
        numeros[4] = 8;
        System.out.println(numeros[2]);
        numeros[2] = 100;
        System.out.println(numeros[2]);
        String nombres[] = {"Cesar", "Alejandro", "Julian", "Martin"};
        System.out.println(nombres[1]);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("*********************************");
         */
 /*
            informar el minimo y el maximo    
         */
 /*
        int arreglo[] = {1, 3, 4, 5, 6};
        int min = arreglo[0];
        int max = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }
        System.out.println("El maximo es " + max + " y el min es: " + min);
         */
 /*
        System.out.println("*********************************");
        /*
            crear un arreglo de tamano 100,
            debemos rellenar con los numeros 1 al 100
            mostrar el arreglo;
            informar la suma de todos los numeros y su promedio
         */
 /*
        int valores[] = new int[100];
        int suma = 0;
        for (int i = 0, j = 1; i < valores.length; i++, j++) {
            valores[i] = i + 1;
            System.out.println(valores[i]);
            suma += valores[i];

        }
        System.out.println("La suma es " + suma);
        System.out.println("El promedio es " + suma / valores.length);
        System.out.println("*********************************");
         */
 /*
            crear un arreglo con diferentes comidas
            crear otro arreglo y copiar todos los elementos del primero 
         */
 /*
        String comidas[] = {"empanadas", "milanesas", "asado", "ensalada", "arepa"};
        String comidasCopia[] = new String[comidas.length];
        //for(int i = 0; i < comidas.length; i++){
        //  comidasCopia[i] = comidas[i];

        //}
         */
 /*
        System.arraycopy(comidas, 0, comidasCopia, 0, comidas.length);
        System.out.println("La comida es: ");
        for (int i = 0; i < comidas.length; i++) {
            System.out.println(comidas[i]);
        }
        System.out.println("La comida copia es: ");
        for (int i = 0; i < comidasCopia.length; i++) {
            System.out.println(comidasCopia[i]);
        }
        System.out.println("*********************************");
         */
 /*
            solicitar al usuario un numero final
            crear un arreglo con tamano del numero
            mostrar en pantalla los numeros de 1 hasta numero
         */
        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Escriba un numero para el tamano del arreglo");
        int tam = teclado.nextInt();
        int num[] = new int[tam];
        for (int i = 0, j = 1; i < tam; i++, j++) {
            num[i] = j;
            System.out.println(num[i]);
        }
        System.out.println("*********************************");
         */
 /*
        int datos[] = {25, 40, 36, 36, 96, 45, 25, 36, 2, 112, 48};
        //determinar la cantidad de veces que se repite el numero 36
        int cont = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == 36) {
                cont++;
            }
        }
        System.out.println("La cantidad de veces que se repite 36 en el arreglo es: " + cont);
         */
 /*
        CREAR UN ARREGLO CON LOS NUMEROS DEL 1 AL 50
        MOSTRAR CUALES SON PARES Y CUALES IMPARES
         */
 /*
        int datos2[] = new int[50];
        for (int i = 0; i < datos2.length; i++) {
            datos2[i] = i + 1;
            System.out.println(datos2[i]);
            if (datos2[i] % 2 == 0) {
                System.out.println("Par -> " + datos2[i]);
            } else {
                System.out.println("Impar - > " + datos2[i]);
            }
        }
         */
 /*
        carrera de atletismo
        crear un arreglo para almacenar el tiempo
        crear otro arreglo para los nombres
        el usuario debe especificar cuantos atletas
        vas a participar
        mostrar el atleta con menos tiempo
         */
 /*
        System.out.println("Escribe la cantidad de atletas");
        int cant = teclado.nextInt();
        String atletas[] = new String[cant];
        double tiempo[] = new double[cant];
        double min = 100;
        int ganador = 0;
        for (int i = 0; i < cant; i++) {
            System.out.println("Escribe el nombre del atleta");
            atletas[i] = teclado.next();
            System.out.println("Escribe el tiempo en el llego a la meta");
            tiempo[i] = teclado.nextDouble();
        }
        for (int i = 0; i < cant; i++) {
            if (tiempo[i] < min) {
                min = tiempo[i];
                ganador = i;

            }
        }
        System.out.println("El atleta ganador es " + atletas[ganador] + " en un tiempo de " + min);
        /*
        tienda de artefactos: plancha, licuadora, lavadora, cocina
        el usuario indica lo que desea comprar y la cantidad
        si la compra supera X monto recibe un descuento X%
         */
        String artefactos[] = {"plancha", "licuadora", "lavadora", "cocina"};
        double precios[] = {400, 300, 1000, 900};
        int cantidad[] = new int[artefactos.length];
        double subtotal[] = new double[4];
        double total = 0;
        do {
            System.out.println("*****TIENDA GLUGLU*****\n"
                    + "Que desea comprar?\n\t1) Plancha\n\t2) Licuadora"
                    + "\n\t3) Lavadora\n\t4 Cocina");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escribe la cantidad de planchas");
                    opcion -= 1;
                    cantidad[opcion] = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("Escribe la cantidad de licuadoras");
                    opcion -= 1;
                    cantidad[opcion] = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("Escribe la cantidad de lavadoras");
                    opcion -= 1;
                    cantidad[opcion] = teclado.nextInt();
                    break;
                case 4:
                    System.out.println("Escribe la cantidad de cocina");
                    opcion -= 1;
                    cantidad[opcion] = teclado.nextInt();
                    break;
                default:
                    System.out.println("No existe esa opcion");
                    break;
            }
            for (int i = 0; i < 4; i++) {
                subtotal[i] = precios[i] * cantidad[i];
                total += subtotal[i];
            }
            System.out.println("El total a pagar es " + total);
        }


    }
