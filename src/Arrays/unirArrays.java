package Arrays;
public class unirArrays {
    static void main() {
        int[] a = {4, 3, 7, 1};
        int[] b = {8, 9, 10};
        orderAsc(a);
        ejemploArrays.imprimirArray(a);
    }
    public static int[] Cat(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        for (int i = 0; i < array.length; i++) {
            if (i < a.length) {array[i] = a[i];}
            else {array[i] = b[i - a.length];}
        }
        return array;
    }
    public static int[] Zip(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {array[i] = a[i / 2];}
            else {array[i] = b[i / 2];}
        }
        return array;
    }
    public static void orderAsc(int[] a) {
        boolean changes;
        do {
            changes = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    changes = true;
                }
            }
        } while (changes);
    }
}