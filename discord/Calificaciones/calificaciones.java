package discord.Calificaciones;

import java.util.Scanner;

public class calificaciones {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int numone = 0, numtwo = 0, numthree = 0, result = 0;

        System.out.print("¿Cual es tu nombre?: ");
        nombre = in.nextLine();
        System.out.println("");
        System.out.print("Ingresa primero valor para la suma: ");
        numone = in.nextInt();

        System.out.print("Ingresa segundo valor para la suma: ");
        numtwo = in.nextInt();

        System.out.print("Ingresa segundo valor para la suma: ");
        numthree = in.nextInt();

        System.out.println("");
        result = numone + numtwo + numthree;

        System.out.println("Hola, " + nombre + "\n La suma de los tres numeros es: " + result);
    }
}
