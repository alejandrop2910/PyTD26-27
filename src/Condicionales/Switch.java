package Condicionales;
import java.util.Scanner;

public class Switch {
    static void main() {
        Scanner input = new Scanner(System.in);
        // Entrada
        System.out.print("Introduzca su grupo de clase: ");
        char group = input.next().charAt(0);
        // Condicionales
        switch (group) {
            case 'A','a': System.out.println("Usted hace Bachillerato Social."); break;
            case 'B','b': System.out.println("Usted hace Bachillerato Científico."); break;
            case 'C','c': System.out.println("Usted hace Bachillerato Humanístico."); break;
            default: System.out.println("Usted hace Bachillerato General.");
        }
    }
}