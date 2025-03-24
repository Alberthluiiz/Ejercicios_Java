/*Ejercicio 3: Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.*/

package Ats.Condicionales.Ejercicio_3;

import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        char letra;

        // El charAr(0), guarda el primer caracter
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        // Character.isUpperCase(letra) -> Nos permite saber si una letra en Mayuscula o Minuscula
        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra [ " + letra + " ] es Mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null, "La letra [ " + letra + " ] es Minuscula");
        }

    }
}
