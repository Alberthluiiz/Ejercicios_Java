package Ats.Operadores;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Atributos
        float numero1 , numero2, suma, resta, multiplicacion, division, resto;

        //Ingreso de Datos
        System.out.print("Digite numero 1: ");
        numero1 = leer.nextInt();
        System.out.print("Digite numero 2: ");
        numero2 = leer.nextInt();

        // Operaciones
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        // Muestra resultados
        System.out.println("La suma de " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("La resta de " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("La multiplicacion de " + numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println("La division de " + numero1 + " / " + numero2 + " = " + division);
        System.out.println("El resto de " + numero1 + " % " + numero2 + " = " + resto);



    }
}
