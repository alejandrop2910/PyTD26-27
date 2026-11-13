package Arrays;
public class funcionesArrays4 {
    static void main() {
        int[][] a = {
                {3,8,9,1},
                {2,1,5,4},
                {1,1,6,2}
        };
        int[][] b = {
                {5,10,11,3},
                {4,3,7,6},
                {3,3,8,4}
        };
        int[][] suma = sumaArrays2D(a, b);
        printINT.imprimirArrayINT2D(suma);
        System.out.println();
        printINT.imprimirArrayINT2D(productoEscalar(9, a));
        System.out.println();
        printINT.imprimirArrayINT2D(productoEscalar(9, b));
    }
    public static int[][] sumaArrays2D(int[][] a, int[][] b) {
        int[][] array = new int[a.length][a[0].length];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                array[i][j] = a[i][j] + b[i][j];
            }
        } return array;
    }
    public static int[][] productoEscalar(int k, int[][] a) {
        int[][] array = new int[a.length][a[0].length];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                array[i][j] = k * a[i][j];
            }
        }
        return array;
    }
    public static boolean comparacionArray2D(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {return false;}
        else {
            for (int i=0; i<a.length; i++) {
                for(int j=0; j>a[0].length; j++) {
                    if (a[i][j] != b[i][j]) {return false;}
                }
            } return true;
        }
    }
}