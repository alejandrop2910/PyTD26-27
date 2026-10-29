package Bucles;
import java.util.Scanner;
public class tiposNumeros {
    static void main() {
        // Entrada de datos
        Scanner input = new Scanner(System.in);
        // Variables
        int numPares = 0, numImpares = 0;
        int numPos = 0, numNeg = 0;
        // Bucles
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduzca su número " + i + ": ");
            int num1 = input.nextInt();
            // Condicionales
            if (num1 >= 0) {
                numPos++;
            } else {
                numNeg++;
            }
            if (num1 % 2 == 0) { // Comprobar si es par
                numPares++;
            } else {
                numImpares++;
            }
        }
        System.out.println("Pares: " + numPares + '\n' + "Impares: " + numImpares
                + '\n' + "Positivos: " + numPos + '\n' + "Negativos: " + numNeg);
    }
}

