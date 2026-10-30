package Arrays;

public class medianaArtimetica {
    static void main() {
        int[] nums = {6, 12, 18, 24, 30};
        System.out.print("Mediana aritmética: " + Mediana(nums));
    }
    public static float Mediana(int[] array) {
        float total = 0;
        for(int i=0; i<array.length; i++) {total += array[i];}
        return total / array.length;
    }
}