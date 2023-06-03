package OperacionesMatematicas;

public class OperacionesMatematicas {
    public static void main(String args[]) {
        // Diseño titulo de programa
        System.out.println("=======================================");
        System.out.println("\n\t Operaciones Matematicas");
        System.out.println("=======================================");

        // Declaracion de variables
        int operacion = 4;
        int num_uno = 8;
        int num_dos = 4;
        int resultado = 0;

        // Estructura condicional anidadas
        if (operacion == 1){
            resultado = num_uno + num_dos;
            System.out.println("La suma de los dos numeros son: " + resultado);
        }else if (operacion == 2){
            resultado = num_uno - num_dos;
            System.out.println("La resta de los dos numeros es: " + resultado);
        }else if (operacion == 3){
            resultado = num_uno * num_dos;
            System.out.println("La multiplicacion de los dos numeros es: " + resultado);
        }else if (operacion == 4){
            resultado = num_uno / num_dos;
            System.out.println("La division de los dos numeros es: " + resultado);
        }else {
            System.out.println("La opcion elegida no existe");
        }
    }
}
