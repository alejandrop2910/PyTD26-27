package String;

public class printF {
    static void main() {
        String name = "Alejandro Parra";
        byte age = 17;
        float height = 1.75f;
        String curso = "1ro de Bachillerato, Grupo F";
        boolean adult = false;
        System.out.printf("Hola! Soy %s, y tengo %d años. %nMido %f metros de altura y voy a %s." +
               "%n¿Soy adulto? %b", name, age, height, curso, adult);
    }
}
