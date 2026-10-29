package Recursividad;

public class girarPalabras {
    static void main() {System.out.printf("La palabra '%s' girada es: %s.", "Hola", girarP("hola"));}
    public static String girarP(String p) {
        if (p.length() == 1) {return p;}
        else {
            char primera = p.charAt(0);
            String subp = p.substring(1);
            return girarP(subp) + primera;
        }
    }
}