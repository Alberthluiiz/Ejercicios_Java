package Boton;

import Formularios.Formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton extends JFrame implements ActionListener {
    JButton button1;
    //Creamos un constructor
    public Boton(){
        setLayout(null);
        button1 = new JButton("Cerrar");
        button1.setBounds(300,250,100,30);
        add(button1);
        //Agregamos un evento
        button1.addActionListener(this);
    }

    // Programamos el evento
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == button1){
            System.exit(0);
        }
    }
    //Diseño de interfaz grafica
    public static void main(String args[]){
        Boton button1 = new Boton();
        button1.setBounds(0,0,450,350);
        button1.setVisible(true);
        button1.setResizable(false);
        button1.setLocationRelativeTo(null);
    }
}

