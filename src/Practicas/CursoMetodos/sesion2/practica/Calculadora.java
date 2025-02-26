package CursoMetodos.sesion2.practica;

import java.security.interfaces.DSAPublicKey;

public class Calculadora {

    //METODO SUMAR
    public int sumaNumeros(int numUno, int numDos) {
        return numUno + numDos;
    }
    //METODO RESTAR
    public int restaNumeros(int numUno, int numDos){
        return numUno - numDos;
    }
    //METODO MULTIPLICAR
    public int multiplicarNumeros(int numUno, int numDos){
        return numUno * numDos;
    }
    // METODO DIVIDIR
    public int dividirNumeros(int numUno, int numDos) {
        if (numDos == 0 ){
            System.out.println("Error, no se puede dividir por cero.");
            return 0;
        }
        return numUno / numDos;
    }

}
