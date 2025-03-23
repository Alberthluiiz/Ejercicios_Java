package Ats.Introduccion;

import javax.swing.*;

public class Introduccion {
    public static void main(String[] args) {
        // Atributos
        String cadena;
        int entero;
        char letra;
        double decimal;

        // Ingreso de datos
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        // Muestra de datos
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El entero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);



    }
}
