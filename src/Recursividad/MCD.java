package Recursividad;
import java.util.Scanner;

public class MCD {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca su número A: ");
        int a = input.nextInt();
        System.out.print("Introduzca su número B: ");
        int b = input.nextInt();
        System.out.printf("El Máximo Común Divisor de %d y %d es: %d.", a, b, maxComDiv(a, b));
        System.out.printf('\n' + "El Máximo Común Divisor RECURSIVO de %d y %d es: %d.", a, b, mcdR(a, b));
    }
    public static int maxComDiv(int a, int b) {int m = minimo(a, b); while(a%m!=0 || b%m!=0) {m--;} return m; }
    public static int minimo(int a, int b) {return Math.min(a, b);}
    public static int maximo(int a, int b) {return Math.max(a, b);}
    public static int mcdR(int a, int b) {
        int maxAB = maximo(a, b);
        int minAB = minimo(a, b);
        int resto = maxAB % minAB;
        if (resto == 0) {return minAB;}
        else {return mcdR(minAB, resto);}
    }
}