package Arrays;

public class Ceros {
    static void main() {
        int[] Ceros = {0, 8, 0, 4, 0, 7, 7, 10, 74, 0};
        System.out.print(comprobarCeros(Ceros));
    }
    public static boolean comprobarCeros(int[] array) {
        for(int i=0; i<array.length; i++) {
            if (array[i]!=0) {return false;}
            else {return true;}
        }
    }
}
