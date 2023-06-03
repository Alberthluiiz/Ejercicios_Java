package Suma;

import java.util.Scanner;

public class Suma {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int numone = 0, numtwo = 0 , result = 0;

        System.out.println("¿Cual es tu nombre?");
        nombre = in.nextLine();

        System.out.print("Ingresa primero valor para la suma: ");
        numone = in.nextInt();

        System.out.print("Ingresa segundo valor para la suma: ");
        numtwo = in.nextInt();

        result = numone + numtwo;

        System.out.println("Hola, " + nombre + "\n La suma de los dos numeros es: " + result);


    }
}
