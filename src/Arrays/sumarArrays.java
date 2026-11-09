package Arrays;
public class sumarArrays {
    static void main() {
        int[] a = {3, 6, 8, 9};
        int[] b = {9, 84, 1, 92};
    }
    public static int[] Suma(int[] a, int[] b) {
        int[] array = new int[a.length];
        for(int i=0; i<array.length; i++) {array[i] = a[i] + b[i];} return array;
    }
}