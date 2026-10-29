package Funciones;

public class primeraFuncion{
    static void main(){
        printNumeros();
        printNumerosHasta(10);
        printNumerosDesdeHasta(0, 765);
    }
    public static void printNumeros(){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
    public static void printNumerosHasta(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
    public static void printNumerosDesdeHasta(int a, int b){
        for (int i=1; i<=b; i++){
            System.out.println(i);
        }
    }
}