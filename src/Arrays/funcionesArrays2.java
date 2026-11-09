package Arrays;
public class funcionesArrays2 {
    static void main() {
        int [] a = {4, 7, 9, 10};
        int [] b = {4, 7, 9, 10, 19};
        System.out.printf("¿Son iguales los arrays? %b.", Iguales(a, b));
    }
    public static boolean Iguales(int[] a, int[] b) {
       if (a.length != b.length) {return false;}
       else {
           for (int i=0; i<b.length; i++) {
               if (a[i] != b[i]) {return false;}
           } return true;
       }
    }
}