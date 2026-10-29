package Bucles;
import java.util.Scanner;

public class mediaArtimetica {
    static void main() {
        Scanner input = new Scanner(System.in);
        byte total = 0, cantidad = 0;
        while(true) {
            System.out.print("¿Continuar? [S/N]: ");
            char ans = input.next().charAt(0);

            if (ans == 'S' || ans == 's') {
                System.out.print("Introduzca su número: ");
                byte num = input.nextByte();
                total += num;
                cantidad++;
            }
            else {
                break;
            }
        }
        System.out.printf("El total es %d.", total);
        System.out.printf(" La mediana es %d.", total/cantidad);
    }
}