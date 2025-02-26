package Poo.encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        Alumno objAlumno = new Alumno();
        Alumno obj2Alumno = new Alumno(15, "Aprendizaje", "Programming");

        System.out.println("---------------------------");
        System.out.println("Objeto Alumno 2");
        System.out.println("---------------------------");
        System.out.println("id: " + obj2Alumno.getId());
        System.out.println("Nombre: " + obj2Alumno.getNombre());
        System.out.println("Apellido: " + obj2Alumno.getApellido());



    }
}
