package Funciones;

public class pasoParametros2 {
    static void main() {
        String s = "hola";
        System.out.print("SM1: " + s);
        Mayusculas(s);
        System.out.print("SM2: " + s);
    }
    public static void Mayusculas(String s) {
        System.out.println("SF1: " + s);
        s = s.toUpperCase();
        System.out.println("SF2: " + s);
    }
}