package Funciones;

public class funcionesRetorno {
    static void main() {

    }

    public static int sumaNumeros(int num1, int num2) {
        return num1 + num2;
    }

    public static float addIVA(float price){
        float priceIVA = price * 1.21f;
        return priceIVA;
    }

    public static float addIVA2(float price, float IVA){
        float priceIVA = price * IVA / 100;
        return priceIVA;
    }

    public static boolean numeroPar(int num){
        if(num%2 == 0){
            return true;
        }
        return false;
    }

    public static String Mayusculas(String m){
        return m.toUpperCase();
    }

}