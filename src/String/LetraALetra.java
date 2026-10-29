package String;

import java.util.Scanner;

public class LetraALetra {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca su palabra: ");
        String str = input.next();

        System.out.println("Palabra completa: " + str);

        System.out.println("Palabra letra a letra: ");
        for (int i=0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println("Palabra letra a letra AL REVÉS: ");
        for (int i = str.length()-1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }
    }
}
