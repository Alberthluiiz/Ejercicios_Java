/*Ejercicio 9: Pedir el día, mes y año
de una fecha e indicar si la fecha es correcta.
Suponiendo todos los meses de 30 días.*/

package Ats.Condicionales.Ejercicio_9;

import javax.swing.*;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el Año"));

        if ( (dia >= 1) && (dia <= 30) ){ // Si el dia es correcto
            if ((mes >= 1) && (mes <=12)){ // Si el mes es correcto
                if (año != 0){ // Si el año es correcto
                    JOptionPane.showMessageDialog(null,"La fecha es correcta \n" + "Dia:"+ dia + "\n" + "mes: " + mes + "\n" + "Año: " + año);
                }
                else {
                JOptionPane.showMessageDialog(null,"El Año " + año + " es incorrecto");
                }
            }
            else {
            JOptionPane.showMessageDialog(null,"El mes " + mes + " no es correcto");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "El dia " + dia + " es incorrecta");
        }
    }
}
