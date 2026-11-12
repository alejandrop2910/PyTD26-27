package Arrays;

public class array2D {
    static void main() {
        float [][] notas = {
                {6.5f, 9.8f, 10},
                {7.8f, 10, 9},
                {5.1f, 9, 10},
        };
        printArray2DF(notas);
        System.out.println();
        printArray2DC(notas);
        System.out.println();
        printDiagonal(notas);
    }
    public static void printArray2DF(float [][] array) {
            for(int i=0; i<array.length; i++) {
                System.out.printf("[%d]:\t", i);
                for (int j = 0; j < array[0].length; j++) {System.out.printf("%f\t", array[i][j]);}
                System.out.println();
            }
    }
    public static void printArray2DC(float [][] array) {
        for(int j=0; j<array[0].length; j++) {
            System.out.printf("[%d]:\t", j);
            for(int i=0; i<array.length; i++) {
                System.out.printf("%f\t", array[i][j]);
            }
            System.out.println();
        }
    }
    public static void printDiagonal(float [][] array) {
        for(int i=0; i<array.length; i++) {
            System.out.printf("[%d,%d]:\t", i, i);
            System.out.printf("%f\t", array[i][i]);
        }
    }
}