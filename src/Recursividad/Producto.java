package Recursividad;

public class Producto {
    static void main() {
        System.out.printf("El producto de %d x %d es: %d.%n", 4,3, (prod(4,3)));
        System.out.printf("El producto RECURSIVO de %d x %d es: %d.%n", 4, 3, (prodR(4,3)));
    }
    public static int prod(int a, int b) {
        int p=1;
        while (b>=1) {
            p = p+a;
            b--;
        } return p;
    }
    public static int prodR(int a, int b) {
        if (b==1) {return a;}
        else {return a + prodR(a, b-1);}
    }
}