package Bucles;

public class ejemploContinue {
    static void main() {
        for (int i=0; i<=10; i++) {
            if (i==4) {
                continue;
            }
            System.out.println(i);
        }
    }
}