package CursoMetodos.sesion2.practica;

public class MainCalculadora {
    public static void main(String[] args) {

        // Creamos el Objeto
        Calculadora calculadoraObjeto = new Calculadora();

        int numUno = 10;
        int numDos = 0;

        System.out.println("Suma: " + calculadoraObjeto.sumaNumeros(numUno, numDos));
        System.out.println("Resta: " + calculadoraObjeto.restaNumeros(numUno, numDos));
        System.out.println("Multiplicación: " + calculadoraObjeto.multiplicarNumeros(numUno, numDos));
        System.out.println("División: " + calculadoraObjeto.dividirNumeros(numUno, numDos));

    }
}
