package Arrays;

public class Minimo {
    static void main() {
        int[] nums = {6, 12, 18, 24, 30};
        System.out.print("Mínimo: " + Min(nums));
    }
    public static int Min(int[] array) {
        int min = array[4];
        for(int i=0; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}