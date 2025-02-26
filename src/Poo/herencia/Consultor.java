package Poo.herencia;

public class Consultor extends Persona{

    // Atributos
    String nombre_Consultora;
    int numero_Consultor;

    // Contructor
    public Consultor() {
    }

    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String nombre_Consultora, int numero_Consultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_Consultora = nombre_Consultora;
        this.numero_Consultor = numero_Consultor;
    }

    // Getter & Setters

    public String getNombre_Consultora() {
        return nombre_Consultora;
    }

    public void setNombre_Consultora(String nombre_Consultora) {
        this.nombre_Consultora = nombre_Consultora;
    }

    public int getNumero_Consultor() {
        return numero_Consultor;
    }

    public void setNumero_Consultor(int numero_Consultor) {
        this.numero_Consultor = numero_Consultor;
    }
}

