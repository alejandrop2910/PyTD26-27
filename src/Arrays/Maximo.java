package Arrays;

public class Maximo {
    static void main() {
        int[] nums = {6, 12, 18, 24, 30};
        System.out.print("Máximo: " + Max(nums));
    }
    public static int Max(int[] array) {
        int max = array[0];
        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}