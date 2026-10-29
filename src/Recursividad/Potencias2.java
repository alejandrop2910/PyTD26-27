package Recursividad;

public class Potencias2 {
    static void main() {
        System.out.printf("La potencia recursiva de %d elevado a %d es %d.", 2, 4,
                potenciasRecursivas2(2, 4));
    }

    public static int potenciasRecursivas2(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        else if (exp % 2 == 0) {
            return potenciasRecursivas2(base, exp / 2) * potenciasRecursivas2(base, exp / 2);
        }
        else {
            return potenciasRecursivas2(base, exp / 2) * potenciasRecursivas2(base, exp / 2) * base;
        }
    }

}