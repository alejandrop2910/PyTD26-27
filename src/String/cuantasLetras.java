package String;

import java.util.Scanner;

public class cuantasLetras {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca su palabra: ");
        String str = input.next();
        int n = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='A' || str.charAt(i)=='a'){
                n++;
            }
        }
        System.out.println("Número de letras A: " + n);
    }
}