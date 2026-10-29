package Bucles;

public class tablas1al10 {
    static void main() {
        for(int numA=1; numA <= 10; numA++) {
            System.out.println("Tabla de multiplicar del número " + numA + ":");
            int numB = 1;
            do{
                System.out.println(numA + " x " + numB + " = " + numB * numA);
                numB = numB + 1;
            }while(numB <= 10);
        }
        System.out.println();
    }
}
/*
Número que está siendo multiplicado = numB
Número que multiplica = numA
 */