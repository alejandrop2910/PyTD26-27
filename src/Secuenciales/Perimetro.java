package Secuenciales;

import java.util.Scanner;

public class Perimetro {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la longitud: ");
        int width = input.nextInt();
        System.out.println("Introduzca la altura: ");
        int height = input.nextInt();
        int perimetro = height + height + width + width;
        System.out.println("Resultado: " + perimetro + " cm");

    }
}
