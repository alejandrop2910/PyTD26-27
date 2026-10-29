package Bucles;
import java.util.Scanner;
public class sumaNumeros {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de números que desee sumar: ");
        int numC = input.nextInt();
        int suma = 0;
        for(int i=1; i<=numC; i++){ // i++ = i=i+1
            System.out.print("Número "+i+": ");
            int x = input.nextInt();
            suma = suma + x;
        }
        System.out.println("Suma total: " + suma);
    }
}
