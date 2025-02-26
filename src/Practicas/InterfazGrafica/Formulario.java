package InterfazGrafica;

import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {
    private JLabel label1;

    public Formulario() {
        // setlayout(null);
        label1 = new JLabel("Practica en Java, Luis Guillen");
        label1.setBounds(10, 20, 200, 300);
        add(label1);
    }

    public static void main(String args[]) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 400, 300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}
