/*Ejercicio 3: Guillermo tienen N dólares
Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que
tienen entre los tres.*/

package Ats.Introduccion.Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Atributos
        float guillermo, luis, juan, total;

        System.out.println("Digite la cantidad de dinero que tiene Guillermo: ");
        guillermo = leer.nextFloat();

        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        total = guillermo + luis + juan;

        System.out.println("La cantidad de dinero entre los 3 es: " + juan);
    }
}
