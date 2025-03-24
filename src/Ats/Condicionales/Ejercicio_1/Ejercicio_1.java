/*Ejercicio 1: Programa que lea un número entero y muestre si el número es múltiplo de 10.*/

package Ats.Condicionales.Ejercicio_1;

import javax.swing.*;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " Es multiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número" + numero + " no es multiplo de 10");
        }
    }
}




















