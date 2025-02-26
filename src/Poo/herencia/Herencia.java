package Poo.herencia;

public class Herencia {
    public static void main(String[] args) {
        // Polimorfismo
        Persona vector [] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();

        // Obejto
        Persona objPersona = new Persona();
        Consultor objConsultor = new Consultor();

        objPersona = objConsultor;

    }
}
