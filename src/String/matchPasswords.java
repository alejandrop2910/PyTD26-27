package String;

import java.util.Scanner;

public class matchPasswords {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca la contraseña 1: ");
        String pass1 = input.next();
        System.out.print("Introduzca la contraseña 2: ");
        String pass2 = input.next();
        if(pass1.equals(pass2)){
            System.out.println("Sus contraseñas son iguales.");
        }
        else{
            System.out.println("Sus contraseñas no son iguales.");
        }

    }
}
