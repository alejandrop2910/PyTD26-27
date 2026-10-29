package Bucles;
import java.util.Scanner;
public class Producto {
    static void main() {
        // Scanner y variables
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca su primer número: ");
        int num1 = input.nextInt();
        System.out.print("Introduzca su segundo número: ");
        int num2 = input.nextInt();
        // Bucles
        int prod = 0;
        int i = 1;
        while(i<=num1){
            prod = prod + num2;
            i = i + 1;
        }
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + prod);
    }
}
