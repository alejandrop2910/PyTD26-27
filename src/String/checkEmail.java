package String;
import java.util.Scanner;

public class checkEmail {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca su correo electrónico: ");
        String email = input.nextLine();

        int posAt = email.indexOf('@');
        int posDot = email.indexOf('.');
        int length = email.length();

        int emailName = posAt;
        int domain = posDot - posAt - 1;
        int extension = length - posDot - 1;

        char letter1 = email.charAt(0);

        if (posAt != -1 && posDot != -1 &&
                emailName >=3 && domain >=3 && (extension == 2 || extension == 3)
        && Character.isLetter(letter1)) {
            System.out.print("Su correo electrónico es válido.");
        }
        else {
            System.out.print("Su correo electrónico es inválido.");
        }
    }
}