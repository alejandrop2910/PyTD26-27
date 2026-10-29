package Variables;

public class Variables1 { // Clases en Java siempre comienzan por mayúscula.
    static void main() {
        int edad = 17;
        char letraDni = 'A';
        double total;
        boolean aplicarDescuento;

        double numA = 1e2, numB = 2., numC = .54, numD = 56.34E-45;
        float numFloat = 23.59f;
        System.out.println(numA + numB + numC + numD + numFloat);

        char char1 = '\n'; // Salto de línea
        char char2 = '\"'; // Comilla doble
        String c1 = "Hello World!"; // String simple
        String c2 = "Uno" + "Dos"; // Concatenación
        String c3 = "Línea 1 \n Línea 2"; // Salto de línea
        String c4 = "Col1 \t Col2 \t Col3"; // Tabulación

        System.out.println(c1 + char1 + c2 + char1 + c3 + char1 + c4);

        /* "final" declara una variable definitiva en el programa.
        final int IVA = 21;
        final double PI = 3.1416;
        final String AUTOR = "Pere";

                                                                 */
    }
}

