package Poo.herencia;

public class Empleado extends Persona{
    // Atributos
    int numero_legajo;
    String cargo;
    String sueldo;

    // Constructor

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int numero_legajo, String cargo, String sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numero_legajo = numero_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Getters & Setters

    public int getNumero_legajo() {
        return numero_legajo;
    }

    public void setNumero_legajo(int numero_legajo) {
        this.numero_legajo = numero_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
}
