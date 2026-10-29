package Variables;

import java.util.Scanner;

public class VariablesAct2 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        String name = input.nextLine();

        System.out.print("Introduzca su edad: ");
        byte age = input.nextByte();

        System.out.print("Introduzca su altura: ");
        float height = input.nextFloat();

        System.out.print("¿Eres mayor de edad? ");
        boolean adult = false;

        System.out.print("Nombre " + name + "\n" + "Edad: " + age + " años" + "\n" + "Altura: " + height
        + "\n" +
                "Mayor de edad: " + adult);

    }
}
