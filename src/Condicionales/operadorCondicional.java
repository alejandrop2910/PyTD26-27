package Condicionales;
import java.util.Scanner;

public class operadorCondicional {
    static void main() {
        Scanner input = new Scanner(System.in);
        // Entrada
        System.out.print("Introduzca su edad: ");
        byte age = input.nextByte();
        // Operador condicional
        String message = (age >= 18) ? "mayor de edad." : "menor de edad.";
        System.out.println("Eres " + message);
    }
}