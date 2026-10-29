package Bucles;
import java.util.Scanner;
public class sucesionAritmetica {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = input.nextInt();
        for(int i = 0; i < num; i++){
            int x = 2*i -1;
            System.out.println("X" + i + ": " + x);
        }
    }
}
