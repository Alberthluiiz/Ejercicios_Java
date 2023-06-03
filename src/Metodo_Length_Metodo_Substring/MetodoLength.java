        /*Realizar un programa que solicite desde teclado una cadena de caracteres, posteriormente
        el programa debe indicar a traves de un mensaje en pantalla, la cantidad de caracteres que
        pose dicha cadena. Finalmente el programa debe de preguntar al usuario, ¿que parte de
        la cadena desea obtener?*/
package Metodo_Length_Metodo_Substring;

        import java.util.Scanner;

        public class MetodoLength {
    public static void main(String args[]){

        String cadena_original = "", cadena_substraccion = "";
        int num_caracteres = 0, desde = 0, hasta = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa Cadena de Caracteres");
        System.out.println("");

        System.out.print("Ingrese una cadena de caracteres: ");
        cadena_original = entrada.nextLine();

        num_caracteres = cadena_original.length();

        System.out.println("La cadena de caracteres " + cadena_original + " tiene " + num_caracteres + " caracteres");

        System.out.print("¿Desde que caracter deseas obtener la nueva cadena?: ");
        desde = entrada.nextInt();

        System.out.print("¿Hasta que caracter deseas obtener la nueva cadena?: ");
        hasta = entrada.nextInt();

        cadena_substraccion = cadena_original.substring(desde, hasta);
        System.out.println("La nueva cadena es: " + cadena_substraccion);
    }
}
