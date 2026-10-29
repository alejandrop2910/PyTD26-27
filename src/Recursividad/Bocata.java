package Recursividad;

public class Bocata {
    static void main() {
        String bocata = "Bocatademortadela";
        Comer(bocata);
    }
    public static String Morder(String s) {return s.substring(0, 1);}
    public static boolean Comestible(String s) {return s.length() ==1;}
    public static void Tragar(String s) {
        System.out.print(s);
        System.out.println(": ¡Ñam!");
    }
    public static String Quitar(String b, String t) {return b.replaceFirst(t, "");}
    public static void Comer(String bocata) {
        if (Comestible(bocata)) {Tragar(bocata);}
        else {
            String trozo = Morder(bocata);
            String resto = Quitar(bocata, trozo);
            Comer(trozo);
            Comer(resto);
        }
    }
}