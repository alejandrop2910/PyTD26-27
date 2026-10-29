package Secuenciales;

import java.util.Scanner; // Importa la clase "Scanner"

public class Input {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); //
        System.out.print("Introduzca el primer número:"); // Imprime un mensaje que le pide un primer número al usuario
        int int1 = input.nextInt();
        System.out.print("Introduzca el segundo número:"); // Imprime un mensaje que le pide un segundo número al usuario
        int int2 = input.nextInt();
        int suma = int1 + int2; // Declaramos variable que sume "int1" e "int2"

        /* Código simple:
        System.out.print("Resultado:");
        System.out.print(suma);
         */

        // Código optimizado:
        System.out.print("Resultado: " + suma);
    }
}
