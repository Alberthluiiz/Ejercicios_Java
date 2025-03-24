/*
Ejercicio 5: La calificación final de un estudiante de Informática se calcula con base a las
calificaciones de cuatro aspectos de su rendimiento académico: participación, primer examen parcial,
segundo examen parcial y examen final.     Sabiendo que las calificaciones anteriores entran a la
calificación final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e
imprima la calificación final obtenida por un estudiante.
Participación -> 10%
Primer Examen Parcial -> 25%
Segundo Examen Parcial -> 25%
Examen Final -> 40%
*/
package Ats.Introduccion.Ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Atributos
        float participacion,primerExamenParcial, segundoExamenParcial, examenFinal, notaFinal;

        // Ingreso de datos
        System.out.println("----------------------------");
        System.out.print("Ingrese nota de Participación: ");
        participacion = leer.nextFloat();
        System.out.print("Ingrese nota Primer Examen Parcial: ");
        primerExamenParcial = leer.nextFloat();
        System.out.print("Ingrese nota Segundo Examen Parcial: ");
        segundoExamenParcial = leer.nextFloat();
        System.out.print("Ingrese nota Examen Final: ");
        examenFinal = leer.nextFloat();

        // Proceso
        participacion *= 0.10f;
        primerExamenParcial *= 0.25f;
        segundoExamenParcial *= 0.25f;
        examenFinal *= 0.40f;

        // Suma y total
        notaFinal = participacion + primerExamenParcial + segundoExamenParcial + examenFinal;

        // Resultado
        System.out.println("La calificación final del estudiante es: " + notaFinal);

    }
}
