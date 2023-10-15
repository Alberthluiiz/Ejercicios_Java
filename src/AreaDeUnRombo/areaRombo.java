package AreaDeUnRombo;

import java.util.Scanner;

public class areaRombo {
    /**
     * @param args
     */
    public static void main(String args[]) {

        /* Declaración de variables */
        int d1, d2, a;

        Scanner leer = new Scanner(System.in);

        System.out.println("\n\t =================");
        System.out.println("\t ÁREA DE UN ROMBO");
        System.out.println("\t =================");

        System.out.println();

        System.out.print("\t Ingrese el primer dato: ");
        d1 = leer.nextInt();

        System.out.print("\t Ingrese el segundo dato: ");
        d2 = leer.nextInt();

        /* Proceso */

        a = d1 * (d2 / 2);

        /* Muestra Resultado */

        System.out.println("El area del rombo es: " + a);

    }
}
