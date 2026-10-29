package Bucles;
import java.util.Scanner;
// ACT 16 - Crear la tabla de multiplicar de un número.
public class tablasMultiplicar {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca su número: ");
        byte numInput = input.nextByte();
        int numX = 1;
        do {
            System.out.println(numInput + " x " + numX + " = " + numInput*numX);
            numX = numX + 1;
        }while(numX <= 10);
    }
}
