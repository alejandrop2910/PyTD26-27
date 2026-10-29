package Funciones;
import java.util.Scanner;

public class celsiusFahrenheit {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el valor de grados Celsius: ");
        float celsius = input.nextFloat();
        System.out.printf("La temperatura en grados Fahrenheit es %f ºF", conversionFahrenheit(celsius));
    }
    public static float conversionFahrenheit(float celsius) {
        return celsius * (9.0f / 5) + 32;
    }
}
