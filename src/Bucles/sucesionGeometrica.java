package Bucles;
import java.util.Scanner;
public class sucesionGeometrica {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = input.nextInt();
        int p = 1;
        for(int i = 0 ; i < num; i++){
            p = p * 2;
            System.out.println("2 elevado a " + i + ": " + p);
        }
    }
}