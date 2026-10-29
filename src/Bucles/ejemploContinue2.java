package Bucles;

public class ejemploContinue2 {
    static void divNumeros() {
        for(float i=10; i>=-10; i--){
            if (i == 0) {
                continue;
            }
            System.out.printf("%f : %f %n", i, 1/i);
        }
    }
}