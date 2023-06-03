package Formularios;

import javax.swing.*;

public class Formulario extends JFrame{
    private JLabel label1;
    private JLabel label2;

    public Formulario(){
        setLayout(null);
        label1 = new JLabel("Interfaz gráficas");
        label1.setBounds(10,20,300,30);
        add(label1);

        label2 = new JLabel("Version 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }

    public static void main(String args []){
        //Creamos un objeto
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,300,200);
        //Modificar tañao de interfaz
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        //Nos permite mostrar la interfaz en el centro
        formulario1.setLocationRelativeTo(null);
    }
}
