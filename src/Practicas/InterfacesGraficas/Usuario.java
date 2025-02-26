package InterfacesGraficas;

import javax.swing.*;
import java.awt.event.*;

public class Usuario extends JFrame implements ActionListener {
    private JTextField textField1;
    private JButton button1;
    private JLabel label1;

    // Creamos el contructor
    public Usuario() {
        setLayout(null);
        label1 = new JLabel("Usuario: ");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        textField1 = new JTextField("");
        textField1.setBounds(120, 17, 150, 20);
        add(textField1);

        button1 = new JButton("Aceptar");
        button1.setBounds(10, 80, 100, 30);
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == button1) {
            String texto = textField1.getText();
            setTitle(texto);
        }
    }

    public static void main(String args[]) {
        Usuario usuario1 = new Usuario();
        // Ubicacion de coordenadas
        usuario1.setBounds(0, 0, 300, 150);
        // Linea para poder mostrar el diseño creado
        usuario1.setVisible(true);
        // Linea para que no peuda modificar el tamaño
        usuario1.setResizable(false);
        // Linea para que la ventana se muestre en la mitad de la pantalla
        usuario1.setLocationRelativeTo(null);
    }
}
