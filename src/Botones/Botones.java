package Botones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JFrame implements ActionListener {
    //Creamos los componentes que vamos a usar
    private JButton button1, button2, button3;
    private JLabel label1;

    public Botones(){
        setLayout(null);
        //Diseño de los Botones
        //button 1
        button1 = new JButton("1");
        button1.setBounds(10,100,90,30);
        add(button1);
        button1.addActionListener(this);

        //button 2
        button2 = new JButton("2");
        button2.setBounds(110,100,90,30);
        add(button2);
        button2.addActionListener(this);

        button3 = new JButton("3");
        button3.setBounds(210,100,90,30);
        add(button3);
        button3.addActionListener(this);

        //Diseño de los Label

        label1 = new JLabel("En espera ...");
        label1.setBounds(10,10,300,30);
        add(label1);
    }

    // Creamos los eventos de cada boton
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == button1){
            label1.setText("Has seleccionado el boton 1");
        }if (event.getSource() == button2){
            label1.setText("Has seleccionado el boton 2");
        }if (event.getSource() == button3){
            label1.setText("Has seleccionado el boton 3");
        }
    }

    //Creamos el diseño de la interfaz graficas
    public static void main(String args []){
        Botones botones1 = new Botones();
        System.out.println("PROGRAMA DE LOS 3 BOTONES");
        botones1.setBounds(0,0,350,200);
        botones1.setVisible(true);
        botones1.setResizable(false);
        botones1.setLocationRelativeTo(null);
    }
}
