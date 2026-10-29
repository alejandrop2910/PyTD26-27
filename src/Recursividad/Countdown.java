package Recursividad;

public class Countdown {

    static void main() {
        countdown(10);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.print("BOOM!");
        }
        else {
            System.out.print(n + ", ");
            countdown(n - 1);
        }
    }

}