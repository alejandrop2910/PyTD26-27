package Secuenciales;

import java.util.Scanner; // Importa clase "Scanner"
import static java.lang.Math.PI; // Importa clase "PI"

public class Area {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el radio: "); // Imprime un mensaje que pide el radio
        int rad = input.nextInt(); // Declara la variable "rad" y pide el radio del círculo
        double area = PI * rad * rad; // Asigna más espacio en memoria para la variable "area" y la declara
        System.out.println("Resultado: " + area + " cm"); // Imprime el mensaje con el resultado del área

    }

}
