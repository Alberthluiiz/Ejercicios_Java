package Ecuacion;

import java.util.Scanner;

public class Ecuacion {
    public static void main(String args[]){
        int v, r;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para resolver ecuación");

        System.out.println("Ingrese el valor de x: ");
        v = entrada.nextInt();

        r = (v*v)-3+v+7;

        System.out.println("La respuesta de la ecuación es: " +  r);
    }
}


