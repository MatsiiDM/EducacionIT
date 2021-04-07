package clase01;

public class Clase01 {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        /* 
            1)tipo identificador; declarando una variable
            2)idenficiador = valor; inicializando una variable
            3)otra opcion todo junto;
            tipo identificador = valor;
            4)identificador = Otrovalor;
        */
        
        
        //1) Una variable puede ser declada por unica vez su tipo pero su valor puede ir cambiando
            byte edad;
            edad = 19;
            System.out.println(edad);
            edad = 20;
            System.out.println(edad);
            edad = 21;
            System.out.println(edad);
        
        //2)
            short numero = 12000;
            System.out.println(numero);
            int x = 12345678;
            System.out.println(x);
         //DECIMALES
         double c = 25.5;
         float d = 32.4f;
         System.out.println(c);
         System.out.println(d);
            
        //BOOLEANO VERDADERO Y FALSO
            boolean resultado = true; //false
            System.out.println(resultado);
            char e = 'P';//tipo caracter
            String nombre = "Austry";// para cadena de caracteres
            
        //OPERADORES ARITMETICOS + + * / #
            System.out.println(2+3);
            int num1 = 250;
            int num2 = 300;
            System.out.println("La suma es "+ (num1 + num2));//Los parentesis permiten que se haga la operacion de suma y seguido la concadenacion
            int suma = num1 + num2;
            System.out.println(suma);
            System.out.println("La suma es " + num1 * num2 );
            System.out.println(5 % 2);
        //OPERADORES RELACIONALES <> <= >= == !=
            System.out.println(num1 < num2);
            System.out.println(num1 != num2);
        //OPERADORES LOGICOS &&(and) || (or)
            boolean x1 = true;
            boolean x2 = false;
            System.out.println(x1=x2);
        
        
        /*
        'y' logico:
            TRUE && TRUE = TRUE
            TRUE && FALSE = FALSE
            FALSE && TRUE = FALSE
            FALSO && FALSO = TRUE
        'o' logico:
            FALSE || FALSE = FALSE
            FALSE || TRUE = TRUE
            TRUE || FALSE = TRUE
            TRUE || TRUE = TRUE
            
        */
            
            
            
            
            
            

        
    }
    
}
