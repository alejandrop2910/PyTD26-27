package String;

import java.util.Scanner;

public class Capicua {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca su palabra: ");
        String str = input.next();

        boolean capicua = true;
        for (int i=0; i<str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                capicua = false;
            }
            else {
                capicua = true;
            }
        }

        System.out.println("¿Es capicúa? - " + capicua);
    }
}
