/*Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones*/
package Ats.Ejercicio_1;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Atributos
        float nota1, nota2, nota3, suma;

        Scanner leer = new Scanner(System.in);

        // Titulo
        System.out.println("PROGRAMA CALIFICACIONES DE 3 NOTAS");

        // Ingreso de datos
        System.out.print("Ingreso nota 1: ");
        nota1 = leer.nextFloat();
        System.out.print("Ingrese nota 2: ");
        nota2 = leer.nextFloat();
        System.out.print("Ingrese nota 3: ");
        nota3 = leer.nextFloat();

        // Proceso
        suma = (nota1 + nota2 + nota3) / 3;

        // Respuesta
        System.out.println("La suma de las calificaciones es: " + suma);

    }
}
