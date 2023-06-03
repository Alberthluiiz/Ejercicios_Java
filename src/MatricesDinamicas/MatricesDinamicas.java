package MatricesDinamicas;

import java.util.Scanner;

public class MatricesDinamicas {
    public static void main(String args[]){
        int filas = 0;
        int columnas = 0;
        int contador = 1;

        Scanner entrada = new Scanner(System.in);

        int numeros[][] = new int[filas][columnas];

        System.out.println("Programa Matrices Dinamicas");
        System.out.println("");

        System.out.println("Ingrese el numero de filas: ");
        filas = entrada.nextInt();

        System.out.println("Ingrese el numero de columnas: ");
        columnas = entrada.nextInt();


        for (int j = 0 ; j < filas ; j++){
            for (int i = 0 ; i < columnas ; i++){
                numeros[j][i] = contador;
                contador++;
                System.out.println("[" + numeros[j][i] + "]");
            }
            System.out.println();
        }
    }
}
