package MatricesDinamicas;

import java.util.Scanner;

public class MatricesDinamicas {
    public static void main(String args[]) {
        int filas = 0, columnas = 0, contador = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Programa Matrices Dinamicas");
        System.out.println("");

        System.out.print("Ingrese el numero de filas: ");
        filas = entrada.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        columnas = entrada.nextInt();

        int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                numeros[j][i] = contador;
                contador++;
                System.out.print("[" + numeros[j][i] + "] ");
            }
            System.out.println();
        }
    }
}
