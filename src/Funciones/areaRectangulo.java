package Funciones;
import java.util.Scanner;

public class areaRectangulo {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el valor A: ");
        int a = input.nextInt();
        System.out.print("Introduzca el valor B: ");
        int b = input.nextInt();
        System.out.printf("El área del rectángulo es: %d cm", calculoArea(a, b));
    }
    public static int calculoArea(int a, int b) {
        return a * b;
    }
}