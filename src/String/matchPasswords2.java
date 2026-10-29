package String;

import java.util.Scanner;

public class matchPasswords2 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca la contraseña 1: ");
        String pass1 = input.next();

        System.out.print("Introduzca la contraseña 2: ");
        String pass2 = input.next();

        boolean iguales = true;
        if (pass1.length()!=pass2.length()) {
            iguales = false;
        }
        else {
            for (int i=0; i<pass1.length(); i++) {
                if (pass1.charAt(i)!=pass2.charAt(i)) {
                    iguales = false;
                }
            }
        }
        System.out.println("¿Las contraseñas son iguales? - " + iguales);
    }
}
