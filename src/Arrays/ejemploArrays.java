package Arrays;

public class ejemploArrays {
    static void main() {
        int[] Pares = {2, 4, 6, 8, 10};
        String[] Nombres = {"Alejandro"};

        Nombres[0] = "Alex";
        Pares[0] = 12;
        Pares[4] = 16;

        System.out.print(Pares[0]);
    }
    public static void imprimirArray(String [] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("[%d]: %s%n", i, array[i]);
        }
    }
    public static void imprimirArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("[%d]: %s%n", i, array[i]);
        }
    }

    public static void imprimirArray(int[][] suma) {

    }
}