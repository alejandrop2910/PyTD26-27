package String;
import java.util.Scanner;

public class nombreApellidos {
    static void main() {
        // Escáner
        Scanner input = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduzca su nombre completo: ");
        String fullName = input.nextLine();

        int spacePos1 = fullName.indexOf(' ');
        String name = fullName.substring(0, spacePos1);

        int spacePos2 = fullName.lastIndexOf(' ');
        String surn1 = fullName.substring(spacePos1+1, spacePos2);

        String surn2 = fullName.substring(spacePos2+1);

        // Salida de datos
        System.out.printf("Su nombre es: %s.%n", name);
        System.out.printf("Su primer apellido es: %s.%n", surn1);
        System.out.printf("Su segundo apellido es: %s.%n", surn2);
    }
}