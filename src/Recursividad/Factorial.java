package Recursividad;
import java.util.Scanner;

public class Factorial {

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca su número: ");
        int n = input.nextInt();

        System.out.printf("El factorial de %d es %d.", n, factorial(n));
        System.out.printf('\n' + "El factorial recursivo de %d es %d.", n, factorialRecursivo(n));
    }

   public static long factorial (long n) {
       long f = 1;
       while (n > 1) {
           f = f * n;
           n = n - 1;
       }
       return f;
   }

   public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1; // Caso base, conocemos la solución. (0! == 1)
        }
        else {
            return n * factorialRecursivo(n - 1); // Caso recursivo.
        }
   }

}