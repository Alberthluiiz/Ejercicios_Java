package Poo.Logica;

public class POO {
    public static void main(String[] args) {
        // Creacion de Objeto de la Clase Alumno
        Alumno obj = new Alumno();
        Alumno obj2 = new Alumno(5, "Luis", "Guillen");

        System.out.println("El id del alumno 2 es: " + obj2.getId());
        System.out.println("El nombre es: " + obj2.getNombre());
        System.out.println("El apellido es: " + obj2.getApellido());

        obj.setId(8);
        obj.setNombre("Desarrollo Java");
        obj.setApellido("Programming");
        System.out.println("---------------------------------");
        System.out.println("El id del alumno 1 es: " + obj.getId());
        System.out.println("El nombre es: " + obj.getNombre());
        System.out.println("El apellido es: " + obj.getApellido());

        System.out.println("---------------------------------");
        obj2.setId(2001);
        System.out.println("El id del alumno 2 es: " + obj2.getId());
        System.out.println("El nombre es: " + obj2.getNombre());
        System.out.println("El apellido es: " + obj2.getApellido());

    }
}
