package Arrays;

public class printINT {
    public static void imprimirArrayINT2D(int[][] array) {
        for(int i=0; i<array.length; i++) {
            System.out.printf("[%d]:\t", i);
            for(int j=0; j<array[0].length; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }
    }
}
