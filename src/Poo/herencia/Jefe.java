package Poo.herencia;

public class Jefe extends Persona {

    // Atributos
    int id_jefe;
    String departamento_Jefe;

    // Constructor
    public Jefe() {
    }

    public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int id_jefe, String departamento_Jefe) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamento_Jefe = departamento_Jefe;
    }

    // Getters & Setters

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_Jefe() {
        return departamento_Jefe;
    }

    public void setDepartamento_Jefe(String departamento_Jefe) {
        this.departamento_Jefe = departamento_Jefe;
    }
}
