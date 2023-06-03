/*1. Realizar un programa que compare dos nombres para verificar que son
        iguales, mostrando un mensaje en pantalla al final que diga: los
        nombres son iguales / los nombres son diferentes.
        Nota: Los nombres debe de introducirlos el usuario desde teclado.*/
package ComparacionNombres;

import java.util.Scanner;

public class Nombres {
    public static void main(String args []){
        String nombreUno = "", nombreDos = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa Comparacion de dos nombres");

        System.out.print("Ingrese el primer nombre: ");
        nombreUno = entrada.nextLine();

        System.out.print("Ingrese segundo nombre: ");
        nombreDos = entrada.nextLine();

        // equals comprara que los nombres sean iguales
        // Con el Ignore Case, no importa si el nombre esta en Mayuscula o en miniscula
        if (nombreUno.equalsIgnoreCase(nombreDos)){
            System.out.println("Los nombres son iguales");
        }else {
            System.out.println("Los nombres ingresados son diferentes");
        }
    }
}


