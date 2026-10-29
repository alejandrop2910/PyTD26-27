package Condicionales;

import java.util.Scanner;

public class Discoteca {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        byte age = input.nextByte();
        if (age >= 18) {
            System.out.println("Es mayor de edad, puede pasar.");
        }
        else {
            System.out.println("Es menor de edad, no puede pasar.");
        }
    }
}