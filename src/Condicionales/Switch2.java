package Condicionales;
import java.util.Scanner;

public class Switch2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        // Entrada
        System.out.print("Introduzca su nota: ");
        byte grade = input.nextByte();
        // Condicionales
        switch (grade) {
            case 0,1,2,3,4: System.out.println("Suspendido."); break;
            case 5,6,7,8,9,10: System.out.println("Aprobado."); break;
            default: System.out.println("Valor incorrecto. Han de ser valores del 0 al 10.");
        }
    }
}