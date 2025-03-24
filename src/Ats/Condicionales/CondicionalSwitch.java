/*
La sentencia switch
        switch(dato){
    case 1: Instrucciones 1;
            break;
    case 2: Instrucciones 2;
            break;
    ...
    case n: Instrucciones N;
            break;
    default: CasoContrario;
             break;
    }
*/

package Ats.Condicionales;

import javax.swing.*;

public class CondicionalSwitch {
    public static void main(String[] args) {
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 - 5: "));

        switch ( dato ){
            case 1: JOptionPane.showMessageDialog(null, "Esta es la opc 1");
            break;
            case 2: JOptionPane.showMessageDialog(null, "Esta es la opc 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "Esta es la opc 3");
            break;
            case 4: JOptionPane.showMessageDialog(null, "Esta es la opc 4");
            break;
            case 5: JOptionPane.showMessageDialog(null, "Esta es la opc 5");
            break;
            default: JOptionPane.showMessageDialog(null, "El numero no esta en el rango de 1 - 5");
        }
    }
}




































