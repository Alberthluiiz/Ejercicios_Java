/*Ejercicio 7: Pedir tres números y mostrarlos ordenados de mayor a menor.*/

package Ats.Condicionales.Ejercicio_7;

import javax.swing.*;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if ((num1 > num2) && (num2 > num3)){
            JOptionPane.showMessageDialog(null, "Orden: " + num1 + "-" + num2 + "-" + num3);
        }
        else if ((num1 > num3) && (num3 > num2)){
            JOptionPane.showMessageDialog(null, "Orden: " + num1 + "-" + num3 + "-" + num2);
        }
        else if ((num2 > num1) && (num1 > num3)) {
            JOptionPane.showMessageDialog(null, "Orden: " + num2 + "-" + num1 + "-" + num3);
        }
        else if ((num2 > num3) && (num3 > num1)){
            JOptionPane.showMessageDialog(null, "Orden: " + num2 + "-" + num3 + "-" + num1);
        }
        else if ((num3 > num1) && (num1 > num2)){
            JOptionPane.showMessageDialog(null, "Orden: " + num3 + "-" + num1 + "-" + num2);
        }
        else {
            JOptionPane.showMessageDialog(null,"Orden: " + num3 + "-" + num2 + "-" + num1);
        }
    }
}
