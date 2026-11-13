package TicTacToe;
import java.util.Scanner;

public class TresEnRaya {
    public enum VALORESPOSIBLES {VACIO, CIRCULO, CRUZ};
    public static VALORESPOSIBLES[][] tablero;
    public enum RESULTADOSPOSIBLES {EN_JUEGO, GANADOR_A, GANADOR_B, EMPATE};
    public static RESULTADOSPOSIBLES resultado;
    public enum TURNOJUGADOR {JUGADOR_A, JUGADOR_B};
    public static TURNOJUGADOR turno;
    public static int numTiradas;

    static void main() {
        Scanner input = new Scanner(System.in);
        inicializarPartida();
        mostrarTablero(tablero);
        while (!partidaAcabada()) {
            hacerTiradas(input, turno, tablero);
            mostrarTablero(tablero);
            resultado = comprobarResultado(tablero);
            turno = cambiarTurno(turno);
        }
    }

    public static void inicializarPartida() {
        tablero = new VALORESPOSIBLES[3][3];
        for(int i=0; i<tablero.length; i++) {
            for(int j=0; j<tablero[0].length; j++) {tablero[i][j] = VALORESPOSIBLES.VACIO;}
        }
        resultado = RESULTADOSPOSIBLES.EN_JUEGO;
        turno = TURNOJUGADOR.JUGADOR_A;
        numTiradas = 0;
    }
    public static void mostrarTablero(VALORESPOSIBLES[][] t) {
        for(int i=0; i<t.length; i++) {
            for(int j=0; j<t[0].length; j++) {
                System.out.print("|");
                switch(t[i][j]) {
                    case VACIO  : System.out.print(" "); break;
                    case CRUZ   : System.out.print("X"); break;
                    case CIRCULO: System.out.print("O");
                }
                if (j == t[0].length - 1) {System.out.print("|");}
            }
            System.out.println();
        }
    }
    public static boolean partidaAcabada() {return false;}
    public static void hacerTiradas(Scanner input, TURNOJUGADOR turno, VALORESPOSIBLES[][] t) {
        int fila, columna;
        do {
            System.out.print("Indique la fila: ");
            fila = input.nextInt();
            System.out.print("Indique la columna: ");
            columna = input.nextInt();
        } while (!tiradaValida(fila, columna, tablero));
        tablero[fila][columna] = (turno == TURNOJUGADOR.JUGADOR_A) ? VALORESPOSIBLES.CRUZ : VALORESPOSIBLES.CIRCULO;
        numTiradas++;
    }
    public static boolean tiradaValida(int fila, int columna, VALORESPOSIBLES[][] t) {
        return (fila >= 0 && fila < 3 &&
                columna >= 0 && columna < 3 &&
                t[fila][columna] == VALORESPOSIBLES.VACIO);
    }
    public static RESULTADOSPOSIBLES comprobarResultado(VALORESPOSIBLES[][] t) {return RESULTADOSPOSIBLES.EN_JUEGO;}
    public static TURNOJUGADOR cambiarTurno(TURNOJUGADOR turno) {return TURNOJUGADOR.JUGADOR_A;}
}