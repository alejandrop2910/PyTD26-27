package Bucles;

public class ejemploBreak {
    static void main() {
        for (byte i=0; i<=10; i++) {
            if (i==4) {
                break; // Escapa del bucle
            }
            System.out.println(i);
        }
    }
}