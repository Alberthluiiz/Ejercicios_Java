package Poo.Logica;

public class Alumno {
    // Atributos
    int id;
    String nombre;
    String apellido;

    // Constructores vacio
    public Alumno() {
    }

    // Constructor lleno
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters o Setters
    // Gett -> Traer / Set -> Establecer valores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Metodos
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y mi nombre es:");
    }

    public void saberAprobado(double calificacion){
        if (calificacion >= 6){
            System.out.println("Materia Aprobada");
        }
        else
        {
            System.out.println("Materia Reprobada");
        }
    }

}
