/*
Ejercicio 7: Construir un programa que, dado un número total de horas,
devuelve el número de semanas, días y horas  equivalentes. Por ejemplo,
dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
*/

package Ats.Introduccion.Ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int horasTrabajadas, semanas, dias, horas;

        System.out.println("Ingrese el número de horas trabajadas: ");
        horasTrabajadas = leer.nextInt();

        semanas = horasTrabajadas / 168;
        dias = horasTrabajadas % 168 / 24;
        horas = horasTrabajadas % 24;

        // mostrar resultados
        System.out.println("El equivalente es:");
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);


    }
}
