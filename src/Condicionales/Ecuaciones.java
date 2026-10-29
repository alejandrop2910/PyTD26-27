package Condicionales;

import java.util.Scanner;

public class Ecuaciones {
    static void main() {
        Scanner input = new Scanner(System.in);
        // Entradas
        System.out.print("Introduzca el valor 'a': ");
        int a = input.nextInt();
        System.out.print("Introduzca el valor 'b': ");
        int b = input.nextInt();
        System.out.print("Introduzca el valor 'c': ");
        int c = input.nextInt();
        int d = b * b - 4 * a * c;
        // Condicionales
        if (d < 0) {
            System.out.println("El número de la raíz es negativo, no hay solución.");
        } else if (d == 0) { // Doble símbolo de igual es comparación, mientras que un igual es asignación.
            float x = (float) -b / (2 * a);
            System.out.println("Tiene una solución: " + x);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Tiene dos soluciones: \n" + "+" + x1 + "\n" + x2);
        }
    }
}