package FormularioJFrame;
import javax.swing.*;

// Clase
public class Formulario extends JFrame {
    //Constructor
    public Formulario(){
        setLayout(null);
    }

    public static void main(String args[]){
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(400,200,800,550);
        formulario1.setVisible(true);
        // Lineas de codigo para que no permita editar el tamaño
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}
