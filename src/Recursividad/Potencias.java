package Recursividad;

public class Potencias {

    static void main() {
        System.out.printf("El número %d elevado a %d es %d.", 2, 4, potenciasRecursivas(2, 4));
    }

    public static int potenciasRecursivas(int base, int exp){
        if (exp == 0) {
            return 1;
        }
        else {
            return base * potenciasRecursivas(base, exp - 1);
        }
    }

}