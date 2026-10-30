package Arrays;

public class imprimirArray {
    static void main() {
        String[] Nombres = {"Alejandro", "Pedro", "Antonio", "María"};
        int[] nums = {3, 5, 2};

        for(int i=0; i<Nombres.length; i++); // {System.out.print(Nombres[i] + "\t");}
        for(int i=Nombres.length-1; i>=0; i--); // {System.out.println(Nombres[i]);}

        imprimirArray2(Nombres);
        System.out.println("Suma total: " + sumarArray(nums));
    }
    public static void imprimirArray2(String[] array) {
        for(int i=0; i<array.length; i++) {System.out.printf("[%d]: %s%n", i, array[i]);}
    }
    public static int sumarArray(int[] array) {
        int total = 0;
        for(int i=0; i<array.length; i++) {total += array[i];}
        return total;
    }
}
