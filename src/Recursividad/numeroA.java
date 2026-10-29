package Recursividad;

public class numeroA {
    static void main() {
        numAs("Alejandro");
        numAsRecurs("Alejandro");
    }
    public static int numAs(String s) {
        int n = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='A' || s.charAt(i)=='a') {
                n++;
            }
        }
        return n;
    }
    public static int numAsRecurs(String s) {
        if (s.length()==1 && (s.charAt(0)=='A' || s.charAt(0)=='a')) {
            return 1;
        }
        else if (s.length()==1 && (s.charAt(0)!='A' || s.charAt(0)=='a')) {
            return 0;
        }
        else {
            String primera = String.valueOf(s.charAt(0));
            String subp = s.substring(1);
            return numAsRecurs(primera) + numAsRecurs(subp);
        }
    }
}