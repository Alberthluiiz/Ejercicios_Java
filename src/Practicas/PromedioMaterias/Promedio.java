package PromedioMaterias;

public class Promedio {
    public static void main(String args[]) {
        int matematicas = 5;
        int biologia = 5;
        int quimica = 5;
        int promedio = 0;

        promedio = (matematicas + biologia + quimica) / 3;

        // Condicion para ver si pasa el año

        if (promedio >= 6) {
            System.out.println("El alumno aprobo con una nota de " + promedio);
        } else {
            System.out.println("El alumno reprobo con una nota de " + promedio);
        }
    }
}
