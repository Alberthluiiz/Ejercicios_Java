/*
Ejercicio 11:  Construir un programa que simule el funcionamiento de una calculadora que puede
realizar las  cuatro operaciones aritméticas básicas (suma, resta, producto y división)
con valores numéricos enteros. El usuario debe especificar la operación con el primer carácter
del primer parámetro de la línea de comandos:
S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división.
*/

package Ats.Condicionales.Ejercicio_11;

import javax.swing.*;

public class Ejercicio_11 {
    public static void main(String[] args) {
        // Variables locales
        int numero1, numero2, suma, resta, mult, division;
        char opc;

        // Ingreso de Datos
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        opc = JOptionPane.showInputDialog("Digite la opcion que desea realizar: ").charAt(0);

        switch (opc){
            case 's':
            case 'S': suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "La suma es: " + suma);
            break;
            case 'r':
            case 'R': resta = numero1 - numero2;
            JOptionPane.showMessageDialog(null, "La resta es: " + resta);
            break;
            case 'p':
            case 'P':
            case 'm':
            case 'M': mult = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "La multiplicación es: " + mult);
            break;
            case 'd':
            case 'D': division = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "La división es: " + division);
            break;
            default:JOptionPane.showMessageDialog(null, "Error, se equivoco de Operacion");
            break;
        }

    }
}


























