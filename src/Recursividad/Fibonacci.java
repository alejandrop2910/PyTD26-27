package Recursividad;

public class Fibonacci {

    static void main() {
        System.out.printf("El Fibonacci de %d es %d.", 7, fibo(7));
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

}
