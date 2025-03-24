/*
La sentencia if:
        if ( Condicional ) {
            Instrucción
        }
        else {
            Instrucción
        }
*/

package Ats.Condicionales;

import javax.swing.*;

public class Condicional_If {
    public static void main(String[] args) {

        numeroIgualDato();
        numeroMayorMenor();
    }


    public static void numeroIgualDato(){
        // Atributos
        int numero , dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        if (numero != dato) {
            JOptionPane.showMessageDialog(null, "El número es diferente de: 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número es: 5");
        }
    }

    public static void numeroMayorMenor(){
        int numero , dato = 5;

        JOptionPane.showMessageDialog(null,"Programa Número Mayor");

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        if (numero > dato) {
            JOptionPane.showMessageDialog(null, "El número es mayor a: 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número es menor a: 5");
        }
    }


}

/*
== : Igualdad
!= : Diferencia
> : Mayor
>= : Mayor o igual
< : Menor
<= : Menor o igual
* */


































