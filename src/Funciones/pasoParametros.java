package Funciones;

public class pasoParametros {
    static void main() {
        byte n = 5;
        System.out.println("NM1: " + n);
        sumaUno(n);
        System.out.println("NM2: " + n);
    }
    public static void sumaUno(byte n) {
        System.out.println("NF1: " + n);
        n = (byte) (n + 1);
        System.out.println("NF2: " + n);
    }
}