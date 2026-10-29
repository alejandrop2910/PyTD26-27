package Bucles;
// ACT 14 - Bucles para imprimir números del 1 al 100
public class Print1a100 {
    static void main() {
        // For
        for(int i=1; i<=100; i= i+1){
            System.out.print(i + "\n");
        }
        System.out.println();
        // While
        int i = 1;
        while(i<=100){
            System.out.print(i + "\n");
            i = i + 1;
        }
        System.out.println();
        // Do-while
        int j = 1;
        do {
            System.out.print(j + "\n");
            j = j + 1;
        }while(j<=100);

    }
}
