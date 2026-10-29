package Condicionales;

import java.util.Scanner;

public class Maximo {
    static void main() {
        Scanner input = new Scanner(System.in);
        // Entradas
        System.out.print("Introduzca el primer número: ");
        byte num1 = input.nextByte();
        System.out.print("Introduzca el segundo número: ");
        byte num2 = input.nextByte();
        // Condicionales
        if (num1 > num2) {
            System.out.println("El número más grande es: " + num1);
        }
        else if (num2 > num1) {
            System.out.println("El número más grande es: " + num2);
        }
        else if (num1 == num2)
            System.out.println("Los números son iguales.");
        }
    }
