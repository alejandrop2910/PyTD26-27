package Bucles;
// ACT 14 - Bucles para imprimir números del 1 al 100
public class Print100a1 {
    static void main() {
        // For
        for(int i=100; i>=1; i = i - 1){
            System.out.print(i + "\n");
        }
        System.out.println();
        // While
        int i = 100;
        while(i>=1){
            System.out.print(i + "\n");
            i = i - 1;
        }
        System.out.println();
        // Do-while
        int j = 100;
        do {
            System.out.print(j + "\n");
            j = j - 1;
        }while(j>=1);

    }
}
