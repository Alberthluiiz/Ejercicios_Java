/*
Realizar un programa que contenga un vector cuya longitud sea proporcionando por el
usuario, posteriormente solicitar al usuario los numeros, necesarios para llenar todas las
posiciones del vector, es decir, si el usuario solicito un arreglo de 10 posiciones, entonces el
programa debera de solicitar al usuario 10 numeros, y finalmente se debe de imprimir el
arreglo en pantalla de la siguiente manera:

[5] [54] [12] [65] [6] [54] [897]
* */
package VectoresDinamicos;

import java.util.Scanner;

public class VectoresDinamicos {
    public static void main(String args []){
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa Vectores Dinamicos");

        System.out.print("Cuantos numeros desea ingresar: ");
        longitud = entrada.nextInt();

        int numeros[] = new int[longitud];

        for (int i = 0 ; i < numeros.length ; i++){
            System.out.print("Por favor dame el valor #" + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0 ; i < numeros.length ; i++){
            System.out.print("[" + numeros[i] + "] ");
        }
    }
}
